package io.ineuron.main;

import io.ineuron.bean.Account;
import io.ineuron.bean.Department;
import io.ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		Account acc1 = new Account("ABE123","Manisha","Savings");
		Account acc2 = new Account("TYE123","Isha","Current");
		Employee e1 = new Employee("ID1","Manisha","Pune",acc1);
		Employee e2 = new Employee("ID2","Isha","Mumbai",acc2);
		Employee e3 = new Employee("ID3","Manisha","Pune",acc1);
		
		Employee[] employees = new Employee[] {e1,e2,e3};
		
		Department dept = new Department("d1", "Finance",employees);
		
		dept.getDepartmentDetails();
	}

}
