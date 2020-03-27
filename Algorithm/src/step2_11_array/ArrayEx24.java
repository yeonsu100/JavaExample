package step2_11_array;

import java.util.Scanner;

public class ArrayEx24 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr= {11, 87, 42, 100, 24};
		
		int cnt=0;
		while(true) {
			for(int i=0; i<5; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			int maxNum=0;
			int maxIdx=0;
			for(int i=0; i<5; i++) {
				if(maxNum < arr[i]) {
					maxNum=arr[i];
					maxIdx=i;
				}
			}
			
			System.out.print("Enter : ");
			int myMaxNum=scan.nextInt();
			
			if(maxNum == myMaxNum) {
				arr[maxIdx]=0;
				cnt += 1;
			}
			
			if(cnt == 5) {
				break;
			}
		}
	}
}
