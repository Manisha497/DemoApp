import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchImp {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add("ABC");
		a.add('Z');
		System.out.println(a);
		
		//Access objects
		// 1. for loop
		System.out.println("");
		System.out.println("--- for loop ---");
		for(int i=0; i<a.size(); i++) {
//			Object o= a.get(i);
//			System.out.println(o);
			System.out.println(a.get(i));
		}
		//2. for each
		System.out.println("");
		System.out.println("--- for each ---");
		for(Object o:a) {
			System.out.println(o);
		}
		
		//3. Iterator
		System.out.println("");
		System.out.println("--- Iterator ---");
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		//Iterator is there in all Collection classes
		//but listIterator is only there in list based classes i.e. ArrayList and LinkedList
		System.out.println("");
		System.out.println("--- Access in reverse order ---");
		ListIterator litr = a.listIterator(a.size());
		while(litr.hasPrevious()) {
			Object o = litr.previous();
			System.out.println(o);
		}
	}

}
