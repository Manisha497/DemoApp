package com.maps;

import java.util.*;

class Student{
	private String name;
	private String city;
	private int age;
	
	public Student(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
}
public class LaunchMapsAdv {

	public static void main(String[] args) {
		Student s1 = new Student("Rohan","Mumbai",18);
		Student s2 = new Student("Rahul","Pune", 18);
		Student s3 = new Student("Rohan","Delhi",12);
		
		HashMap hm = new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
//		System.out.println(hm);
		Collection c = hm.values();
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
