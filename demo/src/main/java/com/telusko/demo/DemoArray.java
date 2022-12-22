package com.telusko.demo;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,4};
		for(int e: arr) {
			System.out.print(e +" ");
		}
		System.out.println();
		//System.out.println(arr.getClass().getName());
		
		//max of array
		int max = arr[0];
		for(int e: arr) {
			if(e>max)
				max=e;
		}
		System.out.println("max value : "+max);
		
		//linear search
		int key = 4;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println(key+ " found at index "+i);
				flag=true;
				//break;
			}
		}
		if(flag==false)
			System.out.println("Key not found");
		
		int x[] =  {12,10,32,2,6,21};
		
		Arrays.sort(x);
		for(int e: x) {
			System.out.print(e +" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(x, 21));
	}

}
