package com.maps;

import java.util.*;
import java.util.Map.Entry;

class FullName {
	private String fname;
	private String lname;

	public FullName(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	@Override
	public String toString() {
		return fname + ", " + lname;
	}

}

class PersonInfo {
	private FullName name;
	private int age;
	private String city;
	private String profession;

	public PersonInfo(FullName name, int age, String city, String profession) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.profession = profession;
	}

	public FullName getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getProfession() {
		return profession;
	}

	@Override
	public String toString() {
		return name + ", " + age + ", " + city + ", " + profession;
	}

}

public class LaunchPassport {

	public static void main(String[] args) {
		FullName f1 = new FullName("Manisha", "Waje");
		PersonInfo p1 = new PersonInfo(f1, 25, "Pune", "SDE");
		FullName f2 = new FullName("Harry", "Potter");
		PersonInfo p2 = new PersonInfo(f2, 22, "Mumbai", "Magician");
		FullName f3 = new FullName("Ron", "Wisley");
		PersonInfo p3 = new PersonInfo(f3, 28, "Delhi", "Doctor");
		FullName f4 = new FullName("Hormine", "Granger");
		PersonInfo p4 = new PersonInfo(f4, 25, "Bangalore", "Chef");

		HashMap hm = new HashMap();
		hm.put(11, p1);
		hm.put(22, p2);
		hm.put(33, p3);
		hm.put(44, p4);

//		System.out.println(hm);

		System.out.println("Welcome to Passport details App!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter passport num");
		Integer k = sc.nextInt();
		boolean flag=false;

		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry me = (Entry) itr.next();
			Integer key = (Integer) me.getKey();
			if (k == key) {
				System.out.println(me.getKey() + " : " + me.getValue());
				flag=true;
//				System.exit(0);
			}
		}
		if(flag==false)
			System.out.println("Key not found");
	}

}
