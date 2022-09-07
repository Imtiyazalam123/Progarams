package com.array;

public class Program4 {

	public static void main(String[] args) {
		
		int a[] = {4, 8, 100, 200, 102};
		
		for(int i = 0; i < a.length-1; i++) {
			
			System.out.println(a[i] + a[i+1]);
		}
	}
}
