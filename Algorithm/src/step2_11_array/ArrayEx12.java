package step2_11_array;

import java.util.Scanner;

public class ArrayEx12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr= {10, 20, 30, 40, 50};
		
		System.out.println("*** 1 ***");
		System.out.println("Enter an Index 1 : ");
		int idx1=scan.nextInt();
		System.out.println("Enter an Index 2 : ");
		int idx2=scan.nextInt();
		
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("*** 2 ***");
		System.out.println("Enter a data 1 : ");
		int data1=scan.nextInt();
		System.out.println("Enter a data 2 : ");
		int data2=scan.nextInt();
		
		idx1=0;
		idx2=0;
		
		for(int i=0; i<5; i++) {
			if(arr[i] == data1) {
				idx1=i;
			}
			if(arr[i] == data2) {
				idx2=i;
			}
		}
		temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		int[] stNums= {1001, 1002, 1003, 1004, 1005};
		int[] scores= {87, 11, 45, 98, 23};
		
		System.out.println("*** 3 ***");
		System.out.println("Enter a student num 1 : ");
		int num1=scan.nextInt();
		System.out.println("Enter a student num 2 : ");
		int num2=scan.nextInt();
		
		idx1=0;
		idx2=0;
		
		for(int i=0; i<5; i++) {
			if(stNums[i] == num1) {
				idx1=i;
			}
			if(stNums[i] == num2) {
				idx2=i;
			}
		}
		temp=scores[idx1];
		scores[idx1]=scores[idx2];
		scores[idx2]=temp;
		
		for(int i=0; i<5; i++) {
			System.out.println(scores[i]+" ");
		}
		System.out.println();
	}
}