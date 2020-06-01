package step2_11_array;

import java.util.Scanner;

// 관리비 
public class ArrayEx42 {
	public static void main(String[] args) {
		int[][] apt= {
				{101, 102, 103},
				{201, 202, 203},
				{301, 302, 303}
		};
		int[][] hoa= {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
		};
		
		// Q1) 각 층별 관리비의 합 출력
		for(int i=0; i<3; i++) {
			int sum=0;
			for(int j=0; j<3; j++) {
				sum+=hoa[i][j];
			}
			System.out.println("The sum of "+(i+1)+" floor : "+sum);
		}
		
		// Q2) 입력한 세대 (호수)의 관리비 출력
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a code : ");
		int code=scan.nextInt();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j]==code) {
					System.out.println(hoa[i][j]);
				}
			}
		}
		
	}
}
