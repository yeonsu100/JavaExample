package step1_10_While;

// 반복문 기본문제 (1단계) 
public class WhileEx02_Example {
	public static void main(String[] args) {
		// 문제 1) 1~10 반복하여 5~9 출
		int i=1;
		while(i<=10) {
			if(5<=i && i<=9) {
				System.out.println(i+" ");
			}
			i=i+1;
		}
		System.out.println();
		
		// 문제 2) 10~1 반복하여 6~3 역순으로 출력
		i=10;
		while(i>=1) {
			if(3<=i && i<=6) {
				System.out.println(i+" ");
			}
			i=i-1;
		}
		System.out.println();
		
		// 문제 3) 1~10 반복해 짝수만 출력
		i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
			i=i+1;
		}
		
	}
}
