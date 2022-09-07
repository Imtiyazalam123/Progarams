//write a program to calculate occurrence of number in an array.
package com.imtiyaz;

import java.util.Arrays;

public class OccurrenceOfNo {

	public static void main(String[] args) {
		
		int a[] = {4, 11, 4, 9, 2, 4, 11, 10, 15};
		Arrays.sort(a);//2,4,4,4,9,10,11,11,15
		
		for(int i = 0; i < a.length; i++) {
			
			int count = 1;
			for(int j = i + 1; j < a.length; j++) {
				
				if(a[i] == a[j]) {
					count++;
				}
				else
					break;
			}
			if(count >= 1) {
				System.out.println(a[i] + " occurrence is " + count);
				i += count-1;
			}
		}
	}
}
