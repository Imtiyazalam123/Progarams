package com.imt;

class Producer extends Thread {
	private Utility u;
	
	public Producer(Utility u) {
		this.u = u;
	}
	public void run() {
		
		while(true)
			u.put();
	}
}
class Consumer extends Thread {
	private Utility u ;
	
	public Consumer(Utility u) {
		this.u = u;
	}
	public void run() {
		while(true) {
			u.get();
		}
	}
}

class Utility {
	private int i;
	private boolean b = false;
	public void put() {
	
		synchronized (this) {
			
			while(b) {
				try {
					wait();
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			System.out.println("Producer Produced : " + i);			
			
			b = true;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {e.printStackTrace();}
			notify();
		}
	}
	public void get() {
		synchronized (this) {
			
			while(!b) {
				try {
					wait();
				} catch (InterruptedException e) {e.printStackTrace();}
			}
			System.out.println("Consumer consumed : " + i);
			b = false;
			i++;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {e.printStackTrace();}
			notify();
		}
	}
}
public class InterThreadDemo {

	public static void main(String[] args) {

		Utility u = new Utility();
		Producer p = new Producer(u);
		Consumer c = new Consumer(u);
		p.start();
		c.start();
	}
}