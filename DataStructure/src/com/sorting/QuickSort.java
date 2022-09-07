package com.sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int a[] = {40, 50, 11, 20, 11, 60, 95, 8, 98,1, 95, 1};
	
		quickSort(a, 0, a.length-1);
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + ", ");
		}
	}
	public static void quickSort(int a[], int low, int high) {
		
		if(low < high) {
			
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
	}
	public static int partition(int a[], int low, int high) {

		int pivot = a[low];
		int i = low + 1;
		int j = high;
		
		do {
			while(a[i] <= pivot) 
				i++;
			while(a[j] > pivot) 
				j--;
			if(i < j) {
				int temp;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		} while(i < j);
	
		int temp;
		temp = a[j];
		a[j] = a[low];
		a[low] = temp;
		return j;
	}
}
