//write a program to check whether the number is prime or not. if it is prime calculate square.
package com.imtiyaz;

import java.util.Scanner;

public class PrimeNo {

	public static boolean isPrime(int n) {
		
		boolean b = false;
		int f = 0;
		for(int i = 2; i <= n/2; i++) {
			
			if(n % i == 0) {
				f = 1;
				break;
			}	
		}
		if(f == 0)
			b = true;
		return b;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		if(isPrime(n))
			System.out.println(n * n);
		else
			System.out.println("this is not prime number");
	}

}
