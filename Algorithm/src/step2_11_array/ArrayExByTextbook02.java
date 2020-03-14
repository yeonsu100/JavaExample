package step2_11_array;

public class ArrayExByTextbook02 {
	public static void main(String[] args) {
		
		int[] num;
		num=new int[4];
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		
		for(int x:num) {
			System.out.println("정수 배열 값 : "+x);
		}
		
		String[] name;
		name=new String[4];
		
		name[0]="Elsa";
		name[1]="Anna";
		name[2]="Olaf";
		
		for(String s:name) {
			System.out.println("문자열 배열 값 : "+s);
		}
	}
}
