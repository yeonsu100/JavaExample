package step2_11_array;

public class ArrayEx01 {
	public static void main(String[] args) {
		// 1. 일반변수 (값 저장)
		int num=0;
		num=10;
		System.out.println("num = "+num);
		
		// 2. 주소변수 (주소 저장)
		int[] arr=null;
		arr=new int[5];
		System.out.println("arr = "+arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
