package step2_11_array;

import java.util.Scanner;

public class ArrayEx22 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] accs= {1001, 1002, 0, 0, 0};
		int[] pws= {1111, 2222, 0, 0, 0};
		
		int cnt=2;
		
		boolean run=true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.println((i+1)+"."+accs[i]+":"+pws[i]);
			}
			System.out.println();
			
			System.out.println("1. Enrollment");
			System.out.println("2. Withdraw");
			
			System.out.println("- Select a menu -");
			int sel=scan.nextInt();
			
			if(sel == 1) {
				if(cnt == 5) {
					System.out.println("Can't enroll anymore!");
					continue;
				}
				System.out.println("[Enrollment] Enter an account number : ");
				int myAcc=scan.nextInt();
				
				int check=1;
				for(int i=0; i<cnt; i++) {
					if(accs[i] == myAcc) {
						check=-1;
					}
				}
				
				if(check == -1) {
					System.out.println("Please avoid a duplication!");
				}else {
					System.out.println("[Enrollment] Enter an account number : ");
					int myPw=scan.nextInt();
					
					accs[cnt]=myAcc;
					pws[cnt]=myPw;
					cnt += 1;
				}
			}else if(sel == 2) {
				System.out.println("[Withdraw] Enter an account number : ");
				int myAcc=scan.nextInt();
				
				int check=-1;
				for(int i=0; i<cnt; i++) {
					if(accs[i] == myAcc) {
						check=i;
					}
				}
				
				if(check == -1) {
					System.out.println("This account is NOT exist!");
				}else {
					for(int i=check; i<cnt-1; i++) {
						accs[i]=accs[i+1];
						pws[i]=pws[i+1];
					}
					cnt -= 1;
				}
			}
		}
	}
}