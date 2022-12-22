package assignment4;

import java.util.Arrays;
import java.util.Scanner;

//WAP to implement Anagram Checking least inbuilt methods being used.
//ignored the case
public class AnagramCheck {
	
	//check if strings are Anagram
	static boolean checkAnagram(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		char[] s1 = str1.toLowerCase().toCharArray();
		char[] s2 = str2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<s1.length;i++) {
			if(s1[i]!=s2[i])
				return false;
		}
		return true;	
	}

	public static void main(String[] args) {
		System.out.println("Check if strings are Anagram");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 :: ");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2 :: ");
		String str2 = sc.nextLine();
		System.out.println("============================");
		if(checkAnagram(str1, str2))
			System.out.println("Given strings are Anagrams!");
		else
			System.out.println("Given strings are not Anagrams!");
	}

}
