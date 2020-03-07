package step2_11_array;

import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] lotto1= {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2= {0, 0, 7, 7, 0, 0, 7, 0};
		int[] lotto3= {7, 0, 7, 7, 7, 0, 7, 0};
		
		boolean run=true;
		while(run) {
			System.out.println("Result 1");
			System.out.println("Result 2");
			System.out.println("Result 3");
			
			System.out.print("Select a Menu");
			int sel=scan.nextInt();
			
			if(sel == 1) {
				
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				int check = -1;
				int cnt=0;
				for(int i=0; i<8; i++) {
					if(lotto1[i] == 7) {
						cnt += 1;
						if(cnt == 3) {
							check=1;
						}
					}else {
						cnt=0;
					}
				}
				if(check == 1) {
					System.out.println("WIN!!!");
				}else {
					System.out.println("LOSE...");
				}
			}
		}
	}
}
