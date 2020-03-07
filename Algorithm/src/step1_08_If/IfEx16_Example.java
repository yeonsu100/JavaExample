package step1_08_If;

import java.util.Random;
import java.util.Scanner;

public class IfEx16_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rd=new Random();
		
		int num=rd.nextInt(101)+150;
		System.out.println("Example : "+num);
		
		int answer=num%100/10;
		
		System.out.println("Enter a middle number : ");
		int myAnswer=scan.nextInt();
				
		if(answer==myAnswer) {
			System.out.println("That's correct!");
		}else {
			System.out.println("Incorrect!");
		}
	}
}
