package step2_11_array;

import java.util.Scanner;

public class ArrayEx29 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] com= {1, 7, 3};
		int[] me=new int[3];
		
		while(true) {
			int strike=0;
			int ball=0;
			
			for(int i=0; i<3; i++) {
				System.out.print("["+(i+1)+"] 1~9 입력 : ");
				int num=scan.nextInt();
				
				int check=1;
				for(int j=0; j<i; j++) {
					if(num==me[j]) {
						check=-1;
					}
				}
				if(check==-1) {
					i-=1;
				}else {
					me[i]=num;
				}
			}
			System.out.print("me= [ ");
			for(int i=0; i<3; i++) {
				System.out.print(me[i]+" ");
			}
			System.out.println(" ]");
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i]==me[j]) {
						if(i==j) {
							strike+=1;
						}else if(i!=j) {
							ball+=1;
						}
					}
				}
			}
			System.out.println("strike ("+strike+") ball ("+ball+")");
			
			if(strike==3) {
				break;
			}
		}
	}
}
