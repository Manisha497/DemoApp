package com.telusko.multithreading;

//Anonymous inner class
public class AICMT {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("Child thread");
			}

		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++)
			System.out.println("Main thread");


	}

}
