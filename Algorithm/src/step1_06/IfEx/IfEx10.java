package step1_06.IfEx;

// 변수의 생명주기 
public class IfEx10 {
	public static void main(String[] args) {
		int x=10;
		if(true) {
			System.out.println("x = "+x);
			int y=20;
		}
	}
}
