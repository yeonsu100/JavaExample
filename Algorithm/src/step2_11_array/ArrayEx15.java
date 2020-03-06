package step2_11_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		int[] front= {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back=new int[10];
		
		// shuffle
		int i=0;
		while(i<1000) {
			int r=ran.nextInt(10);
			int temp=front[0];
			front[0]=front[r];
			front[r]=temp;
			
			i += 1;
		}
		
		i=0;
		while(i<5) {
			for(int j=0; j<10; j++) {
				System.out.println(front[j]+" ");
			}
			System.out.println();
			for(int j=0; j<10; j++) {
				System.out.print(back[j]+" ");
			}
			System.out.println();
			
			System.out.print("Enter an Index 1 : ");
			int idx1=scan.nextInt();
			System.out.print("Enter an Index 2 : ");
			int idx2=scan.nextInt();
			
			if(front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				i += 1;
			}
		}
	}
}
