package com.github.guitarScale.fingerboardStracture.scale;

import java.util.Arrays;

/**
 * Represents the base scales.
 */
public enum ScaleBox {
	/**
	 * Represents the MitsuruMetal scale.
	 */
	MitsuruMetal(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1}),

	/**
	 * Represents the Aeolian scale.
	 */
	Aeolian(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}),

	/**
	 * Represents the Altered scale.
	 */
	Altered(new int[]{2, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0}),

	/**
	 * Represents the Algerian scale.
	 */
	Algerian(new int[]{2, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1}),

	/**
	 * Represents the Blues scale.
	 */
	Blues(new int[]{2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0}),

	/**
	 * Represents the BluesPlus scale.
	 */
	BluesPlus(new int[]{2, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}),

	/**
	 * Represents the Chromatic scale.
	 */
	Chromatic(new int[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}),

	/**
	 * Represents the Diminished scale.
	 */
	Diminished(new int[]{2, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}),

	/**
	 * Represents the Diminish scale.
	 */
	Diminish(new int[]{0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1}),

	/**
	 * Represents the Dorian scale.
	 */
	Dorian(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0}),

	/**
	 * Represents the DominantSeven scale.
	 */
	DominantSeven(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}),

	/**
	 * Represents the Diatonic scale.
	 */
	Diatonic(new int[]{2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0}),

	/**
	 * Represents the Egyptian scale.
	 */
	Egyptian(new int[]{2, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0}),

	/**
	 * Represents the HarmonicMinor scale.
	 */
	HarmonicMinor(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1}),

	/**
	 * Represents the Hawaiian scale.
	 */
	Hawaiian(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}),

	/**
	 * Represents the Hindu scale.
	 */
	Hindu(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0}),

	/**
	 * Represents the HeavyMetal scale.
	 */
	HeavyMetal(new int[]{2, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0}),

	/**
	 * Represents the Ionian scale.
	 */
	Ionian(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1}),

	/**
	 * Represents the Japanese scale.
	 */
	Japanese(new int[]{2, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0}),

	/**
	 * Represents the Lydian scale.
	 */
	Lydian(new int[]{2, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1}),

	/**
	 * Represents the Minor scale.
	 */
	Minor(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0}),

	/**
	 * Represents the MelodicMinor scale.
	 */
	MelodicMinor(new int[]{2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}),

	/**
	 * Represents the Mixolydian scale.
	 */
	Mixolydian(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0}),

	/**
	 * Represents the Major scale.
	 */
	Major(new int[]{2, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1}),

	/**
	 * Represents the Pentatonic scale.
	 */
	Pentatonic(new int[]{2, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0}),

	/**
	 * Represents the Phrygian scale.
	 */
	Phrygian(new int[]{2, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0}),

	/**
	 * Represents the Roumanian scale.
	 */
	Roumanian(new int[]{2, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0}),

	/**
	 * Represents the Ryukyu scale.
	 */
	Ryukyu(new int[]{2, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1}),

	/**
	 * Represents the Sobaya scale.
	 */
	Sobaya(new int[]{2, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0}),

	/**
	 * Represents the Spanish scale.
	 */
	Spanish(new int[]{2, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}),

	/**
	 * Represents the Ultralocrian scale.
	 */
	Ultralocrian(new int[]{2, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0}),

	/**
	 * Represents the WholeTone scale.
	 */
	WholeTone(new int[]{2, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0});

	private final int[] structure;

	/**
	 * Constructs a ScaleBase with the specified structure.
	 *
	 * @param structure an array representing the structure of the scale
	 */
	ScaleBox(int[] structure) {
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
	 * Returns the name of the scale.
	 *
	 * @return a string representing the name of the scale
	 */
	public String getName() {
		return name();
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