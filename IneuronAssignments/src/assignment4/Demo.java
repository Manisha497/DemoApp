package assignment4;

public class Demo {

	public static void main(String[] args) {
		int i1=10;
		int i2=i1;
		i1++;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println();
		System.out.println(i1==i2);
		
		String s1="abc";
		String s2=s1;
		s1.concat("d");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		Integer ii1=10;
		Integer ii2=ii1;
		ii1++;
		System.out.println(ii1);
		System.out.println(ii2);
		System.out.println(ii1.hashCode());
		System.out.println(ii2.hashCode());
		System.out.println(ii1==ii2);
		
		Boolean b1=true;
		Boolean b2=Boolean.valueOf("truee");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b1==b2);
		
		System.out.println(Short.MAX_VALUE);
		
		
	}

}
