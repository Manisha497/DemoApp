package assignment4;

import java.util.Scanner;

//WAP to implement Pangram Checking with least inbuilt methods being used
public class Pangram {
	static boolean checkPangram(String str) {
		char[] arr = str.toCharArray();
		boolean[] mark = new boolean[26];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='A' && arr[i]<='Z') {
				index=arr[i]-'A';
			}
			else if(arr[i]>='a' && arr[i]<='z') {
				index=arr[i]-'a';
			}
			else 
				continue;
			mark[index]=true;
		}
		
		for(int i=0;i<25;i++) {
			if(mark[i]==false)
				return false;
		}
		return true;		
	}
	public static void main(String[] args) {
		System.out.println("Check if string is Pangram");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :: ");
		String str = sc.nextLine();
		System.out.println("============================");
		if(checkPangram(str))
			System.out.println("Given string is Pangram!");
		else
			System.out.println("Given string is not Pangram!");

	}

}
