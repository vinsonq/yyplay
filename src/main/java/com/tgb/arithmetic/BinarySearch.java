package com.tgb.arithmetic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by yangyu on 16/7/14.
 */
public class BinarySearch {

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static int search(int[] array, int low, int high, int key) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (key == array[mid])
				return mid;
			else if (key < array[mid])
				//移动low和high
				return search(array, low, mid - 1, key);
			else if (key > array[mid])
				return search(array, mid + 1, high, key);
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] array = {44, 21, 1, 2, 20, 44, 43, 50};
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "、");
		}
		System.out.println();
		System.out.println(search(array, 0, array.length - 1, 2));

	}
}
