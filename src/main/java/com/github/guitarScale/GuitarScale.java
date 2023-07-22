package com.github.guitarScale;

// https://pleiades.io/help/idea/add-a-gradle-library-to-the-maven-repository.html

public class GuitarScale {
  public static void main(String[] argv) {

    FingerBoard fb = new FingerBoard(
        24,
        KeyBase.A,
				ScaleBase.Major,
        new Tuning( // or Tuning.getStandardTuning();
            new int[]{
                KeyBase.fromString("D").toInt(),
                KeyBase.fromString("A").toInt(),
                KeyBase.fromString("D").toInt(),
                KeyBase.fromString("G").toInt(),
                KeyBase.fromString("B").toInt(),
                KeyBase.fromString("E").toInt()
            }
        ));

    System.out.println(fb);
    System.out.println("key:" + KeyBase.fromString("A") + ", " + KeyBase.fromString("A").toInt());

  }

}
