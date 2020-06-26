package step3_14_string;

public class StringEx05 {
	public static void main(String[] args) {
		// Type Conversion
		
		// 문자 -> 숫자
		char ch='a';
		int aNum=(int)ch;
		System.out.println(aNum);	// 97
		
		ch=(char)(aNum+1);
		System.out.println(ch); 	// b
		
		// 문자열 -> 숫자
		String strNum="10";
		int num=Integer.parseInt(strNum);
		System.out.println(num+1); 	// 11
		
		// 숫자 -> 문자열
		// Ver 1. (Trick version)
		strNum=num+" ";
		System.out.println(strNum+1); 	// 101
		// Ver 2. (Official)
		strNum=String.valueOf(num);
		System.out.println(strNum+1);	// 101
	}
}
