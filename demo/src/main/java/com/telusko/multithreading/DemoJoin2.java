package com.telusko.multithreading;

//child thread is waiting for main thread to complete
class MyRunnable2 implements Runnable{
	static Thread mainThread;
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
//			try {
//				mainThread.join();
//			} catch (InterruptedException e) {
//			}
			System.out.println("Child thread");
		}
		
	}
	
}
public class DemoJoin2 {

	public static void main(String[] args) throws InterruptedException {
		
		MyRunnable2.mainThread = Thread.currentThread();
		MyRunnable2 r = new MyRunnable2();
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Main thread");
			Thread.sleep(2000);
		}

	}

}
