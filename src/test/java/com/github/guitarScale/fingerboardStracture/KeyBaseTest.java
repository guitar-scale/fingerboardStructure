package com.github.guitarScale.fingerboardStracture;

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
    assertEquals(0, KeyBase.C.toInt());
    assertEquals(1, KeyBase.CSharp.toInt());
    assertEquals(2, KeyBase.D.toInt());
    assertEquals(3, KeyBase.DSharp.toInt());
    assertEquals(4, KeyBase.E.toInt());
    assertEquals(5, KeyBase.F.toInt());
    assertEquals(6, KeyBase.FSharp.toInt());
    assertEquals(7, KeyBase.G.toInt());
    assertEquals(8, KeyBase.GSharp.toInt());
    assertEquals(9, KeyBase.A.toInt());
    assertEquals(10, KeyBase.ASharp.toInt());
    assertEquals(11, KeyBase.B.toInt());
  }


  @Test
  public void testFromInt() {
    assertEquals(KeyBase.C, KeyBase.fromInt(0));
    assertEquals(KeyBase.CSharp, KeyBase.fromInt(1));
    assertEquals(KeyBase.D, KeyBase.fromInt(2));
    assertEquals(KeyBase.DSharp, KeyBase.fromInt(3));
    assertEquals(KeyBase.E, KeyBase.fromInt(4));
    assertEquals(KeyBase.F, KeyBase.fromInt(5));
    assertEquals(KeyBase.FSharp, KeyBase.fromInt(6));
    assertEquals(KeyBase.G, KeyBase.fromInt(7));
    assertEquals(KeyBase.GSharp, KeyBase.fromInt(8));
    assertEquals(KeyBase.A, KeyBase.fromInt(9));
    assertEquals(KeyBase.ASharp, KeyBase.fromInt(10));
    assertEquals(KeyBase.B, KeyBase.fromInt(11));
  }

  @Test
  public void testCreateBowsKey() {
    int[] expected = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(expected, KeyBase.createBowsKey("C", "C#", "D", "D#", "E", "F"));
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
  public void testFromStringAdditionalCasesGSharp() {
    assertEquals(KeyBase.GSharp, KeyBase.fromString("G#"));
  }

}
