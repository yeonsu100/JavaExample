package step1_10_While;

import java.util.Scanner;

public class WhileEx11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int user1=0;
		int user2=0;
		
		int br=0;
		int turn=0;
		
		boolean run=true;
		while(run) {
			if(turn%2 == 0) {
				System.out.println("[User A] Enter a number (1~3) : ");
				user1=scan.nextInt();
				br=br+user1;
				turn += 1;
			}else if(turn%2 == 1) {
				System.out.println("[User B] Enter a number (1~3) : ");
				user2=scan.nextInt();
				br=br+user2;
				turn += 1;
			}
			System.out.println("br = "+br);
			
			if(br >= 31) {
				if(turn%2 == 1) {
					System.out.println("User A is a WINNER!");
				}else if(turn%2 == 1) {
					System.out.println("User B is a WINNER!");
				}
				run=false;
				System.out.println("=== GAME OVER ===");
			}
		}
	}
}
