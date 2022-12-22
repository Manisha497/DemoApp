package com.telusko.demo;

@FunctionalInterface
interface Add1{
	int add(int a, int b);
}

public class LambdaExpression2 {

	public static void main(String[] args) {
//		Fi ref = new Fi() {
//			public void add() {
//				System.out.println("add method implementation");
//			}		
//		};
		Add1 add = (a,b) -> a+b;
//		{
//			return (a+b);
//		};
		System.out.println(add.add(3,5));
		
	}

}
