package assignment2;

//WAP to find the duplicates present in an array.
//also printing frequency of duplicates
public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] arr = new int[] {1,5,4,2,6,5,42,3,2,6,4,9,8,2};
		
		int[] a = new int[arr.length];
		int[] freq = new int[arr.length];
		int remark = -1;
		
		System.out.println("Given array: ");
		for(int e: arr) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		//calculating frequency of each element
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=remark;
				}
			}
			if(freq[i]!=remark)
				freq[i]=count;
		}
		//print elements that occurred more than once
		System.out.println("--------------------");
		System.out.println("The elements which occured more than once are:");
		for(int i=0;i<a.length;i++) {
			if(freq[i]>1) {
				System.out.println(arr[i]+" occured "+freq[i]+" times.");
			}
		}
		
	}

}
