package assignment4;

import java.util.Scanner;

//WAP to count the number of consonants, vowels, special characters in a String.
public class CharCounts {
	static void count(String str) {
		int vowelsCount=0;
		int consonantsCount=0;
		int specialCharCount=0;
		int digitCount=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' ||
					str.charAt(i)>='a' && str.charAt(i)<='z') {
				char ch = str.charAt(i);
				if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' ||
						ch=='O' || ch=='o' || ch=='U' || ch=='u')
					vowelsCount++;
				else
					consonantsCount++;
			}
			else if(str.charAt(i)>=0 && str.charAt(i)<=9)
				digitCount++;
			else
				specialCharCount++;
		}
		
		System.out.println("Count to Vowels        :: "+vowelsCount);
		System.out.println("Count of consonants    :: "+consonantsCount);
		System.out.println("Count of special chars :: "+specialCharCount);
	}

	public static void main(String[] args) {
		System.out.println("count vowels, consonants and special characters: ");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :: ");
		String str = sc.nextLine();
		System.out.println("============================");
		count(str);
	}

}
