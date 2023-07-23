package com.github.guitarScale.fingerboardStracture;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Represents the tuning of a guitar.<br>
 * Arguments for each method start with the 6th bow,<br>
 * but the retained index name and string name are the same.
 */
public class Tuning {
  private int[] tuning;

  /**
   * Constructs a Tuning with the specified array of notes.
   *
   * @param tuning an array of integers representing the tuning of the guitar
   * @throws IllegalArgumentException if the tuning does not consist of 6 notes
   */
  public Tuning(int[] tuning) {
    if (tuning.length != 6) {
      throw new IllegalArgumentException("Tuning must consist of 6 notes.");
    }
    for(int i = 0; i < tuning.length / 2; i++) {
      int temp = tuning[i];
      tuning[i] = tuning[tuning.length - i - 1];
      tuning[tuning.length - i - 1] = temp;
    }
    this.tuning = tuning;
  }

  /**
   * Returns the tuning of the guitar.
   *
   * @return an array of integers representing the tuning of the guitar
   */
  public int[] getTuningStructure() {
    return this.tuning;
  }

  /**
   * Returns a Tuning representing the standard tuning of a guitar.
   *
   * @return a Tuning representing the standard tuning of a guitar
   */
  public static Tuning getStandardTuning() {
    return new Tuning(new int[]{
        KeyBase.fromString("E").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("G").toInt(),
        KeyBase.fromString("B").toInt(),
        KeyBase.fromString("E").toInt()
    });
  }

  /**
   * Returns a Tuning representing the DadGad tuning of a guitar.
   *
   * @return a Tuning representing the DadGad tuning of a guitar
   */
  public static Tuning getDadGad() {
    return new Tuning(new int[]{
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("G").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt()
    });
  }

  /**
   * Returns a string representation of the tuning.
   *
   * @return a string representation of the tuning
   */
  @Override
  public String toString() {
    return Arrays.stream(tuning)
        .mapToObj(Integer::toString)
        .collect(Collectors.joining(", "));
  }
}
