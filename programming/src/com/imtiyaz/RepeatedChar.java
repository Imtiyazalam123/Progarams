/*input : ne2ds
  output : needs
  
  input : ab3c
  output : abbbc
 
 */
package com.imtiyaz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedChar {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string :");
		String s = br.readLine();
	
		char[] ch = s.toCharArray();
		String result = "";
		for(int i = 0; i < ch.length; i++) {
			
			switch(ch[i]) {
			
				case '0','1','2','3','4','5','6','7','8','9' : 
					int a = Integer.parseInt(ch[i]+"");
					while(a > 1) {
						result = result+ch[i-1];
						a--;
					}
					break;
				default: 
					result = result+ch[i];
					
			}
		}
		System.out.println(result);
	}
}
