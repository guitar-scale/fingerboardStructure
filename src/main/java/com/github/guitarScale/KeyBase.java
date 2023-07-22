package com.github.guitarScale;

/**
 * Represents the base keys in music.
 */
public enum KeyBase {
  E, FSharp, F, G, GSharp, A, ASharp, B, C, CSharp, D, DSharp;

  /**
   * Returns a string representation of the key.
   *
   * @return a string representation of the key
   */
  @Override
  public String toString() {
    switch(this) {
      case E: return "E";
      case FSharp: return "F#";
      case F: return "F";
      case G: return "G";
      case GSharp: return "G#";
      case A: return "A";
      case ASharp: return "A#";
      case B: return "B";
      case C: return "C";
      case CSharp: return "C#";
      case D: return "D";
      case DSharp: return "D#";
      default: throw new IllegalArgumentException();
    }
  }

  /**
   * Returns the KeyBase corresponding to the specified string.
   *
   * @param key a string representing a key
   * @return the KeyBase corresponding to the specified string
   * @throws IllegalArgumentException if the specified string does not represent a valid key
   */
  public static KeyBase fromString(String key) {
    switch(key) {
      case "E": return E;
      case "F#": return FSharp;
      case "F": return F;
      case "G": return G;
      case "G#": return GSharp;
      case "A": return A;
      case "A#": return ASharp;
      case "B": return B;
      case "C": return C;
      case "C#": return CSharp;
      case "D": return D;
      case "D#": return DSharp;
      default: throw new IllegalArgumentException("Invalid key: " + key);
    }
  }

  /**
   * Returns an integer representation of the key.
   *
   * @return an integer representation of the key
   */
  public int toInt() {
    return this.ordinal();
  }

  /**
   * Returns the KeyBase corresponding to the specified integer.
   *
   * @param key an integer representing a key
   * @return the KeyBase corresponding to the specified integer
   */
  public static KeyBase fromInt(int key) {
    return KeyBase.values()[key];
  }
}