package com.array;

public class Program3 {

	public static boolean isPrime(int n) {
		
		boolean b = false;
		int i = 2;
		int f = 0;
		while(i <= n/2) {
			if(n % i == 0) {
				f = 1;
				break;
			}
			i++;
		}
		if(f == 0)
			b = true;
		
		return b;
	}
	public static void main(String[] args) {
	
		int a[] = {3 , 7, 11, 12, 14, 13};
		
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			
			if(isPrime(a[i]))
				count++;
		}
		System.out.println(count);
	}

}
