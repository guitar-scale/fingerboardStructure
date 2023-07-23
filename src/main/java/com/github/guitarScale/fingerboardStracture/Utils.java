package com.github.guitarScale.fingerboardStracture;

/**
 * Utility class for various array operations.
 */
public class Utils {

  /**
   * Shifts the elements of an array to the right by a given number of positions.<br>
   * Elements that are shifted beyond the end of the array are wrapped around to the beginning.
   *
   * @param arr the array to shift
   * @param n the number of positions to shift the array to the right
   * @return a new array that is the result of the shift operation
   */
  public static int[] shiftArray(int[] arr, int n) {
    int length = arr.length;
    int[] shiftedArr = new int[length];
    for (int i = 0; i < length; i++) {
      shiftedArr[(i + n) % length] = arr[i];
    }
    return shiftedArr;
  }
}
