package step2_11_array;

public class ArrayExByTextbook01 {
	public static void main(String[] args) {

		int[] num;
		num=new int[11];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		num[5]=6;
		num[6]=7;
		num[7]=8;
		num[8]=9;
		num[9]=10;
		
		for(int i=0; i<num.length; i++) {
			System.out.println("배열 값 : "+num[i]);
		}
	}
}
