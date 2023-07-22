package com.github.guitarScale;

public class Utils {
  public static int[] shiftArray(int[] arr, int n) {
    int length = arr.length;
    int[] shiftedArr = new int[length];
    for (int i = 0; i < length; i++) {
      shiftedArr[(i + n) % length] = arr[i];
    }
    return shiftedArr;
  }
}
