package step2_11_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx25 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		int[] arr=new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i]=i+1;
		}
		for(int i=0; i<1000; i++) {
			int r=ran.nextInt(9);
			int temp=arr[0];
			arr[0]=arr[r];
			arr[r]=temp;
		}
		int num=1;
		while(true) {
			System.out.println("["+num+"]");
			for(int i=0; i<9; i++) {
				System.out.println(arr[i]+"\t");
				if(i%3==2) {
					System.out.println("\n");
				}
			}
			System.out.print("Enter : ");
			int idx=scan.nextInt();
			
			if(arr[idx]==num) {
				arr[idx]=0;
				num+=1;
			}
			if(num==10) {
				break;
			}
		}
	}
}
