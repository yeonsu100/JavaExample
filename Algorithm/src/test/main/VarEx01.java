package test.main;

// 자료형 (데이터 타입)
/*
 * 변수 (variable)
 * - 변수 : 단 하나의 값을 저장할 수 있는 메모리 공간
 * - 변수의 선언 : int a;		<- 메모리 공간 할당
 * - 변수의 초기화 : a=10;		<- 값 저장
 */
public class VarEx01 {
	public static void main(String[] args) {
		// 1. 정수 (integer)
		int num;
		num=10;
		System.out.println(num);
		
		// 2. 실수 (double)
		double dNum = 3.14;
		System.out.println(dNum);
		
		// 3. 문자 한 개 (character)
		char c1='W';
		System.out.println(c1);
		char c2='수';
		System.out.println(c2);
		
		// 4. 문자 여러개 (String)
		String str="Winnie";
		System.out.println(str);
		
		// 5. 참과 거짓 (논리 - boolean)
		boolean result1=true;
		boolean result2=false;
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
