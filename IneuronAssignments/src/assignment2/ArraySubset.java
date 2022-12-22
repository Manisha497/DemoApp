package assignment2;

import java.util.Scanner;

//WAP to check whether an array is a subset of another array.
public class ArraySubset {
	public boolean isSubset(int[] arr1, int[] arr2) {
		int i=0,j=0;
		//outer loop for arr2
		for(i=0; i<arr2.length;i++) {
			//inner loop for arr1
			for(j=0; j<arr1.length;j++) {
				if(arr2[i]==arr1[j])
					break;
			}
			if(j==arr1.length)
				return false;
		}
		return true;
	}
	
	public void display(int[] arr) {
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("===== Check if an array is "
				+ "subset of another array ======");
		ArraySubset obj = new ArraySubset();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in first array: ");
		int s1 = sc.nextInt();
		int[] arr1 = new int[s1];
		System.out.println("Enter array values: ");
		for(int i=0;i<s1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter number of elements in second array: ");
		int s2 = sc.nextInt();
		int[] arr2 = new int[s2];
		System.out.println("Enter array values: ");
		for(int i=0;i<s2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Array 1 is: ");
		obj.display(arr1);
		
		System.out.println("Array 2 is: ");
		obj.display(arr2);
		
		boolean result = obj.isSubset(arr1, arr2);
		if(result)
			System.out.println("Array2 is subset of Array1");
		else
			System.out.println("Array2 is not a subset of Array1");
		
	}

}
