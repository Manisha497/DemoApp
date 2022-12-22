package com.telusko.multithreading;

class Display {

	public void wish(String name) {
		//regular output
		//synchronized (Display.class) {
		
		//irregular output
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("Good Evening: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}

	}
}

class My_Thread extends Thread {
	Display d;
	String name;

	My_Thread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

class Test {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		My_Thread t1 = new My_Thread(d1, "sachin");
		My_Thread t2 = new My_Thread(d2, "dhoni");

		t1.start();

		t2.start();

	}
}
