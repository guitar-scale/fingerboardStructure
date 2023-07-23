package com.github.guitarScale.fingerboardStracture.scale;

import java.util.Arrays;

/**
 * Represents a scale.
 */
public class Scale {
  private final int[] structure;
  private final String name;

  /**
   * Constructs a Scale with the specified structure.
   *
   * @param structure an array representing the structure of the scale
   */
  public Scale(int[] structure) {
    this.name = null;
    this.structure = structure;
  }

  /**
   * Constructs a Scale with the specified name and structure.
   *
   * @param name the name of the scale
   * @param structure an array representing the structure of the scale
   */
  public Scale(String name, int[] structure) {
    this.name = name;
    this.structure = structure;
  }

  /**
   * Returns the structure of the scale.
   *
   * @return an array representing the structure of the scale
   */
  public int[] getStructure() {
    return this.structure;
  }

  /**
   * Returns the name of the scale.
   *
   * @return the name of the scale
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns a string representation of the scale.
   *
   * @return a string representation of the scale
   */
  @Override
  public String toString() {
    return Arrays.toString(structure);
  }
}
