package step2_11_array;

import java.util.Scanner;

public class ArrayEx19 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr= {10, 20, 0, 0, 0};
		int cnt=2;
		
		boolean run=true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("Add a [1]");
			int sel=scan.nextInt();
			
			if(sel==1) {
				if(cnt==5) {
					System.out.println("Can't add anymore!");
					continue;
				}
				
				System.out.print("Enter a number for add : ");
				int data=scan.nextInt();
				
				arr[cnt]=data;
				
				cnt += 1;
			}
		}
	}
}
