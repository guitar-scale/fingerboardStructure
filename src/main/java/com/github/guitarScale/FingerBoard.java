package com.github.guitarScale;

import java.util.Arrays;

/**
 * Represents a guitar fingerboard.
 * <p>
 * Example usage:
 * <pre>
 * {@code
   FingerBoard fb = new FingerBoard(
       24,
       KeyBase.A,
       ScaleBase.Minor,
       new Tuning(　// or Tuning.getStandardTuning();
           new int[]{ // or KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
               KeyBase.fromString("E").toInt(),
               KeyBase.fromString("A").toInt(),
               KeyBase.fromString("D").toInt(),
               KeyBase.fromString("G").toInt(),
               KeyBase.fromString("B").toInt(),
               KeyBase.fromString("E").toInt()
           }
       )
   );
 * }
 * </pre>
 */
public class FingerBoard {

  private final int[][] fretboard;

//  public static void main(String[] argv) {
//    FingerBoard fb = new FingerBoard(
//        24,
//        KeyBase.A,
//        ScaleBase.Minor,
//        new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
//    );
//    System.out.println(fb);
//  }

  /**
   * Constructs a FingerBoard with the specified number of frets, key base, scale name, and tuning.
   *
   * @param numberOfFret the number of frets on the fingerboard
   * @param keyBase the key base of the scale
   * @param scaleName the name of the scale
   * @param tuning the tuning of the guitar
   * @throws IllegalArgumentException if the number of frets is less than 12 or greater than 32
   */
  public FingerBoard(
      int numberOfFret,
      KeyBase keyBase,
      ScaleBase scaleName,
      Tuning tuning
  ) {

    if (numberOfFret < 12 || numberOfFret > 32) {
      throw new IllegalArgumentException("The number of frets should consist of between 12 and 32.");
    }

    int[] scale = Utils.shiftArray(scaleName.getStructure(), keyBase.toInt());
    this.fretboard = new int[6][numberOfFret + 1];

    // Initialize the fretboard
    for (int bow = 0; bow < 6; bow++) {
      for (int fret = 0; fret < (numberOfFret + 1); fret++) {
        this.fretboard[bow][fret] = scale[(fret + (tuning.getTuning()[bow])) % 12];
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
    FingerBoard that = (FingerBoard) obj;
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
