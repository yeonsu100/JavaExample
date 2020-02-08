package step1_07.random;

import java.util.Random;
import java.util.Scanner;

public class RandomEx02_Example {
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner scan=new Scanner(System.in);
		
		int coin=ran.nextInt(2);
		
		if(coin==0) {
			System.out.println("FRONT");
		}
		if(coin==1) {
			System.out.println("BACK");
		}
		
		System.out.print("Front is 0, Back is 1. Insert one : ");
		int insertNum=scan.nextInt();
		
		if(coin==insertNum) {
			System.out.println("That's correct!");
		}
		if(coin!=insertNum) {
			System.out.println("Incorrect!");
		}	
	}
}
