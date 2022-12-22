package com.maps;

interface A{
	void taskA();
	void taskB();
	
	//from Java 8 we can have default and static methods in an interface
	default void taskC() {
		System.out.println("task C implementation - default method");
		display();
//		taskE();
	}
	static void taskD() {
		System.out.println("task D implementation - static method");
		taskF();
	}
	
	//from Java 9 we can also have private methods, since private it won't be inherited
	// use case? -> can be called within the interface
	private void display() {
		System.out.println("Interface private method");
	}
//	private void taskE() {
//		System.out.println("task E - private method in an interface");
//	}
	private static void taskF() {
		System.out.println("task F - private static method");
	}
}
class AImple implements A{

	@Override
	public void taskA() {
		System.out.println("task A implementation");
	}

	@Override
	public void taskB() {
		System.out.println("task B implementation");
	}
	public void taskC() {
		System.out.println("task C implementation - default method - overrided");
	}
	
	//static method will not be inherited in the implementing classes
	static void taskD() {
		System.out.println("task D implementation - static method in the class");
	}
	
}
public class LaunchSpecialJava {

	public static void main(String[] args) {
		AImple obj = new AImple();
		obj.taskA();
		obj.taskB();
		obj.taskC();
		obj.taskD();
		A.taskD();
		
		obj.taskC();
	}

}
