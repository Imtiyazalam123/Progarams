// find second largest number from the array;
package com.imtiyaz.Array;

public class SecondLargest {

	public static void main(String[] args) {

		int a[] = {55, 98, 56, 11, 2, 1};
		
		int firstLarge = Integer.MIN_VALUE;
		int secondLarge = Integer.MIN_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > firstLarge) {
				
				secondLarge = firstLarge;
				firstLarge = a[i];
			}
			if(a[i] > secondLarge && firstLarge != a[i])
				secondLarge = a[i];
		}
		System.out.println("Second Largest number is "+ secondLarge);
	}

}
