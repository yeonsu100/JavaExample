package step2_11_array;

public class ArrayEx41 {
	public static void main(String[] args) {
		int[][] arr= {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
		};
		
		int[] width=new int[3];
		int[] height=new int[4];
		
		// 가로 합 출력, 세로 합 출력 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				width[i]+=arr[i][j];
				height[j]+=arr[i][j];
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(width[i]+" ");
		}
		System.out.println();
		for(int i=0; i<4; i++) {
			System.out.print(height[i]+" ");
		}
	}
}
