package com.telusko.multithreading;

//Anonymous inner class + chaining
public class AICMT2 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++)
					System.out.println("Child thread");
			}

		}).start();
		
		for (int i = 0; i < 5; i++)
			System.out.println("Main thread");

	}

}
