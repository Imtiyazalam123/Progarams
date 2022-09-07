/*
  input string: HGI_YEAR2019testmonth12DATE12ABU1234DAY23
  output : 2019-12-23
 */
package com.test;

public class BirthDay {

	public static void main(String[] args) {
		
		String s = "HGI_year2019testmonth12DATE12ABU1234DAY23";
		
		//int yearCount = 0, montCount = 0, dayCount=0;
		//int count = 0;
		String year ="";
		String month ="";
		String day = "";
		String realY = "";
		for(int i = 0; i < s.length(); i++) {
			
			
			if(s.charAt(i) == ('Y' | 'y')) {
				year = year+s.charAt(i);
				int e = i+1;
				if(s.charAt(e) ==('e'|'E')) {
					year = year+s.charAt(e);
					int a = e+1;
					if(s.charAt(a)==('a'|'A')) {
						year = year+s.charAt(a);
						int r = a+1;
						if(s.charAt(r)==('r'|'R')) {
							year = year+s.charAt(r);
							int t = r+1;
							while(t <= t+3) {
								realY = realY+s.charAt(t);
								t++;
							}
							i = t-1;
						}
						else
							year ="";
					}
					else
						year = "";
				}
				else
					year = "";
			}
			else {
				year = "";
			}
			
		/*	if(s.charAt(i) ==('M'|'m')) {
				month=month+s.charAt(i);
			}
			else {
				month = "";
			}
			
			if(s.charAt(i) == ('d'|'D')) {
				day = day+s.charAt(i);
			}
			else {
				day = "";
			} */
		}
		
		System.out.println(year);
		String str = "imiItI";
		String r = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)==('i'|'I')) {
				r = r+str.charAt(i);
				count++;
			}
		}
		System.out.println(r+"  " +count);
	}

}
