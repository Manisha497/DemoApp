import java.util.PriorityQueue;

public class LaunchPQ {

	public static void main(String[] args) {
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(60);
		pq1.add(10);
		pq1.add(30);
		pq1.add(20);
		pq1.add(50);
		pq1.add(40);
		pq1.add(20);
		System.out.println(pq1);
		System.out.println(pq1.element());
//		pq1.clear();
		System.out.println(pq1.element());
	}

}
