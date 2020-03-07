package step1_03_variable;

public class VarEx02_example {
	public static void main(String[] args) {
		// 현재 현금이 1000원 있는데, 200원짜리 과자를 구입 후 잔돈을 출력하시오.
		int 현금=1000;
		int 과자=200;
		int 잔돈=현금-과자;
		System.out.println("잔돈은 "+잔돈+"원 입니다.");
		System.out.println("-----------------");
		
		// 문제 1) 월급이 100원이다. 연봉을 계산하시오. (조건 : 세금 10% 제외)
		int sal_monthly=100;
		int sal_year=(int)((sal_monthly*0.9)*12);
		System.out.println("Annual Salary is "+sal_year);
		
		int answer1=(int)(sal_monthly*0.9)*12;
		System.out.println("1. The answer is "+answer1);
		System.out.println("-----------------");

				
		// 문제 2) 시험점수를 각각 30점, 50점, 4점을 받았다고 할 때, 평균을 계산하시오.
		int kor=30;
		int math=50;
		int jpn=4;
		System.out.println((kor+math+jpn)/3);
		
		int answer2=(kor+math+jpn)/3;
		System.out.println("2. The answer is "+answer2);
		System.out.println("-----------------");
		
		// 문자 3) 가로 3, 세로 6인 삼각형의 넓이를 출력하시오.
		int width=3;
		int height=6;
		System.out.println((width*height)/2);
		
		int answer3=(width*height)/2;
		System.out.println("3. The answer is "+answer3);
		System.out.println("-----------------");
		
		// 문제 4) 100초를 1분 40초로 출력하시오.
		int min=(100/60);
		int sec=(100%60);
		System.out.println(min+"min "+sec+"sec.");
		System.out.println("4. The answer is "+min+"min "+sec+"sec.");
		System.out.println("-----------------");
		
		// 문제 5) 800원에서 500원짜리 갯수, 100원짜리 갯수를 출력하시오. 
		int five=(800/500);
		int one=(800%500)/100;
		System.out.println("5. The answer is 500: "+five+", 100: "+one);
		
	}
}
