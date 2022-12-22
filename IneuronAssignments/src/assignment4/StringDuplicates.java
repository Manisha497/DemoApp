package assignment4;

import java.util.Scanner;

//WAP to print Duplicates characters from the String
public class StringDuplicates {
	static void findStringDuplicates(String str) {
		// convert String to char array
		char[] arr = str.toCharArray();

		// calculating frequency of each element
		int[] freq = new int[arr.length];
		int remark = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = remark;
				}
			}
			if (freq[i] != remark)
				freq[i] = count;
		}

		// print elements that occurred more than once
		System.out.println("--------------------");
		System.out.println("The elements which occured more than once are:");
		for (int i = 0; i < arr.length; i++) {
			if (freq[i] > 1) {
				System.out.println(arr[i] + " occured " + freq[i] + " times.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== Print duplicate characters from String =====");
		System.out.println("-------------------");
		System.out.println("Enter the String:");
		String str = sc.nextLine();

		System.out.println("===================");
		findStringDuplicates(str);
	}

}
