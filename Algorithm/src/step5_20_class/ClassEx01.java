package step5_20_class;

class Ex01{
	int x;
	int y;
}

public class ClassEx01 {
	public static void main(String[] args) {
		int a;
		String b;
		int[] arr;
		
		a=10;
		b="FROZEN";
		arr=new int[3];
		
		Ex01 e=new Ex01();		// 클래스 : 사용자 정의 자료형
		e.x=10;
		e.y=20;
		
		System.out.println(e);
	}
}
