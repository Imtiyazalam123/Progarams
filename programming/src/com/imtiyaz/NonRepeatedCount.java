//write a program to count non repeated digit of the number.
/*
 input : 2902
 output: 2   because 9 and 0, these two digit is not repeating in the number
 */
package com.imtiyaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NonRepeatedCount {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int n = Integer.parseInt(br.readLine());
		
		int a[] = new int[10];
		int count = 0;
		while(n > 0) {
			
			int last = n % 10;
			a[last] = a[last] + 1;
			n = n / 10;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 1)
				count++;				
		}
		System.out.println("Non Repeated digit in this number is " + count);
	}
}
