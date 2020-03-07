package step1_05_input;

import java.util.Scanner;

/*
 *  [입력 받기]
 * 
 * 1. import java.util.Scanner;
 *    java.util 패키지 안의 Scanner 클래스 파일을 현재 페이지로 불러온다.
 *    
 * 2. scan 변수 설정
 *    Scanner scan=new Scanner(System.in);
 *    
 * 3. 안내문 작성
 *    System.out.print("Enter your age : ");
 *    
 * 4. 입력받기
 *    int age=scan.nextInt();
 * */
public class InputEx01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println("Your number is "+num);
		
		System.out.println("Enter your age : ");
		int age=scan.nextInt();
		System.out.println("Your age is "+age);
	}
}
