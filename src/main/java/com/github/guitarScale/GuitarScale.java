package com.github.guitarScale;

// https://pleiades.io/help/idea/add-a-gradle-library-to-the-maven-repository.html

public class GuitarScale {
	public static void main(String[] argv) {

		KeyBase key = KeyBase.A;
		ScaleBase sb = ScaleBase.Minor;
		Tuning tuning = Tuning.getStandardTuning();
		int fret = 24;

		FingerBoard fb = new FingerBoard(key, sb, tuning, fret);

		System.out.println(fb);
		System.out.println("key:" + KeyBase.fromString("A") + ", " + KeyBase.fromString("A").toInt());
	}

}
