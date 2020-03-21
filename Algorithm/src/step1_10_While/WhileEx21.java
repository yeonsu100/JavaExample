package step1_10_While;

public class WhileEx21 {
	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("[i] = "+i+" [j] = "+j);
			}
		}
		for(int i=2; i<=9; i++) {
			System.out.println("multiple of "+i);
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}
}
