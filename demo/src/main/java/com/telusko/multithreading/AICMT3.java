package com.telusko.multithreading;

//Lambda expression + chaining
public class AICMT3 {

	public static void main(String[] args) {
		new Thread(()-> {
				for (int i = 0; i < 5; i++)
					System.out.println("Child thread");
		}).start();
		
		for (int i = 0; i < 5; i++)
			System.out.println("Main thread");

	}

}
