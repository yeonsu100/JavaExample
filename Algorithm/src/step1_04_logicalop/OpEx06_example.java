package step1_04_logicalop;

public class OpEx06_example {
	public static void main(String[] args) {
		// 점수가 60점 이상이면 true 출력
		int score=30;
		System.out.println(score>=60);
		System.out.println("---------");
		
		// 문제 1) 3의 배수이면 true 출력
		// *힌트 : 숫자%3==0 (3의 배수)
		int triple=99;
		System.out.println(triple%3==0);
		int twice=20;
		System.out.println(twice%3==0);
		System.out.println("---------");

		
		// 문제 2) 짝수면 true 출력
		// *힌트 : 숫자%2==0 (짝수) | 숫자%2==1 (홀수)
		int even=50;
		System.out.println(even%2==0);
		System.out.println(even%2==1);
		int odd=17;
		System.out.println(odd%2==0);
		System.out.println(odd%2==1);
		System.out.println("---------");
		
		// 문제 3) 다음의 금액 중 1000원짜리 이상의 화폐를 제외한 1000원짜리가 3장 이상이면 true 출력
		int money=178600;
		int result1=(178600/1000);
		boolean result2=result1>=3;
		System.out.println(result1);
		System.out.println(result2);
	}
}
