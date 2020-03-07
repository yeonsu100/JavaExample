package step2_11_array;

import java.util.Scanner;

public class ArrayEx09 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] seat=new int[7];
		
		int cnt=0;
		
		boolean run=true;
		while(run) {
			for(int i=0; i<7; i++) {
				if(seat[i] == 0) {
					System.out.print("[ ]");
				}else {
					System.out.print("[*]");
				}
			}
			System.out.println();
			
			System.out.println("=== Movie Box ===");
			System.out.println("1. Reserve a seat");
			System.out.println("2. Terminate");
			
			System.out.println("Select a Menu");
			int sel=scan.nextInt();
			
			if(sel == 1) {
				System.out.println("Select a seat number (1~7) : ");
				int idx=scan.nextInt();
				idx -= 1;
				
				if(seat[idx] == 0) {
					seat[idx]=1;
					cnt += 1;
				}else {
					System.out.println("This seat is already reserved.");
				}
			}else if(sel == 2) {
				int fee=cnt*12000;
				System.out.println(fee);
				
				run=false;
			}
		}
	}
}
