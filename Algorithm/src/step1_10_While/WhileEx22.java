package step1_10_While;

public class WhileEx22 {
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i%3 == 2) {
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j>i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("@");
			}
			for(int j=2; j>i; j--) {
				System.out.println("#");
			}
			System.out.println();
		}
		System.out.println();
		
		int k=0;
		for(int i=0; i<3; i++) {
			for(int j=2; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k += 2;
		}
	}
}
