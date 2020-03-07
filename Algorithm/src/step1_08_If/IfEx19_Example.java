package step1_08_If;

import java.util.Random;
import java.util.Scanner;

// 연산자 기호 맞추기 게임
public class IfEx19_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		// 0~9 사이의 랜덤 숫자 2개를 저장한다. (연산에 사용될 숫자)
		int a=ran.nextInt(10);
		int b=ran.nextInt(10);
		
		// 1~4 사이의 랜덤 숫자 1개를 저장한다. (연산자 기호에 사용될 숫자)
		// (1) +   (2) -   (3) *   (4) %
		int oper=ran.nextInt(4)+1;
		
		// 초기값을 0으로 설정한다음, 문제를 낼 (연산자를 담을) if문 구성
		int ans=0;
		if(oper==1) {
			ans=a+b;
		}else if(oper==2) {
			ans=a-b;
		}else if(oper==3) {
			ans=a*b;
		}else if(oper==4) {
			ans=a%b;
		}
		
		// 콘솔창에 문제 출력
		System.out.println("Which number could be answer?\n"+a+" (blank) "+b+" = "+ans);
		System.out.println("(1) +   (2) -   (3) *   (4) %");
		System.out.println("Choose a number between 1 and 4.");
		
		// 사용자가 입력할 정답
		int answer=scan.nextInt();
		
		// 사용자의 정답에 따른 if문
		if(answer==oper) {
			System.out.println("That's correct!");
		}else {
			System.out.println("Incorrect!");
		}
			
	}
}
