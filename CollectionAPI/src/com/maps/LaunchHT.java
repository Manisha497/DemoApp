package com.maps;

import java.util.*;

public class LaunchHT {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(11, "Manisha");
		ht.put(22, "Nisha");
		ht.put(33, "Isha");
		System.out.println(ht);
		
		Set s = ht.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
	}

}
