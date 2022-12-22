package com.enums;

import java.util.*;

public class LaunchGen {
	//Generic method with wildcard pattern
	static void m1(ArrayList<?> al) {
		System.out.println(al);
	}
	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar);
		m1(ar);
		
	}

}
