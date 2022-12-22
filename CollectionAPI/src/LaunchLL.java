import java.util.Iterator;
import java.util.LinkedList;

//LinkedList Demo
public class LaunchLL {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		ll1.add(2);
		ll1.add('a');
		ll1.add("Hello");
		System.out.println(ll1);
		ll1.addFirst(1);
		ll1.offerLast(100);
		System.out.println(ll1);
		
		System.out.println(ll1.element());
		System.out.println(ll1.pop());
		System.out.println(ll1);
		
		// descendingIterator is there in LinkedList, ArrayDeque and TreeSet
		Iterator itr = ll1.descendingIterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		
		//Iterator is there in all Collection classes
		//ListIterator is there in ArrayList and LinkedList
		//descendingIterator is there in LinkedList, ArrayDeque and TreeSet
	}

}
