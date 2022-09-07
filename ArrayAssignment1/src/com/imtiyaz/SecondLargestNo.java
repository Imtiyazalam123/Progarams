//write a program to print second largest number of an array
package com.imtiyaz;

public class SecondLargestNo {

	public static void main(String[] args) {
		
		int a[] = {10, 13, 5, 40, 15, 80, 50, 31};
		int firstLarge = 0;
		int secondLarge = 0;
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > firstLarge) {
				
				secondLarge = firstLarge;
				firstLarge = a[i]; 
			}
			else if(a[i] > secondLarge && a[i] != firstLarge){
				
				secondLarge = a[i];
			}
		}
		System.out.println("SecondLargest no is " + secondLarge);
	}
}
