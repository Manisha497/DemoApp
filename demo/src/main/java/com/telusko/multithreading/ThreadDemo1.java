package com.telusko.multithreading;

class MyRunnable implements Runnable{

	public void run() {
		/*
		 * for(int i=0; i<5;i++) System.out.println("user defined thread");
		 */
		System.out.println("run method executed by ::"+Thread.currentThread().getName());
		Thread.currentThread().setName("Task2");
		System.out.println("run method executed by ::"+Thread.currentThread().getName());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
	}
	
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		System.out.println("main method executed by ::"+Thread.currentThread().getName());
		
//		for(int i=0; i<5;i++) System.out.println("Main Thread");
		Thread.currentThread().setName("Task1");
		System.out.println("main method executed by ::"+Thread.currentThread().getName());
		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());
		}

}
