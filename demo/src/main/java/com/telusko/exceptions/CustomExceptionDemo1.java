package com.telusko.exceptions;

import java.util.Scanner;

class InvalidCustomerException extends Exception{

	public InvalidCustomerException(String msg) {
		super(msg);
	}
	
}
class ATM1{
	int id =1010;
	int pwd = 1234;
	int uid;
	int upwd;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Enter user id ::");
		uid = sc.nextInt();
		System.out.println("Enter password ::");
		upwd = sc.nextInt();
	}
	public void verify() throws InvalidCustomerException {
		if(id==uid & pwd==upwd) {
			System.out.println("Collect the cash!");
		}
		else {
			InvalidCustomerException ice = new InvalidCustomerException("Wrong input, Try Again!");
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
	
}
class Bank1{
	ATM1 atm = new ATM1();
	
	public void initialize() {
		try {
			atm.input();
			atm.verify();
		} catch (InvalidCustomerException e1) {
			try {
				atm.input();
				atm.verify();
			} catch (InvalidCustomerException e2) {
				try {
					atm.input();
					atm.verify();
				} catch (InvalidCustomerException e3) {
					System.out.println("ATM card blocked");
					System.exit(0);
				}
			}
		}
	}
	
	
}
public class CustomExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		Bank1 b = new Bank1();
		b.initialize();
	}

}
