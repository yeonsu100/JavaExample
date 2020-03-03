package step2_11_array;

import java.util.Random;

public class ArrayEx04 {
	public static void main(String[] args) {
		Random ran=new Random();
		int[] arr=new int[5];
		
		// 1.
		System.out.println("*** 1 ***");
		for(int i=0; i<5; i++) {
			arr[i]=ran.nextInt(100)+1;
			System.out.println(arr[i]+" ");
		}
		
		// 2.
		System.out.println("*** 2 ***");
		int total=0;
		double average=0.0;
		for(int i=0; i<5; i++) {
			total=total+arr[i];
		}
		average=total/5.0;
		System.out.println("Total Score : "+total);
		System.out.println("Average Score : "+average);
		
		System.out.println("*** 3 ***");
		int count=0;
		for(int i=0; i<5; i++) {
			if(arr[i] >= 60) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
