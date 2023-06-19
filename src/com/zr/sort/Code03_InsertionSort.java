package com.zr.sort;

/**
 * @author zhaorui
 * @version 1.0
 */
public class Code03_InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //0~0有序的
        //0~i想有序
        for (int i = 1; i < arr.length; i++) { //0~i范围上有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

//插入排序 O(N^2)

//异或运算  无进位相加
//0和任何数作异或运算都是该数，任何数和自己异或都为0
//异或运算满足交换律和结合律
