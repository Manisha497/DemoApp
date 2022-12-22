package multithreading;

//synchronized block, diff object
//class lock
//reg op
class Displ6 {
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

class My_Thread6 extends Thread {
	Displ6 d;
	String name;

	My_Thread6(Displ6 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}

public class Test6 {

	public static void main(String[] args) {
		Displ6 d1 = new Displ6();
		Displ6 d2 = new Displ6();
		My_Thread6 t1 = new My_Thread6(d1, "sachin");
		My_Thread6 t2 = new My_Thread6(d2, "dhoni");

		t1.setName("sachin");
		t2.setName("dhoni");

		t1.start();
		t2.start();

	}

}
