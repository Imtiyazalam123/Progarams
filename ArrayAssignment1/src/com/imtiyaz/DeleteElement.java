//write a program to delete element to the specified index in an array.
package com.imtiyaz;

public class DeleteElement {

	public static void main(String[] args) {
		
		int a[] = {20, 30, 15, 40, 12, 10, 20};
		int index = 2;
		int arr[] = new int[a.length-1];
		for(int i = 0; i < index; i++) {
			
			arr[i] = a[i]; 
		}
		for(int i = index; i < a.length-1; i++) {
			
			arr[i] = a[i+1];
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + ", ");
		}
	}

}
