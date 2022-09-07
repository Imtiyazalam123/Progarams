package com.imtiyaz;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
	
			int rev = 0;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = in.nextInt();
			int original = n;
			
			while (n > 0) {
				
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}

			if(rev == original) 
				System.out.println("No is palindrom");
			else 
				System.out.println("No is not palindrom");
	}

}
