package multithreading;

//synchronized block, diff object
//object lock
//irregular op
class Displ4 {
	public void display(String name) {
		synchronized (this) {
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

class My_Thread4 extends Thread {
	Displ4 d;
	String name;

	My_Thread4(Displ4 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		Displ4 d1 = new Displ4();
		Displ4 d2 = new Displ4();
		My_Thread4 t1 = new My_Thread4(d1, "sachin");
		My_Thread4 t2 = new My_Thread4(d2, "dhoni");

		t1.setName("sachin");
		t2.setName("dhoni");

		t1.start();
		
		t2.start();

	}

}
