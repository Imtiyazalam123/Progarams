//write a program to count occurrence of character of the given string. 
package com.imtiyaz.string;

import java.util.Arrays;

public class CharOccurrence {
	
	public static void main(String[] args) {
	
		String n = "imtiyaz";
		char ch[] = n.toCharArray();
		Arrays.sort(ch);//a,i,i,m,t,y,z
		for(int i = 0; i < ch.length; i++) {
			
			int count = 1;
			for(int j = i+1; j < ch.length; j++) {
				
				if(ch[i] == ch[j])
					count++;
				else
					break;
			}
			if(count >= 1) {
				
				System.out.println(ch[i] + "  occurrene is " + count);
				i = i + count-1;
			}
		}
	}
}
