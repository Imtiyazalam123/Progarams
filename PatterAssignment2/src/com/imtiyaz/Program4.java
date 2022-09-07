package com.imtiyaz;

public class Program4 {

	public static void main(String[] args) {
		int n = 10;
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				
				if(i+j <=n/2-1 && j < n/2 || i <= n/2-1 && j >= n/2 && j-i >= n/2 || i-j >= n/2 && j < n/2 || i >= n/2 && j >= n/2 && (i+j)/2 > n/2+1)
				{
					System.out.print("*"+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
