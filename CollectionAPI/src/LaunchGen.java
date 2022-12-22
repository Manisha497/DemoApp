import java.util.ArrayList;
import java.util.Collections;

class Student{
	private int age;
	private int marks;
	private String name;
	public Student(int age, int marks, String name) {
		super();
		this.age = age;
		this.marks = marks;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	
}

public class LaunchGen {

	public static void main(String[] args) {
		Student s1 = new Student(16,95,"Ram");
		Student s2 = new Student(15,98,"Sham");
		Student s3 = new Student(12,99,"Sharma ji ka beta");
		
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		
		System.out.println(a);
//		Collections.sort(a); error
	}

}
