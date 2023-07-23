package com.github.guitarScale.fingerboardStracture;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TuningTest {

  @Test
  public void testTuningConstructor() {
    int[] tuningArray = {1, 2, 3, 4, 5, 6};
    Tuning tuning = new Tuning(tuningArray);
    assertArrayEquals(tuningArray, tuning.getTuningStructure());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testTuningConstructorWithInvalidLength() {
    int[] tuningArray = {1, 2, 3, 4, 5};
    new Tuning(tuningArray);
  }

  @Test
  public void testGetStandardTuning() {
    Tuning standardTuning = Tuning.getStandardTuning();
    int[] expectedTuning = {
        // The contents of the variable start from 1bow
        KeyBase.fromString("E").toInt(),
        KeyBase.fromString("B").toInt(),
        KeyBase.fromString("G").toInt(),
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("E").toInt()
    };
    assertArrayEquals(expectedTuning, standardTuning.getTuningStructure());
  }

  @Test
  public void testGetDadGad() {
    Tuning dadGadTuning = Tuning.getDadGad();
    // The contents of the variable start from 1bow
    int[] expectedTuning = {
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("G").toInt(),
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt()
    };
    assertArrayEquals(expectedTuning, dadGadTuning.getTuningStructure());
  }

  @Test
  public void testToString() {
    int[] tuningArray = {1, 2, 3, 4, 5, 6};
    Tuning tuning = new Tuning(tuningArray);
    assertEquals("6, 5, 4, 3, 2, 1", tuning.toString());
  }
}
