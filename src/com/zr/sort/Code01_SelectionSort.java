package com.zr.sort;

import java.util.Arrays;

/**
 * @author zhaorui
 * @version 1.0
 */
public class Code01_SelectionSort {

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) { //0~N-1
            int minIndex = i;
            for (int j = i + 1; j < arr.length - 1; j++) { //i~N-1上找最小值的小标
                minIndex = arr[minIndex] < arr[j] ? minIndex : j;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
