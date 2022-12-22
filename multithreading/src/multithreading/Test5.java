package multithreading;

//synchronized block, same object
//class lock
//regular output
class Displ5 {
	public void display(String name) {
		synchronized (Displ5.class) {
			System.out.println("Thread getting the lock: " + Thread.currentThread().getName());
			for (int i = 1; i <= 5; i++) {
				System.out.print("Good Evening: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}
		System.out.println("Thread releasing the lock: " + Thread.currentThread().getName());

	}
}

class My_Thread5 extends Thread {
	Displ5 d;
	String name;

	My_Thread5(Displ5 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}

public class Test5 {

	public static void main(String[] args) {
		Displ5 d1 = new Displ5();
		My_Thread5 t1 = new My_Thread5(d1, "sachin");
		My_Thread5 t2 = new My_Thread5(d1, "dhoni");

		t1.setName("sachin");
		t2.setName("dhoni");

		t1.start();
		t2.start();

	}

}
