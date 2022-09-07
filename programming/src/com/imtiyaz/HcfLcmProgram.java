//write a program to find HCF and LCM of three given integer number.
package com.imtiyaz;

public class HcfLcmProgram {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		int c = 30; //hcf = 10, and lcm = 30.
		//finding min value of these three.
		int min = 0;
		if(a <= b && a <= c)
			min = a;
		else if(b <= a && b <= c)
			min = b;
		else
			min = c;
		//finding hcf of these three given value.
		int x = min;
		int hcf = 0;
		while(x >= 1) {
			if(b % x == 0 && c % x == 0 && a % x == 0) {
				hcf = x;
				break;
			}
			x--;
		}
		System.out.println("hcf is " + hcf);
		
		//finding max of these three value.
		int max = 0;
		if(a >= b && a >= c)
			max = a;
		else if(b >= a && b >= c)
			max = b;
		else
			max = c;
		//finding lcm of the given three value.
		int lcm = 0;
		int y = max;
		while(y >= c) {
			
			if(y % a == 0 && y % b == 0 && y % c == 0) {
				
				lcm = y;
				break;
			}
			y++;
		}
		System.out.println("lcm is : " + lcm);
	}
}
