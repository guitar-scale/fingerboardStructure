package com.github.guitarScale;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScaleBaseTest {

  @Test
  public void testToString() {
    Assert.assertEquals("MitsuruMetal [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1]", ScaleBase.MitsuruMetal.toString());
    assertEquals("Aeolian [2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]", ScaleBase.Aeolian.toString());
    assertEquals("Altered [2, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0]", ScaleBase.Altered.toString());
    assertEquals("Algerian [2, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1]", ScaleBase.Algerian.toString());
    assertEquals("Blues [2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0]", ScaleBase.Blues.toString());
    assertEquals("BluesPlus [2, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1]", ScaleBase.BluesPlus.toString());
    assertEquals("Chromatic [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]", ScaleBase.Chromatic.toString());
    assertEquals("Diminished [2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1]", ScaleBase.Diminished.toString());
    assertEquals("Diminish [0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1]", ScaleBase.Diminish.toString());
    assertEquals("Dorian [2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0]", ScaleBase.Dorian.toString());
    assertEquals("DominantSeven [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0]", ScaleBase.DominantSeven.toString());
    assertEquals("Diatonic [2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0]", ScaleBase.Diatonic.toString());
    assertEquals("Egyptian [2, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0]", ScaleBase.Egyptian.toString());
    assertEquals("HarmonicMinor [2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1]", ScaleBase.HarmonicMinor.toString());
    assertEquals("Hawaiian [2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1]", ScaleBase.Hawaiian.toString());
    assertEquals("Hindu [2, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0]", ScaleBase.Hindu.toString());
    assertEquals("HeavyMetal [2, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0]", ScaleBase.HeavyMetal.toString());
    assertEquals("Ionian [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1]", ScaleBase.Ionian.toString());
    assertEquals("Japanese [2, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0]", ScaleBase.Japanese.toString());
    assertEquals("Lydian [2, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1]", ScaleBase.Lydian.toString());
    assertEquals("Minor [2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]", ScaleBase.Minor.toString());
    assertEquals("MelodicMinor [2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1]", ScaleBase.MelodicMinor.toString());
    assertEquals("Mixolydian [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0]", ScaleBase.Mixolydian.toString());
    assertEquals("Major [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1]", ScaleBase.Major.toString());
    assertEquals("Pentatonic [2, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0]", ScaleBase.Pentatonic.toString());
    assertEquals("Phrygian [2, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0]", ScaleBase.Phrygian.toString());
    assertEquals("Roumanian [2, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0]", ScaleBase.Roumanian.toString());
    assertEquals("Ryukyu [2, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1]", ScaleBase.Ryukyu.toString());
    assertEquals("Sobaya [2, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0]", ScaleBase.Sobaya.toString());
    assertEquals("Spanish [2, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0]", ScaleBase.Spanish.toString());
    assertEquals("Ultralocrian [2, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0]", ScaleBase.Ultralocrian.toString());
    assertEquals("WholeTone [2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0]", ScaleBase.WholeTone.toString());
  }
}

