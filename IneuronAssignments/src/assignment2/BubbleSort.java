package assignment2;

//WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort {
	//sorting logic
	void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	//to print array
	void display(int[] arr) {
		for(int e:arr)
			System.out.print(e+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,32,4,2,2,6,5,3,2,6,4,9,8,12};
		
		BubbleSort obj = new BubbleSort();
		
		System.out.println("===== Bubble Sort =====");
		
		System.out.println("Given Array: ");
		obj.display(arr);
		
		obj.sort(arr);
		
		System.out.println("Sorted Array: ");
		obj.display(arr);

	}

}
