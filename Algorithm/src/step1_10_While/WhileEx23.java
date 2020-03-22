package step1_10_While;

import java.util.Scanner;

public class WhileEx23 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter an Integer number");
		int num=scan.nextInt();
		
		for(int i=2; i<=num; i++) {
			int cnt=0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
