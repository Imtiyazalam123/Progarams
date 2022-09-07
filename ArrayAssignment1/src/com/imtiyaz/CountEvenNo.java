//write a program to count even element of an array
package com.imtiyaz;

public class CountEvenNo {

	public static void main(String[] args) {
		
		int a[] = {10, 13, 5, 40, 15, 80, 50, 31};
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] % 2 == 0)
				
				count++;
		}
		System.out.println("Total even element of an array is : "+count);
	}

}
