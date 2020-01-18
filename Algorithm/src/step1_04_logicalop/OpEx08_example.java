package step1_04_logicalop;

public class OpEx08_example {
	public static void main(String[] args) {
		// 예) 3의 배수이면서 짝수이면 true출력
		int num=12;
		System.out.println(num%3 == 0 && num%2 == 0);
		
		// 문제 1) 3과목의 평균이 60점 이상이면 true를 출력하시오.
		//		 단, 어느 한 과목이라도 50점 미만이면 false
		int kor=100;
		int eng=87;
		int math=41;
		
		int score=(kor+eng+math)/3;
		boolean isTrue=score>=60;
		System.out.println("1. The answer is "+isTrue);
		
		// Original Answer
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println(avg>=60 && kor>=50 && eng>=50 && math >=50);
		
		
		// 문제 2) 키가 200cm이상이거나 몸무게가 200kg 이상이면 입장(true)
		int height1=199;
		int weight1=199;
		boolean enter1=(height1>=200)&&(weight1>=200);
		System.out.println("2. The answer of 1 is "+enter1);
		
		int height2=200;
		int weight2=68;
		boolean enter2=(height2>200)&&(weight2>=200);
		System.out.println("2. The answer of 2 is "+enter2);
	}
}
