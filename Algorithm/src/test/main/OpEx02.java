package test.main;

public class OpEx02 {
	public static void main(String[] args) {
		// 덧셈 연산자
		System.out.println(10+3);			// 13
		
		// 연결 연산자
		// - "문자" + "문자" = "문자"
		System.out.println("Winnie "+"Beckinsale");		// Winnie Beckinsale
		// - 숫자 + "문자" = "문자"
		System.out.println("10"+3);			// 103
		// - "문자" + 숫자 = "문자"
		System.out.println(3+"10");			// 310
		
		System.out.println("Plus = "+10+3);		// Plus = 103
		System.out.println("Plus = "+(10+3));	// Plus = 13
	}
}
