import java.util.Collections;
import java.util.TreeSet;

public class LaunchTS {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(50);
		ts.add(150);
		ts.add(175);
		System.out.println(ts);
		System.out.println(ts.ceiling(150));
		System.out.println(ts.floor(150));

	}

}
