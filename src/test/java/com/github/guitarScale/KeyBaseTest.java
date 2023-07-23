package com.github.guitarScale;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KeyBaseTest {

  @Test
  public void testToString() {
    assertEquals("F", KeyBase.F.toString());
    assertEquals("G", KeyBase.G.toString());
    assertEquals("G#", KeyBase.GSharp.toString());
    assertEquals("A#", KeyBase.ASharp.toString());
    assertEquals("B", KeyBase.B.toString());
    assertEquals("C", KeyBase.C.toString());
    assertEquals("C#", KeyBase.CSharp.toString());
    assertEquals("D", KeyBase.D.toString());
    assertEquals("D#", KeyBase.DSharp.toString());
  }

  @Test
  public void testToStringAdditional() {
    assertEquals("E", KeyBase.E.toString());
    assertEquals("F#", KeyBase.FSharp.toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testToStringInvalidAdditional() {
    KeyBase.valueOf("Invalid");
  }


  @Test
  public void testFromStringAdditional() {
    assertEquals(KeyBase.ASharp, KeyBase.fromString("A#"));
    assertEquals(KeyBase.C, KeyBase.fromString("C"));
    assertEquals(KeyBase.CSharp, KeyBase.fromString("C#"));
    assertEquals(KeyBase.DSharp, KeyBase.fromString("D#"));
  }

  @Test
  public void testFromString() {
    assertEquals(KeyBase.E, KeyBase.fromString("E"));
    assertEquals(KeyBase.FSharp, KeyBase.fromString("F#"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testFromStringInvalid() {
    KeyBase invalidKey = KeyBase.fromString("Invalid");
    System.out.println(invalidKey);
  }


  @Test
  public void testToInt() {
    assertEquals(0, KeyBase.E.toInt());
    assertEquals(1, KeyBase.FSharp.toInt());
    assertEquals(2, KeyBase.F.toInt());
    assertEquals(3, KeyBase.G.toInt());
    assertEquals(4, KeyBase.GSharp.toInt());
    assertEquals(5, KeyBase.A.toInt());
    assertEquals(6, KeyBase.ASharp.toInt());
    assertEquals(7, KeyBase.B.toInt());
    assertEquals(8, KeyBase.C.toInt());
    assertEquals(9, KeyBase.CSharp.toInt());
    assertEquals(10, KeyBase.D.toInt());
    assertEquals(11, KeyBase.DSharp.toInt());
  }


  @Test
  public void testFromInt() {
    assertEquals(KeyBase.E, KeyBase.fromInt(0));
    assertEquals(KeyBase.FSharp, KeyBase.fromInt(1));
    assertEquals(KeyBase.F, KeyBase.fromInt(2));
    assertEquals(KeyBase.G, KeyBase.fromInt(3));
    assertEquals(KeyBase.GSharp, KeyBase.fromInt(4));
    assertEquals(KeyBase.A, KeyBase.fromInt(5));
    assertEquals(KeyBase.ASharp, KeyBase.fromInt(6));
    assertEquals(KeyBase.B, KeyBase.fromInt(7));
    assertEquals(KeyBase.C, KeyBase.fromInt(8));
    assertEquals(KeyBase.CSharp, KeyBase.fromInt(9));
    assertEquals(KeyBase.D, KeyBase.fromInt(10));
    assertEquals(KeyBase.DSharp, KeyBase.fromInt(11));
  }

  @Test
  public void testCreateBowsKey() {
    int[] expected = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(expected, KeyBase.createBowsKey("E", "F#", "F", "G", "G#", "A"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testToStringInvalid() {
    KeyBase.valueOf("Invalid");
  }

  @Test
  public void testFromStringAdditionalCases() {
    assertEquals(KeyBase.B, KeyBase.fromString("B"));
    assertEquals(KeyBase.D, KeyBase.fromString("D"));
  }

  @Test
  public void testCreateBowsKeyAdditional() {
    int[] expected = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(expected, KeyBase.createBowsKey("E", "F#", "F", "G", "G#", "A"));
    int[] expected2 = new int[]{7, 8, 9, 10, 11, 0};
    assertArrayEquals(expected2, KeyBase.createBowsKey("B", "C", "C#", "D", "D#", "E"));
  }

}
