package step1_07.random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx06_Examlple {
	public static void main(String[] args) {
		Random rd=new Random();
		Scanner scan=new Scanner(System.in);
		
		int com=rd.nextInt(3);
		
		System.out.println("Rock(0), Sciccors(1), Paper(2)");
		int me=scan.nextInt();
		
		if(com == me) {
			System.out.println("We're same!");
		}
		
		if(com==0 && me==1) {
			System.out.println("Lose!");
		}
		if(com==0 && me==2) {
			System.out.println("Win!");
		}
		if(com==1 && me==0) {
			System.out.println("Win!");
		}
		if(com==1 && me==2) {
			System.out.println("Lose!");
		}
		if(com==2 && me==0) {
			System.out.println("Lose!");
		}
		if(com==2 && me==1) {
			System.out.println("Win!");
		}
		
	}
}
