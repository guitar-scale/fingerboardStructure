package com.github.guitarScale;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TuningTest {

  @Test
  public void testTuningConstructor() {
    int[] tuningArray = {1, 2, 3, 4, 5, 6};
    Tuning tuning = new Tuning(tuningArray);
    assertArrayEquals(tuningArray, tuning.getTuning());
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
        KeyBase.fromString("E").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("G").toInt(),
        KeyBase.fromString("B").toInt(),
        KeyBase.fromString("E").toInt()
    };
    assertArrayEquals(expectedTuning, standardTuning.getTuning());
  }

  @Test
  public void testGetDadGad() {
    Tuning dadGadTuning = Tuning.getDadGad();
    int[] expectedTuning = {
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt(),
        KeyBase.fromString("G").toInt(),
        KeyBase.fromString("A").toInt(),
        KeyBase.fromString("D").toInt()
    };
    assertArrayEquals(expectedTuning, dadGadTuning.getTuning());
  }

  @Test
  public void testToString() {
    int[] tuningArray = {1, 2, 3, 4, 5, 6};
    Tuning tuning = new Tuning(tuningArray);
    assertEquals("1, 2, 3, 4, 5, 6", tuning.toString());
  }
}
