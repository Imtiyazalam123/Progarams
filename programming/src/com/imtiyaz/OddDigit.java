package com.imtiyaz;

import java.util.Scanner;

public class OddDigit {

	public static void main(String[] args) {

		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n = in.nextInt();

		while (n > 0) {

			int a = n % 10;
			if (a % 2 != 0)
				System.out.println(a);
			n = n / 10;
		}
	}
}
