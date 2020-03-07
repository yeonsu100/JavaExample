package step1_10_While;

import java.util.Scanner;

public class WhileEx06_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int run=1;
		while(run==1) {
			System.out.println("Enter a number [EXIT : -100] : ");
			int num=scan.nextInt();
			
			if(num==-100) {
				System.out.println("The end of program");
				run=0;
			}
		}
	}
}
