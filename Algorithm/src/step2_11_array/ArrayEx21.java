package step2_11_array;

import java.util.Scanner;

public class ArrayEx21 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr= {10, 20, 0, 0, 0};
		int cnt=2;
		
		boolean run=true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("[3] Insert");
			
			System.out.print("Select a menu : ");
			int sel=scan.nextInt();
		
			if(sel==3) {
				if(cnt==5) {
					System.out.println("Can't insert number anymore!");
					continue;
				}
				
				System.out.print("Select a position for insert : ");
				int idx=scan.nextInt();
				
				if(cnt<idx||idx<0) {
					System.out.println("Can't insert that position!");
					continue;
				}
				
				System.out.println("Enter a number : ");
				int data=scan.nextInt();
				
				for(int i=cnt; i>idx; i--) {
					arr[i]=arr[i-1];
				}
				arr[idx]=data;
				cnt+=1;
			}
		}
	}
}