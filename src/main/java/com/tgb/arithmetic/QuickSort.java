package com.tgb.arithmetic;

/**
 * Created by yangyu on 16/7/15.
 */
public class QuickSort {

	public static void quickSort(int[] array, int left, int right){
		if (left > right){
			return;
		}
		int key = array[left];
		int i = left;
		int j = right;
		while (i != j){
			while (array[j] >= key && i < j){
				j--;
			}
			while (array[i] <= key && i < j){
				i++;
			}
			if (i < j){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		array[left] = array[i];
		array[i] = key;
		quickSort(array, left, i - 1);
		quickSort(array, i + 1, right);
	}

	public static void main(String args[]){
		int[] array = {6,1,2,7,9,3,4,5,10,8};
		quickSort(array, 0, array.length -1);
		for (int i = 0; i < array.length; i++){
			System.out.print(array[i]+"、");
		}
	}
}
