package step3_14_string;

public class StringEx04 {
	public static void main(String[] args) {
		// 문자열 (=문자의 배열)
		String str="frozen";
		System.out.println(str);	// 012345
		
		// 문자의 길이 : length()
		int size=str.length();
		System.out.println(size);	// 6
		
		// 문자 한개 추출 (인덱싱) : charAt(index)
		char ch=str.charAt(0);
		System.out.println(ch);		// f
		ch=str.charAt(size-1);
		System.out.println(ch); 	// n
		
		// 문자 여러개 추출 (슬라이싱)
		// 1) substring(index1, index2) : 마지막은 포함 X (index1 부터 index2 미만)
		String rs1=str.substring(4, 6);
		System.out.println(rs1);		// en
		// 2) substring(index) : index 부터 문자열 끝까지
		String rs2=str.substring(4);
		System.out.println(rs2);		// en
		
		// 구분자로 잘라내기
		str="Anna, Elsa, Olaf";
		String[] ar=str.split(",");
		System.out.println(ar.length);	// 3
		System.out.println(ar[0]); 		// Anna
		System.out.println(ar[1]); 		// Elsa
		System.out.println(ar[2]); 		// Olaf
	}
}
