/*
 	input:  int a[] = {6,8,11,28,48}
 	output : 2
 
 	it means how many numbers of perfect number present in an array
 */
package com.array;

public class Program2 {

	public static boolean isPerfect(int n) {
		boolean b = false;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			
			if(n % i == 0)
				sum = sum + i;
		}
		if(sum == n)
			b = true;
		return b;
	}
	public static void main(String[] args) {
		
		int a[] = {6,8,11,28,48};
		
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			
			if(isPerfect(a[i]))
				count++;
		}
		System.out.println(count);	
	}
}
