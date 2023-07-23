package com.github.guitarScale.fingerboardStracture;

import com.github.guitarScale.fingerboardStracture.scale.Scale;
import com.github.guitarScale.fingerboardStracture.scale.ScaleBox;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class FingerBoardTest {

  @Test
  public void mainTest() {

    // initialize guitar scale
    // or Scale scale = new Scale("myCustomScale", new int[]{2, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}),
    Scale scale = new Scale(ScaleBox.Minor.getName(), ScaleBox.Minor.getStructure());
    // initialize tuning
    Tuning tuning = new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"));
    // create FingerBoard
    Fingerboard fb = new Fingerboard(
        24,
        KeyBase.E,
        scale,
        tuning
    );

    // diagram
    System.out.println(fb);
    // scale
    System.out.println(fb.getScale().getName() + fb.getScale().toString());
    // tuning
    int[] keysInt = fb.getTuning().getTuningStructure();
    KeyBase[] keysBase = IntStream.rangeClosed(1, keysInt.length)
        .map(i -> keysInt[keysInt.length - i])
        .mapToObj(KeyBase::fromInt)
        .toArray(KeyBase[]::new);
    System.out.println(Arrays.toString(keysBase));

    // assert
    assertEquals("[E, A, D, G, B, E]", Arrays.toString(keysBase));
    assertEquals("Minor[2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0]", fb.getScale().getName() + fb.getScale().toString());
  }

  @Test
  public void case01() {
    Fingerboard fb = new Fingerboard(
        24,
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        Tuning.getStandardTuning()
    );

    int[][] expect = {
        {1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1},
        {1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1},
        {1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1},
        {2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2},
        {1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 2, 0, 1, 1, 0, 1, 0, 1}
    };

    assertArrayEquals(fb.getStructure(), expect);
  }

  @Test
  public void case02() {
    Fingerboard fb = new Fingerboard(
        24,
        KeyBase.A,
        new Scale(ScaleBox.Major.getStructure()),
        new Tuning(KeyBase.createBowsKey("D", "A", "D", "G", "B", "E"))
    );

    String expectStr =
        "1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, \n" +
        "1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, \n" +
        "0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, \n" +
        "1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, \n" +
        "2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, \n" +
        "1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, 1, 1, \n";

    assertEquals(fb.toString(), expectStr);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidNumberOfFretsLessThan12() {
    Fingerboard fb = new Fingerboard(
        10, // less than 12
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(KeyBase.createBowsKey("E3", "A", "D", "G", "B", "E"))
    );
    System.out.println(fb);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidNumberOfFretsGreaterThan32() {
    Fingerboard fb = new Fingerboard(
        33, // greater than 32
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
    );
  }

  @Test
  public void testEqualsAndHashCode() {
    Fingerboard fb1 = new Fingerboard(
        24,
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
    );

    Fingerboard fb2 = new Fingerboard(
        24,
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
    );

    // Test equals
    assertTrue(fb1.equals(fb2));
    assertTrue(fb2.equals(fb1));

    // Test hashCode
    assertEquals(fb1.hashCode(), fb2.hashCode());
  }

  @Test
  public void testEquals() {
    Fingerboard fb1 = new Fingerboard(
        24,
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
    );

    Fingerboard fb2 = new Fingerboard(
        24,
        KeyBase.A,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(KeyBase.createBowsKey("E", "A", "D", "G", "B", "E"))
    );

    Fingerboard fb3 = new Fingerboard(
        24,
        KeyBase.B,
        new Scale(ScaleBox.Minor.getStructure()),
        new Tuning(
            new int[]{
                KeyBase.fromString("E").toInt(),
                KeyBase.fromString("A").toInt(),
                KeyBase.fromString("D").toInt(),
                KeyBase.fromString("G").toInt(),
                KeyBase.fromString("B").toInt(),
                KeyBase.fromString("E").toInt()
            }
        )
    );

    // Test equals with the same object
    assertTrue(fb1.equals(fb1));

    // Test equals with a different object but the same properties
    assertTrue(fb1.equals(fb2));

    // Test equals with a different object and different properties
    assertFalse(fb1.equals(fb3));

    // Test equals with null
    assertFalse(fb1.equals(null));

    // Test equals with a different class
    assertFalse(fb1.equals("a string"));
  }

}
