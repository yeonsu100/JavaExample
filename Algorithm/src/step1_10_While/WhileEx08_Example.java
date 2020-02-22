package step1_10_While;

import java.util.Scanner;

public class WhileEx08_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int dbAcc1=1111;
		int dbPw1=1234;
		
		int dbAcc2=2222;
		int dbPw2=2345;
		
		int log=-1;
		
		boolean run=true;
		while(run) {
			System.out.println("1. Sign In");
			System.out.println("2. Sign Out");
			System.out.println("0. End");
			
			System.out.println("Select a Menu : ");
			int sel=scan.nextInt();
			
			if(sel==1) {
				if(log==-1) {
					System.out.println("Enter a credit number : ");
					int myAcc=scan.nextInt();
					
					System.out.println("Enter a password number : ");
					int myPw=scan.nextInt();
					
					if(myAcc==dbAcc1 && myPw==dbPw1) {
						log=1;
						System.out.println("Signed In : "+dbAcc1);
					}else if(myAcc==dbAcc2 && myPw==dbPw2) {
						log=2;
						System.out.println("Signed In : "+dbAcc2);
					}else {
						System.out.println("Please confirm account number or password!");
					}
				}else {
					if(log==1) {
						System.out.println("Signed In as "+dbAcc1);
					}else if(log==2) {
						System.out.println("Signed In as "+dbAcc2);
					}
				}
			}else if(sel==2) {
				if(log!=-1) {
					log=-1;
					System.out.println("Singed Out safely");
				}else {
					System.out.println("You need to sign in first!");
				}
			}else if(sel==0) {
				run=false;
				System.out.println("=== The end of Program ===");
			}
		}
	}
}
