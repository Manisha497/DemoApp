package com.telusko.demo;

public class StringsDemo {

	public static void main(String[] args) {
		String name = "Manisha";
		name = name.concat(" Waje");
		System.out.println(name);
		
		System.out.println(name.replace('i', 'e'));
		System.out.println(name);
		
		String s = " yes  ";
		System.out.println(s.strip());

	}

}
