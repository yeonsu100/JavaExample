package step2_11_array;

import java.util.Scanner;

public class ArrayEx18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] game= {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1= {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2= {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn=0;
		
		int idx1=0;
		int idx2=0;
		p1[idx1]=1;
		p2[idx2]=2;
		
		int win1=0;
		int win2=0;
		
		boolean run=true;
		while(run) {
			for(int i=0; i<8; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println();
			
			for(int i=0; i<8; i++) {
				System.out.print(p1[i]+" ");
			}
			System.out.print("["+win1+" turn]");
			System.out.println();
			
			for(int i=0; i<8; i++) {
				System.out.print(p2[i]+" ");
			}
			System.out.print("["+win2+" turn]");
			System.out.println("\n");
			
			if(turn%2 == 0) {
				System.out.print("[P1] Enter a number 1~3");
				int move=scan.nextInt();
				
				p1[idx1]=0;
				idx1=idx1+move;
				
				if(idx1 >= 8) {
					win1 += 1;
				}
				
				idx1=idx1%8;
				
				p1[idx1]=1;
			}else if(turn%2 == 1) {
				System.out.print("[P2] Enter a number 1~3");
				int move=scan.nextInt();
				
				p2[idx2]=0;
				idx2=idx2+move;
				
				if(idx2 >= 8) {
					win2 += 1;
				}
				
				idx2=idx2%8;
				
				p2[idx2]=2;
			}
			
			if(idx1==idx2 && idx1!=0 && turn%2==0) {
				System.out.println("[P1] caught [P2]");
				p2[idx2]=0;
				idx2=0;
				p2[idx2]=2;
			}else if(idx1==idx2 && idx2!=0 && turn%2==1) {
				System.out.println("[P2] caught [P1]");
				p1[idx1]=0;
				idx1=0;
				p1[idx1]=1;
			}
			turn += 1;
			
			if(win1 == 3) {
				System.out.println("WINNER : [P1]");
				break;
			}else if(win2 == 3) {
				System.out.println("WINNER : [P2]");
				break;
			}
		}
	}
}
