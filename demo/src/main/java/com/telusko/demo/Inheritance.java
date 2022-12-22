package com.telusko.demo;

class Parent{
	Parent(){
		System.out.println("Class Parent constructor");
	}
	static{
		System.out.println("Parent static block");
	}
	{
		System.out.println("parent instance block");
	}
	
}
class Child extends Parent{
	Child(){
		System.out.println("Class Child constructor");
	}
	static {
		System.out.println("child static block");
	}
	{
		System.out.println("childinstance block");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Child child = new Child();

	}

}
