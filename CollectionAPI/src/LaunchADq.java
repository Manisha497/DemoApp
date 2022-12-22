import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LaunchADq {

	public static void main(String[] args) {
		ArrayDeque ar1 = new ArrayDeque();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		ar1.add(40);
		ar1.add(50);
		
		System.out.println(ar1);
//		ar1.addFirst(5);
//		ar1.addLast(55);
//		System.out.println(ar1.element());
//		System.out.println(ar1.offer(60));
//		System.out.println(ar1);
//		System.out.println(ar1.poll());
//		System.out.println(ar1);
//		ar1.add(10);
//		System.out.println(ar1);
		
		Iterator itr = ar1.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}
		
		LinkedList ll = new LinkedList();
		ll.addAll(ar1);
		System.out.println(ll);
		
		System.out.println("Reverse");
		ListIterator litr = ll.listIterator(ll.size());
		while(litr.hasPrevious()) {
			Integer i = (Integer) litr.previous();
			System.out.println(i);
		}
		
	
	}

}
