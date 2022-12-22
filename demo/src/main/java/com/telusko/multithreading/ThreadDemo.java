package com.telusko.multithreading;

class MyThread extends Thread{

	public void run() {
		for(int i=0; i<5;i++)
			System.out.println("user defined thread");
		System.out.println("run method executed by ::"+Thread.currentThread().getName());
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("main method executed by ::"+Thread.currentThread().getName());
		for(int i=0; i<5;i++)
			System.out.println("Main Thread");	
	}

}
