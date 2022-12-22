package com.telusko.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

interface A{
	void m1() throws IOException;
	void m2() throws IOException;
}
public class DemoExceptions implements A{

	public static void main(String[] args) throws FileNotFoundException, IOException {
		DemoExceptions obj = new DemoExceptions();
		obj.m1();
		obj.m2();
}

	
	public void m1()  {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
