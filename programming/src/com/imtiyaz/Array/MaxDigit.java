// write a program to print 3rd largest number from array;
/*
 * input : 2, 8, 11, 5, 3, 11, 2, 8, 8, 6
 * output: 6
 */
package com.imtiyaz.Array;

public class MaxDigit {

	public static void main(String[] args) {

		int a[] = {2, 8, 11, 5, 3, 11, 2, 8, 8, 6};
		//I'm sorting all the element in descending order.
		for(int i = 1; i <= a.length-1; i++) {
			
			for(int j = 0; j < a.length-i; j++) {
				
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		//now array is 11, 11, 8, 8, 8, 6, 5, 3, 2, 2
		int count = 0;
		
		for(int i = 0; i < a.length-1; i++) {
			
			int incI = 1; // to re-increment i value;
			for(int j = i+1; j < a.length; j++) {
				
				if(!(a[i] == a[j])) {
					count++;
					break;
				}
				else
					incI++;
					
			}
			if(count == 3) {
				System.out.println(a[i]);
				break;
			}
			i = i + incI - 1;
		}
	}

}
