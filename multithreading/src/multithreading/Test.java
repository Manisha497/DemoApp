package multithreading;

//synchronized method for same object
//regular op
class Displ {
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

class My_Thread extends Thread {
	Displ d;
	String name;

	My_Thread(Displ d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.display(name);
	}
}

public class Test {

	public static void main(String[] args) {
		Displ d1 = new Displ();
		My_Thread t1 = new My_Thread(d1, "sachin");
		My_Thread t2 = new My_Thread(d1, "dhoni");
		
		t1.setName("sachin");
		t2.setName("dhoni");
		
		t1.start();
		t2.start();

	}

}
