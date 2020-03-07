package step1_07.random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx05_Example {
	public static void main(String[] args) {
		Random rd=new Random();
		Scanner scan=new Scanner(System.in);
		
		int x=rd.nextInt(8)+2;
		int y=rd.nextInt(9)+1;
		
		int multiple=x*y;
		
		System.out.println(x+"*"+y+"=");
		int answer=scan.nextInt();
		
		if(multiple==answer) {
			System.out.println("That's correct!");
		}
		if(multiple!=answer) {
			System.out.println("Incorrect!");
		}
	}
}
