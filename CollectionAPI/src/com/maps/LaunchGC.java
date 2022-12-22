package com.maps;

import java.util.HashMap;

class Employee{
	private int empId;
	private String name;
	private String city;
	
	//Garbage Collector internally calls finalize() method
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector collected the object.");
	}

}
public class LaunchGC {

	public static void main(String[] args) {
		Employee e = new Employee();
		HashMap hm = new HashMap();
		hm.put(e, "Manisha");
		e=null;

		System.gc();
		System.out.println("Last line");

	}

}
