package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = {40, 50, 11, 20, 11, 60, 95, 8};
		
		sort(a);
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + ", ");
		}
	}	
	public static void sort(int b[]) {
		
		for(int i = 1; i < b.length; i++) {
			
			int temp = b[i];
			int j;
			for(j = i-1; j >= 0; j--) 
	        {
				if(b[j] > temp) 
					b[j+1] = b[j];
				else 
					break;
	        }
			b[j+1] = temp;
		}
	}
}