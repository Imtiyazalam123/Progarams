package com.array;

public class ShortElement {

	public static void main(String[] args) {
		
		int a[] = {14, 8, 100, 1, 200, 102};
		
		for(int i = 0; i < a.length; i++) {
				
			for(int j = 0; j < a.length-1-i; j++) {
				
				if(a[j] > a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//another way
		/*for(int i = 0; i < a.length-1; i++) {
		
			for(int j = i+1; j < a.length; j++) {
		
				if(a[i] > a[j]) {
					
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		} */
	}

}
