package step2_11_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		int[] arr=new int[4];
		int[] check=new int[4];
		
		int i=0;
		while(i<4) {
			int r=ran.nextInt(4);
			
			if(check[r] == 0) {
				check[r] =1;
				arr[i] = r+1;
				i += 1;
			}
		}
		
		int cnt=1;
		
		int j=0;
		while(j<4) {
			for(int k=0; k<4; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			
			System.out.print("Enter : ");
			int idx=scan.nextInt();
			
			if(arr[idx] == cnt) {
				arr[idx] = 9;
				cnt += 1;
				j += 1;
			}
		}
	}
}