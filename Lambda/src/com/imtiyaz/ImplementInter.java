package com.imtiyaz;

public class ImplementInter {

	public static void main(String[] args) {
		
		// using anonymous class
			MyInter my = new MyInter() {
			@Override
			public void sayHellow() {
				
				System.out.println("hey, hello.....");
			}
		};
		
		my.sayHellow();
		//using lambda
		MyInter m1 = () -> {
				System.out.println("Hello hi");
		};
		
		MyInter m2 = () -> System.out.println("Hello hi");
	
		m1.sayHellow();
		m2.sayHellow();
		
		/*SumNumberInter sn = (int a, int b) -> {
			
			return a+b;
		};*/
		
		SumNumberInter sn = (a, b) -> a + b;  //without return statement and specifying type in the argument will work in lambda. but without return statement will only work, when we have only one statement inside method.
		System.out.println(sn.sumNumber(4, 8));		
	}	
}
