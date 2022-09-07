package com.imtiyaz;

public class SpecialNumber {

	public static void main(String[] args) {
		
		int n = 49;
		int temp = n;
		int add = 0;
		int mul = 1;
		int sum = 0;
		while(n > 0) {
			
			int rem = n % 10;
			add = add + rem;
			mul = mul * rem;
			
			n = n/10;
		}
		sum = add + mul;
		if(sum == temp)
			System.out.println("This is Special No");
		else
			System.out.println("this is not Special No");

	}

}
