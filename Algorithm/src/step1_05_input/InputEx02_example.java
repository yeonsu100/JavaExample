package step1_05_input;

import java.util.Scanner;

public class InputEx02_example {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		// 문제 1) 숫자 2개를 입력받아 두 수의 합을 출력하시오
		System.out.println("Enter a num1.");
		int num1=scan.nextInt();
		System.out.println("Enter a num2.");
		int num2=scan.nextInt();
		
		int total=num1+num2;
		System.out.println("1. The answer is : "+total);
		System.out.println("-----------");
		
		// 문제 2) 숫자 1개를 입력받아 홀수이면 true를 출력하시오
		System.out.println("Enter a num3.");
		int num3=scan.nextInt();
		boolean ans=(num3%2==1);
		System.out.println("2. The answer is : "+ans);
		System.out.println("-----------");
		
		// 문제 3) 성적을 입력받아 60점 이상이고 100점 이하이면 true를 출력하시오
		System.out.println("Enter a point");
		int point=scan.nextInt();
		boolean score=(point>=60 && point<=100);
		System.out.println("3. The answer is : "+score);
		
	}
}
