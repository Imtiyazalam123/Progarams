package com.imtiyaz;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		//D pattern
		int n = 5;
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
				
				if(j == 0 || (i == 0 && j < n-1) || (j == n-1 && i > 0 && i < n-1) || (i == n-1 && j < n-1)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		} 
		
		System.out.println("_____________________________");
		//E pattern
		for(int i = 0; i <= n-1; i++) {
					
			for(int j = 0; j <= n-1; j++) {
						
				if(j == 0 || i == 0 || i == n-1 || (i == n/2 && j < n-1)) {
					
					System.out.print("*"+" ");
				}
				else {
					
					System.out.print("  ");
				}
			}
			System.out.println();
		} 
		System.out.println("_____________________________");
		//F pattern
		for(int i = 0; i <= n-1; i++) {
					
			for(int j = 0; j <= n-1; j++) {
						
				if(j == 0 || i == 0 || (i == n/2 && j < n-1)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//H pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(j == 0 || j == 4 || i == n/2) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//I pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if((i == 0 && j < n-1 && j > 0) || j == n/2 || (i == n-1 && j < n-1 && j > 0)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//L patter
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(j == 0 || i == n-1) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//N pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(j == 0 || j == n-1 || i == j) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//O pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if((j == 0 && i > 0 && i < n-1) || (i == 0 && j < n-1 && j > 0) || (j == n-1 && i > 0 && i < n-1) || (i == n-1 && j < n-1 && j > 0)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//P pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(j == 0 || i == 0 || (j == n-1 && i <= n/2) || i == n/2) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		} 
		
		System.out.println("_____________________________");
		//X pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(i == j || i+j == n-1) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//T pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(i == 0 || j == n/2) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		//Z pattern
		for(int i = 0; i <= n-1; i++) {
			
			for(int j = 0; j <= n-1; j++) {
						
				if(i == 0 || i+j == n-1 || i == n-1) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
