package com.maps;

import java.util.*;

public class LaunchMap1 {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf(30);
		Integer i3 = Integer.valueOf(20);

		HashMap hm = new HashMap();
		hm.put(i1, "Manisha");
		hm.put(i2, "Nisha");
		hm.put(i3, "Isha");
		
		System.out.println(hm);
		
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
