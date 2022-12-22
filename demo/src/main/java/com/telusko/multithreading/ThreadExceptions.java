package com.telusko.multithreading;

class MyThread4 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child thread");
				Thread.sleep(15000);
			}
				
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}

public class ThreadExceptions {

	public static void main(String[] args) {
		MyThread4 t1 = new MyThread4();
		t1.start();
		t1.interrupt();
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println("I got interrupted -main");
		}
	}

}
