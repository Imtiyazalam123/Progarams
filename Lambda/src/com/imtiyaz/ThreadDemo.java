package com.imtiyaz;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			
			for(int i = 1; i <= 10; i++) {
				
				System.out.println(i * 2);
			}
		};

		Runnable r1 = () -> System.out.println("Hey, imtiyaz Good Morning !!! ");
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		
		t.setName("Child_Thread");
		t1.setName("Another_chile_Thread");
		t1.start();
		t.start();
		
		// these all SOP line is executing by main thread only.
		System.out.println(t.getName());
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i * 11);
		}
	}
}
