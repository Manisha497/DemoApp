package com.telusko.demo;

@FunctionalInterface
interface Add{
	void add();
}

public class LambdaExpression {

	public static void main(String[] args) {
//		Fi ref = new Fi() {
//			public void add() {
//				System.out.println("add method implementation");
//			}		
//		};
		Add a = () -> System.out.println("add method impl");
		a.add();
	}

}
