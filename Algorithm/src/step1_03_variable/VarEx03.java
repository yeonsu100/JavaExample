package step1_03_variable;

/*
 * 변수의 명명 규칙 (naming)
 * - 변수는 숫자로 시작할 수 없다.
 * - 특수문자는 _ 또는 $만을 허용한다.
 * - 예약어 (키워드)는 사용할 수 없다.
 * 	 ex) public, class, static, void, ...
 * - 자바는 알파벳의 대소문자를 구분한다.
 * 
 * > 패키지명, 변수명은 소문자로 시작한다.
 * > 클래스명은 대문자로 시작한다.
 */

public class VarEx03 {
	public static void main(String[] args) {
		int test=1;
		int Test=2;
		System.out.println(test);
		System.out.println(Test);
		
		int $money=1000;
		int curPos=-1;			// 현재 위치 (current position)
		System.out.println($money);
		System.out.println(curPos);
		
		// int 1num=10;			<- 숫자 시작 불가
		// int #test=10;		<- 특수문자 불가 (_ 또는 $만 가능)
		// int void=20;			<- 예약어 사용 불가
	}
}
