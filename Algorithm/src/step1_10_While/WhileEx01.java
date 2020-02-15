package step1_10_While;

/*
 * [ 반복문 (while) ]
 * 
 * 1. 반복문의 조건 (3가지)
 * 	1) 초기식
 * 	2) 조건식
 * 	3) 증감식
 * 2. 구조
 * 	초기식;
 * 	while(조건식) {
 * 		조건식이 참일동안 실행할 문장;
 * 		증감식;
 * 	} 
 */
public class WhileEx01 {
	public static void main(String[] args) {
		// ex) 1~5 출력
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i=i+1;
		}
	}
}
