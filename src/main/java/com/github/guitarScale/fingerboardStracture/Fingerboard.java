package com.github.guitarScale.fingerboardStracture;

import com.github.guitarScale.fingerboardStracture.scale.Scale;

import java.util.Arrays;

/**
 * Represents a guitar fingerboard.
 */
public class Fingerboard {

  private final int[][] fretboard;

  private Scale scale;

  private Tuning tuning;

//  public static void main(String[] argv) {
//
//    // initialize guitar scale
//    // or Scale scale = new Scale("myCustomScale", new int[]{2, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}),
//    Scale scale = new Scale(ScaleBox.Minor.getName(), ScaleBox.Minor.getStructure());
//    // initialize tuning
//    Tuning tuning = new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"));
//    // create FingerBoard
//    FingerBoard fb = new FingerBoard(
//        24,
//        KeyBase.E,
//        scale,
//        tuning
//    );
//
//    // diagram
//    System.out.println(fb);
//    // Minor[2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]
//    System.out.println(fb.getScale().getName() + fb.getScale().toString());
//    // [E, A, D, G, B, E]
//    int[] keysInt = fb.getTuning().getTuningStructure();
//    KeyBase[] keysBase = IntStream.rangeClosed(1, keysInt.length)
//        .map(i -> keysInt[keysInt.length - i])
//        .mapToObj(KeyBase::fromInt)
//        .toArray(KeyBase[]::new);
//    System.out.println(Arrays.toString(keysBase));
//
//  }

  /**
   * Constructs a FingerBoard with the specified number of frets, key base, scale name, and tuning.
   *
   * @param numberOfFret the number of frets on the fingerboard
   * @param keyBase      the key base of the scale
   * @param scaleX       the name of the scale
   * @param tuning       the tuning of the guitar
   * @throws IllegalArgumentException if the number of frets is less than 12 or greater than 32
   */
  public Fingerboard(
      int numberOfFret,
      KeyBase keyBase,
      Scale scaleX,
      Tuning tuning
  ) {

    if (numberOfFret < 12 || numberOfFret > 32) {
      throw new IllegalArgumentException("The number of frets should consist of between 12 and 32.");
    }

    this.scale = scaleX;
    this.tuning = tuning;

    int[] scale = Utils.shiftArray(scaleX.getStructure(), keyBase.toInt());
    this.fretboard = new int[6][numberOfFret + 1];

    // Initialize the fretboard
    for (int bow = 0; bow < 6; bow++) {
      for (int fret = 0; fret < (numberOfFret + 1); fret++) {
        this.fretboard[bow][fret] = scale[(fret + (tuning.getTuningStructure()[bow])) % 12];
      }
    }
  }

  /**
   * Returns the structure of the fingerboard.
   *
   * @return a 2D array representing the structure of the fingerboard
   */
  public int[][] getStructure() {
    return this.fretboard;
  }

  /**
   * Returns the scale of the FingerBoard.
   *
   * @return the scale of the FingerBoard
   */
  public Scale getScale() {
    return this.scale;
  }

  /**
   * Returns the tuning of the FingerBoard.
   *
   * @return the tuning of the FingerBoard
   */
  public Tuning getTuning() {
    return this.tuning;
  }

  /**
   * Returns a string representation of the fingerboard.
   *
   * @return a string representation of the fingerboard
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int string = 0; string < fretboard.length; string++) {
      for (int fret = 0; fret < fretboard[0].length; fret++) {
        sb.append(fretboard[string][fret]).append(", ");
      }
      sb.append("\n");
    }

    return sb.toString();
  }

  /**
   * Checks if this FingerBoard is equal to the specified object.
   * <p>
   * The result is true if and only if the argument is not null and is a FingerBoard object that has the same fretboard structure as this object.
   *
   * @param obj the object to compare this FingerBoard against
   * @return true if the given object represents a FingerBoard equivalent to this FingerBoard, false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Fingerboard that = (Fingerboard) obj;
    return Arrays.deepEquals(fretboard, that.fretboard);
  }

  /**
   * Returns a hash code value for this FingerBoard.
   * <p>
   * This method is supported for the benefit of hash tables such as those provided by HashMap.
   * The hash code is computed based on the fretboard structure of this FingerBoard.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Arrays.deepHashCode(fretboard);
  }

}
