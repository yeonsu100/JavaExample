package step1_09_Print;

public class PrintEx04 {
	public static void main(String[] args) {
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
	
		System.out.printf("%c\n", 'b');
		
		System.out.printf("%s\n", "Let's learn a Print Example!");
	
		String fruit="Apple";
		int cnt=5;
		System.out.printf("Here are some fruits. [Fruit : %s , Count : %d ]", fruit, cnt);
	}
}
