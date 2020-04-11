package step2_11_array;

import java.util.Random;

public class ArrayEx28 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		int[] arr=new int[5];
		
		int i=0;
		while(i<5) {
			int rNum=ran.nextInt(10)+1;
			
			int check=1;
			int j=0;
			while(j<i) {
				if(rNum==arr[j]) {
					check=-1;
				}
				j+=1;
			}
			if(check==1) {
				arr[i]=rNum;
				i+=1;
			}
		}
		for(int j=0; j<5; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
}
