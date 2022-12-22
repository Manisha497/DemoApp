package assignment4;

import java.util.Scanner;

public class MaxOccurence {
	static void findMaxOccurrence(String str) {
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
		
		int max=freq[0];
		int max_index=0;
		for(int i=1; i<freq.length;i++) {
			if(freq[i]>max) {
				max=freq[i];
				max_index=i;
			}
		}
		
		//print max occurred element 
		System.out.println("================");
		System.out.println(arr[max_index]+" is the max occurred element. "
				+ "It occurred "+ max+" times.");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("max occurrence of character in string");
		System.out.println("-------------------------------");
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		findMaxOccurrence(str);

	}

}
