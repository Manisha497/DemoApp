
import java.util.LinkedHashSet;

//LinkedHashSet is subclass of HashSet and it preserves the order of insertion
public class LaunchLHS {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(21);
		lhs.add(52);
		lhs.add(101);
		System.out.println(lhs);

	}

}
