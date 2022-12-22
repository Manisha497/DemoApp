package assignment4;

import java.util.Scanner;

public class MaxOccurenceDemo {
	static void findMaxOccurrence(String str) {
		// convert String to char array
		char[] arr = str.toCharArray();

//		// calculating frequency of each element
//		int[] freq = new int[arr.length];
//		int remark = -1;
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//					freq[j] = remark;
//				}
//			}
//			if (freq[i] != remark)
//				freq[i] = count;
//		}
//		
//		int max=freq[0];
//		for(int i=1; i<freq.length;i++) {
//			if(freq[i]>max) {
//				max=freq[i];
//			}
//		}
		
		int[][] a = new int[arr.length][2];
		int remark=-1;
		for(int i=0; i<a.length;i++) {
			int count=1;
			a[i][0]=arr[i];
			for(int j=i+1; j<a.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					a[j][1]=remark;
				}
			}
			if(a[i][1] != remark)
				a[i][1]=count;
		}
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				if(j==0)
					System.out.print((char)a[i][j]+ " ");
				else
					System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		findMaxOccurrence(str);

	}

}
