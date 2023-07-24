package com.github.guitarScale.fingerboardStracture;

/**
 * Represents the base keys in music.
 */
public enum KeyBase {
  /** index: 0 */
  C,
  /** index: 1 */
  CSharp,
  /** index: 2 */
  D,
  /** index: 3 */
  DSharp,
  /** index: 4 */
  E,
  /** index: 5 */
  F,
  /** index: 6 */
  FSharp,
  /** index: 7 */
  G,
  /** index: 8 */
  GSharp,
  /** index: 9 */
  A,
  /** index: 10 */
  ASharp,
  /** index: 11 */
  B;

  /**
   * Returns a string representation of the key.
   *
   * @return a string representation of the key
   */
  @Override
  public String toString() {
    return name().replace("Sharp", "#");
  }

  public static KeyBase fromString(String key) {
    switch(key) {
      case "C": return C;
      case "C#": return CSharp;
      case "D": return D;
      case "D#": return DSharp;
      case "E": return E;
      case "F": return F;
      case "F#": return FSharp;
      case "G": return G;
      case "G#": return GSharp;
      case "A": return A;
      case "A#": return ASharp;
      case "B": return B;
      default: throw new IllegalArgumentException("Invalid key: " + key);
    }
  }

  /**
   * Creates an array of integers representing the keys of the guitar strings (also known as bows).
   *
   * @param bow1 the key of the first string
   * @param bow2 the key of the second string
   * @param bow3 the key of the third string
   * @param bow4 the key of the fourth string
   * @param bow5 the key of the fifth string
   * @param bow6 the key of the sixth string
   * @return an array of integers representing the keys of the guitar strings
   */
  public static int[] createBowsKey(
      String bow1,
      String bow2,
      String bow3,
      String bow4,
      String bow5,
      String bow6
  ) {
    return new int[]{
        KeyBase.fromString(bow1).toInt(),
        KeyBase.fromString(bow2).toInt(),
        KeyBase.fromString(bow3).toInt(),
        KeyBase.fromString(bow4).toInt(),
        KeyBase.fromString(bow5).toInt(),
        KeyBase.fromString(bow6).toInt()
    };
  }

  /**
   * Returns an integer representation of the key.
   *
   * @return an integer representation of the key
   */
  public int toInt() {
    return this.ordinal();
  }

  public static KeyBase fromInt(int key) {
    return KeyBase.values()[key];
  }

}
