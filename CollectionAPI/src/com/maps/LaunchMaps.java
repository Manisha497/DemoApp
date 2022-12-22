package com.maps;

import java.util.*;
import java.util.Map.Entry;

//Map is a completely different hierarchy than Collection
public class LaunchMaps {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "Sachin");
		hm.put(7, "Dhoni");
		hm.put(18, "Kohli");
//		hm.put(10, "L Messy");
		System.out.println(hm);
		
		System.out.println("--- using .values() ---");
		Collection c = hm.values();
		Iterator itr = c.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		System.out.println("--- using .entrySet() ---");
		Set s = hm.entrySet();
		Iterator itr1 = s.iterator();
		while(itr1.hasNext()) {
			//System.out.println(itr1.next());
			Map.Entry e = (Entry) itr1.next();
			//System.out.println(e);
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		System.out.println();
		
		System.out.println("--- using .keySet() ---");
		Set s1 = hm.keySet();
		Iterator itr2 = s1.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println();
		
		System.out.println("--------------------------------------");
		
		//LinkedHashMap preserves order of insertion
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(10, "Sachin");
		lhm.put(7, "Dhoni");
		lhm.put(18, "Kohli");
//		lhm.put(10, "L Messy");
		
		System.out.println(lhm);
	}

}
