package com.telusko.exceptions;

import java.util.Scanner;

class ATM{
	int id =1010;
	int pwd = 1234;
	int uid;
	int upwd;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Welcome!");
		System.out.println("Enter user id ::");
		uid = sc.nextInt();
		System.out.println("Enter password ::");
		upwd = sc.nextInt();
	}
	public void verify() {
		if(id==uid & pwd==upwd) {
			System.out.println("Collect the cash!");
		}
		else {
			System.out.println("Are you really the card holder?");
		}
	}
	
}
class Bank{
	ATM atm = new ATM();
	
	public void initialize() {
		atm.input();
		atm.verify();
	}
	
	
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.initialize();
	}

}
