package io.ineuron.bean;

public class Employee {
	private String eid;
	private String ename;
	private String eaddr;
	Account account;
	
	//Constructor
	public Employee(String eid, String ename, String eaddr, Account account) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddr = eaddr;
		this.account = account;
	}
	
	public void getEmployeeDetails() {
		System.out.println("Employee details are :: ");
		System.out.println("Emp ID : "+eid);
		System.out.println("Emp Name : "+ename);
		System.out.println("Emp Add : "+eaddr);
		System.out.println("----------------");
		System.out.println("Account details are ::");
		System.out.println("Acc No : "+account.getAccNo());
		System.out.println("Acc Name : "+account.getAccName());
		System.out.println("Acc type : "+account.getAccType());
	}
	
	
}
