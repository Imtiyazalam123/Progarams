package com.imtiyaz;

public class PerfectNo {

	public static void main(String[] args) {
	
		int n = 496;
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			
			if(n%i == 0)
				sum = sum + i;
				
		}
		if(n == sum)
			System.out.println("this is perfect No.");
		else
			System.out.println("this is not perfect No.");

	}

}
