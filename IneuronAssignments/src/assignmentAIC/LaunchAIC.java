package assignmentAIC;

//write implementation of interfaces using anonymous inner class method

interface Add{
	void add(int a, int b);
	int add(int a, int b, int c);
	void display();
}

interface Subtract{
	float s = 4.0f;
	float sub(float a);
	float sub(float a, float b);
	void display();
}

interface Multiply{
	int multiply(int a, int b);
	void display();
}

interface Divide{
	int divide(int a, int b);
	void display();
}


public class LaunchAIC {

	public static void main(String[] args) {
		
		Add a1 = new Add() {
			@Override
			public void add(int a, int b) {
				System.out.println("Result :: "+(a+b));
			}

			@Override
			public int add(int a, int b, int c) {
				return a + b + c;
			}

			@Override
			public void display() {
				System.out.println("display method of Add");
			}
		};

		a1.add(10, 20);
		System.out.println("Result :: "+a1.add(50, 5, 10));
		a1.display();
			
		System.out.println("--------------------");
		
		Subtract s1 = new Subtract() {
			
			@Override
			public float sub(float a, float b) {
				return a-b;
			}
			
			@Override
			public float sub(float a) {
				return a-s;
			}
			
			@Override
			public void display() {
				System.out.println("display method of Subtract");
			}
		};
		
		System.out.println("Result :: "+s1.sub(20,10));
		System.out.println("Result :: "+s1.sub(5));
		s1.display();
		
		System.out.println("--------------------");
		
		Multiply m1 = new Multiply() {
			
			@Override
			public int multiply(int a, int b) {
				return a*b;
			}
			
			@Override
			public void display() {
				System.out.println("display method of Multiply");		
			}
		};
		
		System.out.println("Result :: "+m1.multiply(12, 12));
		m1.display();
		
		System.out.println("--------------------");
		
		Divide d1 = new Divide() {
			
			@Override
			public int divide(int a, int b) {
				return a/b;
			}
			
			@Override
			public void display() {
				System.out.println("display method of Divide");
			}
		};
		System.out.println("Result :: "+d1.divide(100, 4));
		d1.display();
	}

}
