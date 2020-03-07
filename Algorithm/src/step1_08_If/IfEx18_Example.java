package step1_08_If;

import java.util.Random;
import java.util.Scanner;

public class IfEx18_Example {
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Welcome. And thank you for using our public transportation. \n"
				+ "The fare is here and this is ruled by law. \nEnjoy your travel! \n");
		System.out.println("============== The Fare ==============");
		System.out.println("1 to 5 stations : $5 \n"
						+ "6 to 10 stations : $6 \n"
						+ "10 to 15 stations : $7 \n"
						+ "over 16 stations are all $10 (Basic Prices) \n"
						+ "Thank you.");
		System.out.println("======================================\n");
		System.out.println("Enter a counting number that you'll pass the stations. : ");
		int station=scan.nextInt();
		
		int fare=0;
		if(station >= 1 && station <= 5) {
			System.out.println("You need to pay $5 for fare!");
		}else if(station <=6 && station <=10){
			System.out.println("You need to pay $6 for fare!");
		}else if(station <=11 && station <=15){
			System.out.println("You need to pay $7 for fare!");
		}else {
			System.out.println("You need to pay $10 for fare!");
		}
	}
}
