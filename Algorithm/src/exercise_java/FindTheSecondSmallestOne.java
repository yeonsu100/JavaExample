package exercise_java;

import java.util.Arrays;

public class FindTheSecondSmallestOne {
	public static void main(String[] args) {
		int[] arr= {-1, -28, 79, -15, 20, 86, 33, -24, 55, 0, 36, 19, -27};
		System.out.println("Original numeric array : "+Arrays.toString(arr));
		int minimum=Integer.MAX_VALUE;
		int scd_min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==minimum) {
				scd_min=minimum;
			}else if(arr[i]<minimum) {
				scd_min=minimum;
				minimum=arr[i];
			}else if(arr[i]<scd_min) {
				scd_min=arr[i];
			}
		}
		System.out.println("Second lowest number is "+scd_min);
	}
}
