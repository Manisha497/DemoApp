package assignment2;

//WAP to sort an array using Merge Sort Algorithm.
public class MergeSort {
	void sort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = left + (right-left)/2;
			
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
	}
	
	void merge(int[] arr, int left, int mid, int right) {
		int[] left_arr = new int[mid-left+1];
		int[] right_arr = new int[right-mid];
		
		for (int i = 0; i < mid-left+1; ++i)
            left_arr[i] = arr[left + i];
        for (int j = 0; j < right-mid; ++j)
            right_arr[j] = arr[mid + 1 + j];
		
        
        int i = 0, j = 0;
        
        // Initial index of merged subarray array
        int k = left;
        while (i <mid-left+1  && j < right-mid) {
            if (left_arr[i] <= right_arr[j]) {
                arr[k] = left_arr[i];
                i++;
            }
            else {
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }
        while(i<mid-left+1) {
        	arr[k]=left_arr[i];
        	i++;
        	k++;
        }
        while(j<right-mid) {
        	arr[k]=right_arr[j];
        	j++;
        	k++;
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
		
		MergeSort obj = new MergeSort();
		
		System.out.println("===== Merge Sort =====");
		
		System.out.println("Given Array: ");
		obj.display(arr);
		
		obj.sort(arr,0,arr.length-1);
		
		System.out.println("Sorted Array: ");
		obj.display(arr);
	}

}
