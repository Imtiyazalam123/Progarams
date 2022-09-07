package com.imtiyaz;

public class Factorial {

	public static void main(String[] args) {
		
	/*	int n = 5;
		int f = 1;
		while (n > 0) {
			f = f * n;
			n--;
		}
		System.out.println(f); */
		System.out.println(factorial(5));
	} 
	
	
	//using recursion
	public static int factorial(int n) {
		
		if(n <= 1) {
			return n;
		}	
		n = n * factorial(n-1);
		return n;
	}
}
