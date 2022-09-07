package com.imtiyaz;

public class DuplicateNo {

	public static void main(String[] args) {
		
		int a[] = {10, 13, 5,80, 5, 40, 15, 10, 80, 50, 31};
		int dupCount = 0;
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
				if(a[i] == a[j])
					dupCount++;
			}
		}
		System.out.println("total duplicate number of an array is "+dupCount);
	}

}
