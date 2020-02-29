package step1_10_While;

import java.util.Scanner;

public class WhileEx09_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int myAcc=1111;
		int myMoney=50000;
		
		int yourAcc=2222;
		int yourMoney=70000;
		
		boolean run=true;
		while(run) {
			System.out.println("1. deposit");
			System.out.println("2. withdrawl");
			System.out.println("3. transfer");
			System.out.println("4. check");
			System.out.println("5. terminate");
			
			System.out.println("Select a menu");
			int sel=scan.nextInt();
			
			if(sel==1) {
				System.out.println("Insert your money here : ");
				int money=scan.nextInt();
				
				myMoney=myMoney+money;
				System.out.println("Successfully finished.");
			}else if(sel==2) {
				System.out.println("How much do you need? : ");
				int money=scan.nextInt();
				
				if(money<=myMoney) {
					myMoney=myMoney-money;
					System.out.println("Successfully finished.");
				}else {
					System.out.println("The balance is short.");
				}
			}else if(sel==3) {
				System.out.println("Enter a number to transfer : ");
				int acc=scan.nextInt();
				
				if(acc==yourAcc) {
					System.out.println("How much do you transfer? : ");
					int money=scan.nextInt();
					
					if(money<=myMoney) {
						myMoney=myMoney-money;
						yourMoney=yourMoney+money;
						System.out.println("Successfully finished.");
					}else {
						System.out.println("The balance is short.");
					}
				}else if(sel==4) {
					System.out.println("My money = "+myMoney);
					System.out.println("Your money = "+yourMoney);
				}else if(sel==0) {
					run=false;
					System.out.println("=== The end of Program ===");
				}
			}
			
		}
	}
}
