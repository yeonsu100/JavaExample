package step1_10_While;

import java.util.Scanner;

public class WhileEx14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int maxNum=0;
		
		int i=1;
		while(i<=3) {
			System.out.println("Integer "+i+" Enter : ");
			int num=scan.nextInt();
			
			if(maxNum < num) {
				maxNum=num;
			}
			i += 1;
		}
		System.out.println("Max num is "+maxNum);
	}
}