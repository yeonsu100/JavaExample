package step3_14_string;

import java.util.Scanner;

// # 문자열 [비교] 

public class StringEx02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String name="Olaf";
		
		System.out.print("Enter a name : ");
		String myName=scan.next();
		
		// == 연산자 사용 시 
		if(name==myName) {
			System.out.println("consensus");
		}else {
			System.out.println("non consensus");
		}
		
		// equals() 메소드 사용 
		if(name.equals(myName)) {
			System.out.println("consensus");
		}else {
			System.out.println("non consensus");
		}
	}
}
