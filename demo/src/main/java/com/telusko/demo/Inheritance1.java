package com.telusko.demo;

class Parent1 {
	private static int x = 10;
	private int y = 0;

	public static void display() {
		System.out.println("Parent1 static display method");
	}

	public void disp() {
		System.out.println("Parent1 instance display method");
	}

}

class Child1 extends Parent1 {
	private static int x = 10;
	private int y = 0;

	public static void display() {
		//super.display();
		System.out.println("Child1 static display method");
	}

	public void disp() {
		super.display();
		super.disp();
		System.out.println("Child1 instance display method");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Parent1 child1 = new Child1();
		child1.disp();
		child1.disp();

	}

}
