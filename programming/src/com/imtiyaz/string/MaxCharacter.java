//asked in Tavant Technology.
//write a program to find the maximum occurrence character of the given string;
/*
 * input: abbcccd
 * output : c
 */
package com.imtiyaz.string;

public class MaxCharacter {

	public static void main(String[] args) {
	
	   String s = "abbcccd";
	   int asciiSize = 256;
	   int count[] = new int[asciiSize];
	   
	   for(int i = 0; i < s.length(); i++) {
		   
		   count[s.charAt(i)]++;
	   }
	   int max = -1;
	   char result = ' ';
	   for(int i = 0; i <s.length(); i++) {
		
		   if(max < count[s.charAt(i)]) {
			   max = count[s.charAt(i)];
			   result = s.charAt(i);
		   }
	   }
	   System.out.println("Maximum occurring character is "+ result);
	}
}
