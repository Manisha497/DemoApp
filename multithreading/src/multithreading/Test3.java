package multithreading;

//synchronized block, same object
//object lock
//regular op
class Displ3 {
	public void display(String name) {
		synchronized (this) {
			System.out.println("Thread getting lock: " + Thread.currentThread().getName());
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

class My_Thread3 extends Thread {
	Displ3 d;
	String name;

	My_Thread3(Displ3 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}

public class Test3 {

	public static void main(String[] args) {
		Displ3 d1 = new Displ3();
		My_Thread3 t1 = new My_Thread3(d1, "sachin");
		My_Thread3 t2 = new My_Thread3(d1, "dhoni");

		t1.setName("sachin");
		t2.setName("dhoni");

		t1.start();
		t2.start();

	}

}
