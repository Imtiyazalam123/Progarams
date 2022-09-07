package com.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int a[] = { 40, 50, 11, 20, 11, 60, 95, 8, 98, 1, 95, 1 };
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + ", ");
		}
	}
	public static void mergeSort(int a[], int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, mid, low, high);
		}
	}

	public static void merge(int a[], int mid, int low, int high) {

		int b[] = new int[low + high + 1];
		int i = low;
		int j = mid + 1;
		int k = low;

		while (i <= mid && j <= high) {

			if (a[i] < a[j]) {
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		if (i > mid) {

			while (j <= high) {
				b[k] = a[j];
				j++;
				k++;
			}
		} else {
			while (i <= mid) {
				b[k] = a[i];
				i++;
				k++;
			}
		}
		
		for (k = low; k <= high; k++) {
			a[k] = b[k];
		}
	}
}