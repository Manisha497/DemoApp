package assignment4;

import java.util.Arrays;
import java.util.Scanner;

//WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
public class RemoveDuplicates {
	static String removeDuplicates(String str) {
		char[] arr = str.toCharArray();
		int index=0;
		for(int i=0;i<str.length();i++) {
			int j;
			for(j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					break;
				}
			}
			if(j==i) {
				arr[index++]=arr[i];
			}
		}
		return String.valueOf(Arrays.copyOf(arr, index));
	}

	public static void main(String[] args) {
		System.out.println("Remove Duplicates: ");
		System.out.println("----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :: ");
		String str = sc.nextLine();
		System.out.println("============================");
		System.out.println("After removing duplicates :: "+removeDuplicates(str));
	}

}
