package step2_11_array;

public class ArrayEx07 {
	public static void main(String[] args) {
		int[] stNums= {1001,1002, 1003, 1004, 1005};
		int[] score= {87, 11, 45, 98, 23};
		
		int maxScore=0;
		int maxId=0;
		for(int i=0; i<5; i++) {
			if(maxScore<score[i]) {
				maxScore=score[i];
				maxId=i;
			}
		}
		System.out.println("No. 1 Student : "+stNums[maxId]+" (Score : "+maxScore+")");
	}
}
