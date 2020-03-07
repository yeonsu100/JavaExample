package step2_11_array;

import java.util.Scanner;

public class ArrayEx06 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] stNums= {1001, 1002, 1003, 1004, 1005};
		int[] score= {87, 11, 45, 98, 23};
		
		System.out.println("Enter a Studend ID : ");
		int stNum=scan.nextInt();
		
		int check=-1;
		for(int i=0; i<5; i++) {
			if(stNums[i] == stNum) {
				check=i;
			}
		}
		
		if(check == -1) {
			System.out.println("The ID is NOT exist.");
		}else {
			System.out.println(score[check]);
		}
	}
}
