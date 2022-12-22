import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//concurrent or structural modification -> ConcurrentModificationException
public class LaunchFFFS {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(50);
		al.add(25);
		al.add(300);
		
//		for(int i=0;i<al.size();i++) {
//			System.out.print(al+" ");
//			al.add(10);
//		}
		
		//fail fast
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			al.add(10);
		}
		
		System.out.println("----------");
		//fail safe
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(200);
		cal.add(50);
		cal.add(25);
		cal.add(300);
		
		
		Iterator itrr = cal.iterator();
		while(itrr.hasNext()) {
			System.out.println(itrr.next());
			cal.add(10);
		}

	}

}
