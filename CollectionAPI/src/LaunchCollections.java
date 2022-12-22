import java.util.*;

public class LaunchCollections {

	public static void main(String[] args) {
		System.out.println("---TreeSet---");
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(75);
		ts.add(25);
		System.out.println(ts);
		
		System.out.println("---ArrayList---");
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(75);
		al.add(25);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("---ArrayList String---");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Waje");
		al2.add("Manisha");
		al2.add("Harichandra");
		Collections.sort(al2);
		System.out.println(al2);

		//methods of Collections class
		ArrayList al3 = new ArrayList();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		al3.add(60);
		int index = Collections.binarySearch(al3, 20);
		System.out.println(index);
		
		Collections.shuffle(al3);
		System.out.println(al3);
		System.out.println(Collections.min(al3));
		
		System.out.println(Collections.frequency(al3, 70));
	}

}
