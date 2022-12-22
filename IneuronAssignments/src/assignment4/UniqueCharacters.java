package assignment4;

import java.util.Scanner;

//WAP to find if String contains all unique characters
//ignored whitespace occurrence
public class UniqueCharacters {
	public static boolean ifUnique(String str) {
		boolean flag=true;
		String str1=str.replace(" ", "");
		loop1: for(int i=0; i<str1.length();i++) {
			for(int j=i+1; j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					flag=false;
					break loop1;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== Check if string has all unique characters=====");
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		boolean result=ifUnique(str);
		if(result)
			System.out.println("String contains all unique characters");
		else
			System.out.println("String doesn't contain all unique characters");
	}

}
