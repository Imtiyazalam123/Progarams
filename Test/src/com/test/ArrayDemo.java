package com.test;

public class ArrayDemo {

	public static void main(String[] args) {
	
		int size = 0;
		int a = 100;
		while(a <= 200) {
			
			if(a % 5 == 0)
				size++;
			a++;
		}
		int[] arr = new int[size]; 
		int b = 100;
		int i = 0;
		while(b <= 200) {
			
			if(b % 5 == 0) {
				arr[i] = b;
				i++;
			}
			b++;
		}
		for(int j : arr)
			System.out.print(j+", ");
	}
}