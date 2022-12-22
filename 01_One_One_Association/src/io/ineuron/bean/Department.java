package io.ineuron.bean;

public class Department {
	private String did;
	private String dname;
	
	private Employee[] emps;

	public Department(String did, String dname, Employee[] emps) {
		super();
		this.did = did;
		this.dname = dname;
		this.emps = emps;
	}
	
	public void getDepartmentDetails() {
		System.out.println("Department details are :: ");
		System.out.println("Dept id : "+did);
		System.out.println("Dept name : "+dname);
		System.out.println();
		//System.out.println("Employee details ::");
		for(Employee e:emps) {
			e.getEmployeeDetails();
			System.out.println();
			System.out.println("===========");
		}
	}
}
