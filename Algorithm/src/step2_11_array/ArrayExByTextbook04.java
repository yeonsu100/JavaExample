package step2_11_array;

public class ArrayExByTextbook04 {
	public static void main(String[] args) {
		
		int[] num;
		num=new int[] {1,2,3};
		
		for(int x:num) {
			System.out.println("정수 배열 값 : "+x);
		}
		
		String[] name=new String[] {"Elsa", "Anna", "Olaf"};
		
		for(String s:name) {
			System.out.println("문자열 배열 값 : "+s);
		}
	}
}
