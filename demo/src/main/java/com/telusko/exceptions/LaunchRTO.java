package com.telusko.exceptions;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public UnderAgeException(String msg) {
		super(msg);
	}
}
class OverAgeException extends Exception{
	public OverAgeException(String msg) {
		super(msg);
	}
}

class Applicant{
	int age;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		age = sc.nextInt();
	}

//	public void verify() throws UnderAgeException, OverAgeException {
	public void verify() throws Exception {
		if(age<16) {
			UnderAgeException uae = new UnderAgeException("Age can't be below 16!");
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae = new OverAgeException("Age can't be above 60!");
			throw oae;
		}
		else {
			System.out.println("valid user");
		}
		
	}
	
}

/*
 * class RTO{ public void intialize() { Applicant a = new Applicant(); try {
 * a.input(); a.verify(); } catch (UnderAgeException | OverAgeException e) {
 * System.out.println(e.getMessage());
 * System.out.println("Age should be within the range of 16 to 60!");
 * System.exit(0); } } }
 */
class RTO{
	public void intialize() {
		Applicant a = new Applicant();
			
			try {
				a.input();
				a.verify();
			} catch (UnderAgeException e) {
				System.out.println(e.getMessage());
			} catch (OverAgeException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.exit(0);
			}
	}
}
public class LaunchRTO {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.intialize();
	}

}
