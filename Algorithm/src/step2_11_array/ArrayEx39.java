package step2_11_array;

public class ArrayEx39 {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		
		int k=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=10*k;
				k+=1;
			}
		}
		
		// Q1) Sum
		int total=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				total+=arr[i][j];
			}
		}
		System.out.println("Q1 = "+total);	
		System.out.println("*************");
		
		// Q2) multiple of 4
		System.out.println("Q2 = ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]%4==0) {
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("*************");

		// Q3) Sum of Q2
		total=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]%4==0) {
					total+=arr[i][j];
				}
			}
		}
		System.out.println("Q3 = "+total);
		System.out.println("*************");

		// Q4) Counts of Q2
		int cnt=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j]%4==0) {
					cnt+=1;
				}
			}
		}
		System.out.println("Q4 = "+cnt);
	}
}
