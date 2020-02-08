package step1_06.IfEx;

import java.util.Scanner;

public class IfEx11_Example {
	public static void main(String[] args) {
		int price1=50;
		int price2=35;
		int price3=15;
		
		System.out.println("--- ABC Store in Honolulu ---");
		System.out.println("#1_Surf Board : $"+price1);
		System.out.println("#2_Ice Tumbler : $"+price2);
		System.out.println("#3_Sun screen : $"+price3);
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number that you want to order : ");
		int select=scan.nextInt();
		
		System.out.println("Please enter a balance due : ");
		int money=scan.nextInt();
		
		// Option1
		if(select==1) {
			if(money >= price1) {
				money=money-price1;
				System.out.println("Your change is : $"+money);
			}
			if(money < price1) {
				System.out.println("You need to pay more!");
			}
		}
		
		if(select==2) {
			if(money >= price2) {
				money=money-price2;
				System.out.println("Your change is : $"+money);
			}
			if(money < price2) {
				System.out.println("You need to pay more!");
			}
		}
		
		if(select==3) {
			if(money >= price3) {
				money=money-price3;
				System.out.println("Your change is : $"+money);
			}
			if(money < price3) {
				System.out.println("You need to pay more!");
			}
		}
		
		// Option2
		int charge = 0;
		if(select==2) {
			charge=money-price2;
		}
		if(select==3) {
			charge=money-price3;
		}
		
		if(charge>=0) {
			System.out.println("Change is : $"+charge);
		}
		if(charge<0) {
			System.out.println("You need to pay more!");
		}
		
	}
}
