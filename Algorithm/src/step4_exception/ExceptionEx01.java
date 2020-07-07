package step4_exception;

public class ExceptionEx01 {
	public static void main(String[] args) {
		int num=10;
		// java.lang.ArithmetricException: / by zero
		// System.out.println(num/0);
		
		// 심각한 오류를 발생시킬 수 있는 내용은 
		// try(if) catch(else) 구문 안에 만들도록 강제한다.
		try {
			System.out.println(num/0);
		}catch(Exception e) {
			System.out.println("Can NOT devide by 0");
		}
		System.out.println("End of program");
	}
}
