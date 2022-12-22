package multithreading;

//synchronized method for two different objects
//irregular op

class Displ2 {
	public synchronized void display(String name) {
		System.out.println("Thread invoked: "+ Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.print("Good Evening: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}

class My_Thread2 extends Thread {
	Displ2 d;
	String name;

	My_Thread2(Displ2 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}

public class Test2 {

	public static void main(String[] args) {
		Displ2 d1 = new Displ2();
		Displ2 d2 = new Displ2();
		My_Thread2 t1 = new My_Thread2(d1, "sachin");
		My_Thread2 t2 = new My_Thread2(d2, "dhoni");
		
		t1.setName("sachin");
		t2.setName("dhoni");
		
		t1.start();
		t2.start();

	}

}
