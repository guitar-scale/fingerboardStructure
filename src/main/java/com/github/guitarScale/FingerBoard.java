package com.github.guitarScale;

public class FingerBoard {

  private int[][] fretboard;

  private FingerBoard() {}

  public FingerBoard(
      KeyBase keyBase,
      ScaleBase scaleName,
      Tuning tuning,
      int numberOfFret
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

  public int[][] getStructure() {
    return this.fretboard;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    for (int string = 0; string < 6; string++) {
      for (int fret = 0; fret < 24; fret++) {
        sb.append(fretboard[string][fret]).append(" ");
      }
      sb.append("\n");
    }

    return sb.toString();
  }

}
