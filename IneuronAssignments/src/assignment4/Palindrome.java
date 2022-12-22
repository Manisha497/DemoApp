package assignment4;

import java.util.Scanner;

//WAP to check if “2552” is palindrome or not.
public class Palindrome{
	static boolean checkPalindrome(String str) {
		boolean flag;
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		flag= str.equals(str1)? true: false;
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== Program to check Palindrome =====");
		//System.out.println("Enter the String:");
		//String str = sc.nextLine();
		String str="2552";
		boolean result = checkPalindrome(str.toLowerCase());
		if(result)
			System.out.println(str+" is Palindrome");
		else
			System.out.println(str+" is not Palindrome");
	}

}
