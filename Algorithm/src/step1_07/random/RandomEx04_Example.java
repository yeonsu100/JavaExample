package step1_07.random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx04_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rd=new Random();
		
		int rnum=rd.nextInt(100)+1;
		
		System.out.println("Even OR Odd? : "+rnum);
		System.out.println("1. Even");
		System.out.println("2. Odd");
		
		System.out.println("Choose one please!");
		int choice=scan.nextInt();
		
		if(choice==1) {
			if(rnum%2==1) {
				System.out.println("That's correct!");
			}
			if(rnum%2==0) {
				System.out.println("Incorrect!");
			}
		}
		
		if(choice==2) {
			if(rnum%2==0) {
				System.out.println("That's correct!");
			}
			if(rnum%2==1) {
				System.out.println("Incorrect!");
			}
		}
		
	}
}
