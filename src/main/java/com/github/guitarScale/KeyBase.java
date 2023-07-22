package com.github.guitarScale;

public enum KeyBase {
  E, FSharp, F, G, GSharp, A, ASharp, B, C, CSharp, D, DSharp;

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

  public int toInt() {
    return this.ordinal();
  }

  public static KeyBase fromInt(int key) {
    return KeyBase.values()[key];
  }
}