package step1_08_If;

import java.util.Random;
import java.util.Scanner;

public class IfEx14_Example {
	public static void main(String[] args) {
		Random rd=new Random();
		Scanner scan=new Scanner(System.in);
		
		int com=rd.nextInt();
		
		System.out.println("Rock(0), Sciccors(1), Paper(2)");
		int me=scan.nextInt();
				
		if(com==me) {
			System.out.println("We're same!");
		}else if(com==1 && me==0) {
			System.out.println("Win!");
		}else if(com==2 && me==1) {
			System.out.println("Win!");
		}else if(com==0 && me==2) {
			System.out.println("Win!");
		}else {
			System.out.println("Lose!");
		}
		
	}
}
