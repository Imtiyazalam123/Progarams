package com.linkedList;

class P {

	static int i = 20;
	public void m()
	{
		System.out.println("mi");
	}
	
}
public class Test extends P{
	
	static int i = 10;
	
	public static void main(String[] args) {
		
		P p = new Test();
		
		p.m();
		
	}

}