package step2_11_array;

import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr= {87, 11, 45, 98, 23};
		
		System.out.println("*** 1 ***");
		System.out.println("Select an Index number : ");
		int index=scan.nextInt();
		System.out.println(arr[index]);
		
		System.out.println("*** 2 ***");
		System.out.println("Enter a score : ");
		int score=scan.nextInt();
		for(int i=0; i<5; i++) {
			if(arr[i] == score) {
				System.out.println(i);
			}
		}
		
		int[] studentIds= {1001, 1002, 1003, 1004, 1005};
		int[] scores= {87, 11, 45, 98, 23};
		
		System.out.println("*** 3 ***");
		System.out.println("Enter a students ID : ");
		int studentId=scan.nextInt();
		
		for(int i=0; i<5; i++) {
			if(studentIds[i] == studentId) {
				System.out.println(scores[i]);
			}
		}
		
	}
}