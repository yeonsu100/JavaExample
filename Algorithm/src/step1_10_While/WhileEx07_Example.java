package step1_10_While;

import java.util.Random;
import java.util.Scanner;

public class WhileEx07_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		int com=ran.nextInt(100)+1;
		System.out.println("Enter = "+com);
		
		int score=100;
		int count=0;
		
		boolean run=true;
		while(run==true) {
			System.out.println("Enter a number [1~100] : ");
			int me=scan.nextInt();
			
			if(com>me) {
				System.out.println("Up!");
				count=count+1;
			}else if(com<me) {
				System.out.println("Down!");
				count=count+1;
			}else if(com==me) {
				System.out.println("Bingo!");
				run=false;
			}
		}
		
		score=score-5*count;
		System.out.println("The score is "+score);
		
	}
}
