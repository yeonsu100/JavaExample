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
		
		// Q3) 관리비가 가장 많이 / 적게 나온 집 각각 출력
		int idx1=0;
		int idx2=0;
		
		// 가장 많이 나온집
		int maxHoa=hoa[0][0];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(maxHoa<hoa[i][j]) {
					maxHoa=hoa[i][j];
					idx1=i;
					idx2=j;
				}
			}
		}
		System.out.println("Maximum : "+apt[idx1][idx2]);
		
		// 가장 적게 나온집
		int minHoa=hoa[0][0];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(minHoa>hoa[i][j]) {
					minHoa=hoa[i][j];
					idx1=i;
					idx2=j;
				}
			}
		}
		System.out.println("Minimum : "+apt[idx1][idx2]);
	
		// Q4) 입력한 2개 세대의 관리비 교체 
		System.out.print("Enter an address code 1 : ");
		int code1=scan.nextInt();
		System.out.println("Enter an address code 2 : ");
		int code2=scan.nextInt();
		
		int idx1_i=0;
		int idx1_j=0;
		int idx2_i=0;
		int idx2_j=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(apt[i][j]==code1) {
					idx1_i=i;
					idx1_j=j;
				}
				if(apt[i][j]==code2) {
					idx2_i=i;
					idx2_j=j;
				}
			}
		}
		
		int temp=hoa[idx1_i][idx1_j];
		hoa[idx1_i][idx1_j]=hoa[idx2_i][idx2_j];
		hoa[idx2_i][idx2_j]=temp;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(hoa[i][j]+" ");
			}
		}
	}
}
