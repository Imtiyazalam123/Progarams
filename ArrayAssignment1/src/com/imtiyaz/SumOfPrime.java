//write a program to calculate sum of all prime number in an array
package com.imtiyaz;
public class SumOfPrime {

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
		
		int a[] = {10, 13, 5, 40, 15, 80, 50, 31};
		int primeSum = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(isPrime(a[i]))
				primeSum = primeSum + a[i];
		}
		System.out.println("Sum of all prime number is "+primeSum);
	}

}
