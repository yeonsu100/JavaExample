package step2_11_array;

import java.util.Scanner;

public class ArrayEx14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] game= {0, 0, 2, 0, 0, 0, 0};
		
		int player=0;
		for(int i=0; i<7; i++) {
			if(game[i] == 2) {
				player=i;
			}
		}
		
		boolean run=true;
		while(run) {
			for(int i=0; i<7; i++) {
				if(game[i] == 2) {
					System.out.print("! ");
				}else {
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			
			System.out.print("Left[1] | Right[2] : ");
			int move=scan.nextInt();
			
			if(move == 1) {
				if(player-1 >= 0) {
					game[player-1]=2;
					game[player]=0;
					player -= 1;
				}
			}
			else if(move == 2) {
				if(player+1 < 7) {
					game[player+1]=2;
					game[player]=0;
					player += 1;
				}
			}
		}
	}
}
