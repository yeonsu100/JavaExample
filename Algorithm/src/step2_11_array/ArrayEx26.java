package step2_11_array;

import java.util.Scanner;

public class ArrayEx26 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] game= {0, 0, 1, 0, 2, 0, 0, 1, 0};
		
		int player=0;
		for(int i=0; i<9; i++) {
			if(game[i] == 2) {
				player=i;
			}
		}
		while(true) {
			for(int i=0; i<9; i++) {
				if(game[i] == 2) {
					System.out.print("옷 ");
				}else {
					System.out.print(game[i]+" ");
				}
			}
			System.out.println();
			
			System.out.print("왼쪽[1] 오른쪽[2] 입력 : ");
			int move=scan.nextInt();
			
			if(move == 1) {
				if(player-1 >= 0) {
					if(game[player-1] == 1) {
						System.out.print("격파[3] 입력 : ");
						int punch=scan.nextInt();
						if(punch != 3) {
							continue;
						}
					}
					game[player-1]=2;
					game[player]=0;
					player-=1;
				}
			}
			else if(move == 2) {
				if(player+1 < 9) {
					if(game[player+1] == 1) {
						System.out.print("격파[3] 입력 : ");
						int punch=scan.nextInt();
						if(punch != 3) {
							continue;
						}
					}
					game[player+1]=2;
					game[player]=0;
					player+=1;
				}
			}
		}
	}
}
