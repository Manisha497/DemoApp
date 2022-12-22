package com.telusko.multithreading;

class MyThread1 extends Thread{

	public void run() {
		for(int i=0; i<5;i++)
			System.out.println("user defined thread");

	}
	
}
public class ThreadDemo2 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();

		t1.start();
		t1.setPriority(100);	
		
		for(int i=0; i<5;i++)
			System.out.println("Main Thread");	
	}

}
