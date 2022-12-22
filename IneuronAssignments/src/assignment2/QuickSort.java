package assignment2;

//WAP to sort an array using Quick Sort Algorithm.
public class QuickSort {

	int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i=low-1;
		for(int j=low; j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//Swap the elements
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		//swap pivot
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high] = temp;
		
		return i;
	}

	void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex+1, high);
		}
	}

	// to print array
	static void display(int[] arr) {
		for (int e : arr)
			System.out.print(e + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 5, 4, 2, 6, 5, 42, 3, 2, 6, 4, 9, 8, 2 };

		System.out.println("===== Quick Sort =====");

		System.out.println("Given Array: ");
		display(arr);

		QuickSort obj = new QuickSort();
		obj.quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array: ");
		display(arr);

	}

}
