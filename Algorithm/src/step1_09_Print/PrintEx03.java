package step1_09_Print;

/*
 * # 출력문의 종류
 * 
 * 1. System.out.println();
 * 	1) ln = new line
 * 	2) 줄바꿈 가능
 * 
 * 2. System.out.print();
 * 	1) 줄바꿈 불가
 * 
 * 3. System.out.printf();
 * 	1) 서식문자 출력
 * 		%d : 정수 
 * 		%f : 소수 
 * 		%c : 문자 1개 
 * 		%s : 문자 여러
 */
public class PrintEx03 {
	public static void main(String[] args) {
		System.out.println("Hi Aloha");
		
		System.out.print("Hi ");
		System.out.println("Aloha");
		
		/*
		 * 이스케이프 문자 (Escape Sequence)
		 * 1) \n : 줄바꿈 
		 * 2) \t : tab
		 * 3) \" : "
		 * 4) \' : '
		 */
		
		System.out.println("Hi \n Aloha");
		System.out.println("Hi \t Aloha");
		System.out.println("\"Hi Aloha\"");
		System.out.println("\'Hi Aloha\'");
	}
}
