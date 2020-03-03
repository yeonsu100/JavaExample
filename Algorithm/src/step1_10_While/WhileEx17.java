package step1_10_While;

import java.util.Scanner;

public class WhileEx17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;
		while(run) {
			System.out.println("1. Western Food");
			System.out.println("2. Korean Food");
			System.out.println("3. Terminate");
			
			System.out.println("Select a menu : ");
			int sel=scan.nextInt();
			
			if(sel==1) {
				boolean exit=true;
				while(exit) {
					System.out.println("(1) Rice");
					System.out.println("(2) Noodle");
					System.out.println("(3) Go to the Back page");
					
					System.out.println("Select a menu : ");
					int choice=scan.nextInt();
					
					if(choice==1) {}
					else if(choice==2) {}
					else if(choice==3) {
						exit=false;
					}
				}
				
			}
			else if(sel==2) {}
			else if(sel==3) {
				run=false;
				System.out.println("=== Terminate this program ===");
			}
		}
	}
}
