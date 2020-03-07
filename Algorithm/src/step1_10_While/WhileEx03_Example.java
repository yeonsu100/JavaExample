package step1_10_While;

public class WhileEx03_Example {
	public static void main(String[] args) {
		// 문제 1) 1~5까지의 합 출
		int total=0;
		int i=1;
		while(i<=5) {
			total=total+i;
		/*
		 * total = 0+1 = 1
		 * total = 1+2 = 3
		 * total = 3+3 = 6
		 * total = 6+4 = 10
		 * total = 10+5 = 15
		 */
			i=i+1;
		}
		System.out.println("total = "+total);
		
		// 문제 2) 1~10까지 반복해 3미만 7이상 출력
		i=1;
		while(i<=10) {
			if(7<=i || i<3) {
				System.out.println(i+" ");
			}
			i=i+1;
		}
		System.out.println();
		
		// 문제 3) 문제 2의 조건에 맞는 수들의 합 출력
		total=0;
		i=1;
		while(i<=10) {
			if(7<=i || i<3) {
				total=total+i;
			}
			i=i+1;
		}
		System.out.println("total = "+total);
		
		// 문제 4) 문제 2의 조건에 맞는 수들의 개수 출력
		int count=0;
		i=1;
		while(i<=10) {
			if(7<=i || i<3) {
				count=count+1;
			}
			i=i+1;
		}
		System.out.println("count = "+count);
	}
}
}
