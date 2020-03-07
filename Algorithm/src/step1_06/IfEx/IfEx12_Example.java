package step1_06.IfEx;

import java.util.Scanner;

// 최댓값 구하기 
public class IfEx12_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number 1 : ");
		int num1=scan.nextInt();
		
		System.out.println("Enter a number 2 : ");
		int num2=scan.nextInt();
		
		System.out.println("Enter a number 3 : ");
		int num3=scan.nextInt();
		
		int maxnum=num1;
		if(maxnum < num2) {
			maxnum=num2;
		}
		if(maxnum<num3) {
			maxnum=num3;
		}
		
		System.out.println("The MAXINUM number is : "+maxnum);
	}
}
