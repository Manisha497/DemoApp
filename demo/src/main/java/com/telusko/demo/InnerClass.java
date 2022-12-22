package com.telusko.demo;

abstract class A{
	int s;
	public void display() {
		System.out.println("in display");
	}
}

public class InnerClass {

	public static void main(String[] args) {
		A obj = new A()
				{
					private int x;
					public void display() {
						super.display();;
						System.out.println("annonymous inner class display");
						System.out.println(x);
					}
				};
		obj.display();
	}

}

/*
 * 
 * interface A{
	int s=10;
	public void display();
}

public class InnerClass {

	public static void main(String[] args) {
		A obj = new A()
				{
					private int x;
					public void display() {
						//super.display();;
						System.out.println("annonymous inner class display");
						System.out.println(x);
					}
				};
		obj.display();
	}

}
 */
