package com.imtiyaz;

public class Prime {

	public static void main(String[] args) {
		
		int n = 11;
		int f = 0;
		for(int i = 2; i<= n/2; i++) {
			
			if(n % i == 0) {
				f = 1;
				break;
			}
		}
		if(f == 0) {
			System.out.println("No is prime");
		}
		else {
			System.out.println("No is not prime");
		}

	}

}
