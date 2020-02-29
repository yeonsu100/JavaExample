package step1_10_While;

import java.util.Scanner;

public class WhileEx13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num=scan.nextInt();
		
		int cnt=0;
		
		int i=1;
		while(i <= num) {
			if(num%i == 0) {
				cnt += 1;
			}
			i += 1;
		}
		if(cnt == 2) {
			System.out.println("This is a prime number");
		}else {
			System.out.println("This is NOT a prime number");
		}
	}
}
