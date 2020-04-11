package step2_11_array;

public class ArrayEx33 {
	public static void main(String[] args) {
		int[] score= {10, 50, 30, 40, 80, 7};
		
		for(int i=0; i<6; i++) {
			int maxNum=score[i];
			int maxIdx=i;
			for(int j=i; j<6; j++) {
				if(maxNum<score[j]) {
					maxNum=score[j];
					maxIdx=j;
				}
			}
			
			int temp=score[i];
			score[i]=score[maxIdx];
			score[maxIdx]=temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(score[i]+" ");
		}
		System.out.println();
	}
}
