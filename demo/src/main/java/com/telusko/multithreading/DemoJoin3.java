package com.telusko.multithreading;

//Deadlock
class MyRunnable3 implements Runnable{

	@Override
	public void run() {
		
	}
	
}
public class DemoJoin3 {

	public static void main(String[] args) throws InterruptedException {

		//Deadlock - infinite waiting
		Thread.currentThread().join();
		
		for(int i=0; i<5; i++) {
			System.out.println("Main thread");
		}

	}

}
