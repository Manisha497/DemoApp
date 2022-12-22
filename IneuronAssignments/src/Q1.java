//WAP to print your name & INEURON
public class Q1 {

	public static void main(String[] args) {
		int n = 10;
		//print name "MANISHA"
		for(int i=0;i<n;i++) {
			//M
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i+j==(n-1)&&i<=(n-1)/2
					|| i==j&&i<=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//A
			for(int j=0;j<n;j++) {
				if(i==0&&j<3*n/4&&j>0 || j==0&&i>0|| j==3*n/4&&i>0 || i==(n-1)/2&&j<=3*n/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//N
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			//I
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			//S
			for(int j=0;j<n;j++) {
				if(i==0&&j>0&&j<n-1 || i==n-1&&j>0&&j<n-1|| i==(n-1)/2&&j>0&&j<n-1 
					|| j==0&&i>0&&i<(n-1)/2 || j==(n-1)&&i<(n-1)&&i>(n-1)/2) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			//H
			for(int j=0;j<n;j++) {
				if(j==0 || j==3*n/4 || i==(n-1)/2&&j<3*n/4) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			//A
			for(int j=0;j<n;j++) {
				if(i==0&&j<3*n/4&&j>0 || j==0&&i>0|| j==3*n/4&&i>0 || i==(n-1)/2&&j<=3*n/4)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//print name "INEURON"
		for(int i=0; i<n; i++) {
			//I
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			//N
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//E
			for(int j=0; j<n; j++) {
				if(j==0 || i==0&&j<=3*n/4 ||i==(n-1)/2&&j<=(n-1)/2
						|| i==(n-1)&&j<=3*n/4)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			
			//U
			for(int j=0; j<n; j++) {
				if(j==0&&i<n-1 || j==3*n/4&&i<n-1 || i==n-1 && j>0 && j<3*n/4)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			
			//R
			for(int j=0; j<n; j++) {
				if(j==0 || j==3*n/4&&i>0&&i!=(n-1)/2 
					||i==0&j>=0&&j<3*n/4
					||i==(n-1)/2&&j<3*n/4)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			
			//O
			for(int j=0;j<n;j++) {
				if(i==0&&j>0&&j<3*n/4
					||i==n-1&&j>0&&j<3*n/4
					||j==0&&i>0&&i<n-1
					||j==3*n/4&&i>0&&i<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			//N
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1
					|| i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		

	}

}
