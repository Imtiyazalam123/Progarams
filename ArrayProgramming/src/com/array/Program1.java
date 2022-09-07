//write a program to calculate maximum value of an array
package com.array;

public class Program1 {

	public static void main(String[] args) {
		
		int a[]  = {30, 10, 11, 47, 89, 36, 41};
		//to calculate max value
	/*	int max = a[0];
		for(int i = 0; i < a.length; i++) {
			
			if(max < a[i])
				max = a[i];
		}
		System.out.println(max); */
	
		// to calculate min value
		/*int min = a[0];
		for(int i = 0; i < a.length; i++) {
			
			if(min > a[i])
				min = a[i];
		}
		System.out.println(min); */
		
		//to calculate value
		double d[] = {12.35, 12, 15.56, 63.2, 5, 12, 7.0};
		int count = 0;
		for(int i = 0; i < d.length; i++) {
			
			count++;
			System.out.println(d[i]);
		}
		System.out.println(count);
	}
}
