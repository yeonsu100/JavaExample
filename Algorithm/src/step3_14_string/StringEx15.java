package step3_14_string;

import java.util.Scanner;

/*
 * # nextLine()과 next()의 차이 
 * - nextLine() : 문장 한라인 전체를 입력받는다 
 * - next() : 공백을 기준으로 한단어씩 입력받는다 
 */
public class StringEx15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		 * # Show Yourself 입력 시,
		 * nextLine() 메서드는 Show Yourself 모두 출력,
		 * next() 메서드는 Show 까지만 출력된다.
		 */
		System.out.print("Enter some comments : ");
		String word=scan.nextLine();
		System.out.println(word);
		
		System.out.print("Enter some comments : ");
		word=scan.next();
		System.out.println(word);
	}
}
