package step2_11_array;

import java.util.Scanner;

public class ArrayEx27 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int exit=10;
		
		int[] game= {11, 15, 10, 14, 12, 13};
		
		while(true) {
			System.out.println("EXIT = "+exit);
			for(int i=0; i<6; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println();
			
			System.out.println("Insert : ");
			int idx=scan.nextInt();
			if(exit==game[idx]) {
				exit+=1;
			}
			if(exit==16) {
				break;
			}
		}
	}
}
