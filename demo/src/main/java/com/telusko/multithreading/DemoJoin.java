package com.telusko.multithreading;

//main thread is waiting for child threads
class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Sita thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
}
public class DemoJoin {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 r = new MyRunnable1();
		Thread t1 = new Thread(r);
		t1.start();
		//t1.join();
		t1.join(1000);
		for(int i=0; i<5; i++) {
			System.out.println("Rama thread");
		}

	}

}
