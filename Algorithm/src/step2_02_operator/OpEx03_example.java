package step2_02_operator;

public class OpEx03_example {
	public static void main(String[] args) {
		// 예제) 현재 현금이 1,000원 있다. 200원짜리 과자를 구입한 후 잔돈을 출력하시오.
		System.out.println(1000-200);
		System.out.println("Bank balance is "+(1000-200));
		
		System.out.println("--------------------------------------------");
		
		// 문제 1) 월급이 100원이다. 연봉을 계산하시오. (조건 : 세금 10% 제외)
		System.out.println((100*0.9)*12);
		
		// 문제 2) 시험점수를 각각 30점, 50점, 4점을 받았다고 할 때, 평균을 계산하시오.
		System.out.println((30+50+4)/3);
		
		// 문자 3) 가로 3, 세로 6인 삼각형의 넓이를 출력하시오.
		System.out.println((3*6)/2);
		
		// 문제 4) 100초를 1분 40초로 출력하시오.
		System.out.println((100/60)+"분 "+(100%60)+"초");
		
		// 문제 5) 800원에서 500원짜리 갯수, 100원짜리 갯수를 출력하시오. 
		System.out.println("500원짜리 갯수 = "+(800/500)+" AND "+"100원짜리 갯수 = "+((800-500)/100));
	
	}
}
