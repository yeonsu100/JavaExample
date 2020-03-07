package step1_03_variable;

public class VarEx05 {
	public static void main(String[] args) {
		// x와 y의 값 교체하기
		int x=10;
		int y=20;
		
		int z=x;		// z=10;
		x=y;			// x=10;
		y=z;			// y=10;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
