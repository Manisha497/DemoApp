import java.util.ArrayList;

//ArrayList demo
public class LaunchAL {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(1);
		al1.add("Manisha");
		al1.add("Pune");
		al1.add(2, 25);
		System.out.println(al1);
		
		System.out.println(al1.size());

		System.out.println(al1.contains(10));
		System.out.println(al1.get(0));
		System.out.println(al1.removeAll(al1));
		System.out.println(al1);
		System.out.println(al1.size());
		
	
	}

}
