package com.github.guitarScale.fingerboardStracture;

import com.github.guitarScale.fingerboardStracture.scale.ScaleBox;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScaleBaseTest {

  @Test
  public void testToString() {
    assertEquals("MitsuruMetal [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1]", ScaleBox.MitsuruMetal.toString());
    assertEquals("Aeolian [2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]", ScaleBox.Aeolian.toString());
    assertEquals("Altered [2, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0]", ScaleBox.Altered.toString());
    assertEquals("Algerian [2, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1]", ScaleBox.Algerian.toString());
    assertEquals("Blues [2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0]", ScaleBox.Blues.toString());
    assertEquals("BluesPlus [2, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1]", ScaleBox.BluesPlus.toString());
    assertEquals("Chromatic [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]", ScaleBox.Chromatic.toString());
    assertEquals("Diminished [2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1]", ScaleBox.Diminished.toString());
    assertEquals("Diminish [0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1]", ScaleBox.Diminish.toString());
    assertEquals("Dorian [2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0]", ScaleBox.Dorian.toString());
    assertEquals("DominantSeven [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0]", ScaleBox.DominantSeven.toString());
    assertEquals("Diatonic [2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0]", ScaleBox.Diatonic.toString());
    assertEquals("Egyptian [2, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0]", ScaleBox.Egyptian.toString());
    assertEquals("HarmonicMinor [2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1]", ScaleBox.HarmonicMinor.toString());
    assertEquals("Hawaiian [2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1]", ScaleBox.Hawaiian.toString());
    assertEquals("Hindu [2, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0]", ScaleBox.Hindu.toString());
    assertEquals("HeavyMetal [2, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0]", ScaleBox.HeavyMetal.toString());
    assertEquals("Ionian [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1]", ScaleBox.Ionian.toString());
    assertEquals("Japanese [2, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0]", ScaleBox.Japanese.toString());
    assertEquals("Lydian [2, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1]", ScaleBox.Lydian.toString());
    assertEquals("Minor [2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]", ScaleBox.Minor.toString());
    assertEquals("MelodicMinor [2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1]", ScaleBox.MelodicMinor.toString());
    assertEquals("Mixolydian [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0]", ScaleBox.Mixolydian.toString());
    assertEquals("Major [2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1]", ScaleBox.Major.toString());
    assertEquals("Pentatonic [2, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0]", ScaleBox.Pentatonic.toString());
    assertEquals("Phrygian [2, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0]", ScaleBox.Phrygian.toString());
    assertEquals("Roumanian [2, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0]", ScaleBox.Roumanian.toString());
    assertEquals("Ryukyu [2, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1]", ScaleBox.Ryukyu.toString());
    assertEquals("Sobaya [2, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0]", ScaleBox.Sobaya.toString());
    assertEquals("Spanish [2, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0]", ScaleBox.Spanish.toString());
    assertEquals("Ultralocrian [2, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0]", ScaleBox.Ultralocrian.toString());
    assertEquals("WholeTone [2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0]", ScaleBox.WholeTone.toString());
  }
}

