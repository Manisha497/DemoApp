package assignment2;

//WAP to sort an array using Selection Sort Algorithm.
public class SelectionSort {
	void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index])
					min_index=j;
			}
			//swap arr[i] with minimum
			if(i!=min_index) {
				int temp = arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
	void display(int[] arr) {
		for(int e:arr)
			System.out.print(e+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,32,4,2,2,6,5,3,2,6,4,9,8,12};
		
		SelectionSort obj = new SelectionSort();
		
		System.out.println("===== Selection Sort =====");
		
		System.out.println("Given Array: ");
		obj.display(arr);
		
		obj.sort(arr);
		
		System.out.println("Sorted Array: ");
		obj.display(arr);
	}

}
