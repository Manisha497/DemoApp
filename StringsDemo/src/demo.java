
public class demo {

	public static void main(String[] args) {
		System.out.println("actual main method");
		int[] a = {1,2,3};
		main(a);
		main(1);
	}
	public static void main(int[] args) {
		System.out.println("accepting int [] args");			
	}
	public static void main(double b) {
		System.out.println("acccepting double value");		
		
	}

}
