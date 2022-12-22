package assignment2;

public class JaggedArray {

	public static void main(String[] args) {
		System.out.println("====== Jagged Array =====");
		//2D Jagged array
		int[][] arr2 = new int[3][];
		arr2[0] = new int[]{2,4,1};
		
		arr2[1] = new int[2];
		arr2[1][0] = 2;
		arr2[1][1] = 9;
		
		arr2[2] = new int[]{5,7,2,1,6,3};
		
		System.out.println("The given 2D Jagged array is: ");
		for(int a[]:arr2) {
			for(int ele: a) {
				System.out.print(ele +" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		//3D Jagged array
		int[][][] arr3 = new int[3][][];
		arr3[0] = new int [][] {{1,2},{3,4},{5,6},{7,8}};
		
		arr3[1] = new int[][] {{2,4}};
		
		arr3[2] = new int[][] {{3,5,6,7},{2,1,2,1}};
		
		System.out.println("The given 3D Jagged array is : ");
		for(int a[][]: arr3) {
			for(int a1[]: a) {
				for(int ele: a1) {
					System.out.print(ele+" ");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
//		System.out.println("arr3 length is: "+arr3.length);
//		System.out.println(arr3);//3D
//		System.out.println("arr3[1] length is: "+arr3[1].length);
//		System.out.println(arr3[1]);//2D
//		System.out.println("arr3[0][0] length is: "+arr3[0][0].length);
//		System.out.println(arr3[0][0]);//1D
//		System.out.println(arr3[2][0].length);
//		System.out.println(arr3[2][0][3]);//element
	}

}
