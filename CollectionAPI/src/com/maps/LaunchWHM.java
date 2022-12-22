package com.maps;

import java.util.*;

class Employee1{
	private int empId;
	private String name;
	private String city;
	
	//Garbage Collector internally calls finalize() method
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector collected the object.");
	}

}
public class LaunchWHM {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		WeakHashMap hm = new WeakHashMap();
		hm.put(e, "Manisha");
		e=null;
		System.gc();
		System.out.println("Last line");
	}

}
