package com.github.guitarScale;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Tuning {
  private int[] tuning;

  public Tuning(int[] tuning) {
    if (tuning.length != 6) {
      throw new IllegalArgumentException("Tuning must consist of 6 notes.");
    }
    this.tuning = tuning;
  }

  public int[] getTuning() {
    return this.tuning;
  }

  // Static methods to get common tunings
  public static Tuning getStandardTuning() {
    return new Tuning(new int[]{0, 7, 3, 10, 5, 0});
  }

  @Override
  public String toString() {
    return Arrays.stream(tuning)
        .mapToObj(Integer::toString)
        .collect(Collectors.joining(", "));
  }
}
