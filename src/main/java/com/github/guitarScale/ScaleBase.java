package com.github.guitarScale;

import java.util.Arrays;

/**
 * Represents the base scales.
 */
public enum ScaleBase {
	MitsuruMetal(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1}),
	Aeolian(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}),
	Altered(new int[]{2, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0}),
	Algerian(new int[]{2, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1}),
	Blues(new int[]{2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0}),
	BluesPlus(new int[]{2, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}),
	Chromatic(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}),
	Diminished(new int[]{2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}),
	Diminish(new int[]{0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1}),
	Dorian(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0}),
	DominantSeven(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}),
	Diatonic(new int[]{2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0}),
	Egyptian(new int[]{2, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0}),
	HarmonicMinor(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1}),
	Hawaiian(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}),
	Hindu(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0}),
	HeavyMetal(new int[]{2, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0}),
	Ionian(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1}),
	Japanese(new int[]{2, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0}),
	Lydian(new int[]{2, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1}),
	Minor(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}),
	MelodicMinor(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}),
	Mixolydian(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}),
	Major(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1}),
	Pentatonic(new int[]{2, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0}),
	Phrygian(new int[]{2, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0}),
	Roumanian(new int[]{2, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0}),
	Ryukyu(new int[]{2, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1}),
	Sobaya(new int[]{2, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0}),
	Spanish(new int[]{2, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}),
	Ultralocrian(new int[]{2, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0}),
	WholeTone(new int[]{2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0});

	private final int[] structure;

	/**
	 * Constructs a ScaleBase with the specified structure.
	 *
	 * @param structure an array representing the structure of the scale
	 */
	ScaleBase(int[] structure) {
		this.structure = structure;
	}

	/**
	 * Returns the structure of the scale.
	 *
	 * @return an array representing the structure of the scale
	 */
	public int[] getStructure() {
		return this.structure;
	}

	/**
	 * Returns a string representation of the scale.
	 *
	 * @return a string representation of the scale
	 */
	@Override
	public String toString() {
		return name() + " " + Arrays.toString(structure);
	}
}