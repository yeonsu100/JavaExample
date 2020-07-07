package step4_exception;

import java.util.Scanner;

public class ExceptionEx02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("[Device] number 1 : ");
		int num1=scan.nextInt();
		
		System.out.print("[Device] number 2 : ");
		int num2=scan.nextInt();
		
		if(num2==0) {
			System.out.println("Can NOT devide by 0");
		}else {
			System.out.println(num1/num2);
		}
		
		System.out.println("-------------------");
		
		try {
			System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("Can NOT devide by 0");
		}finally {
			System.out.println("Write a sentence to execute unconditionally, "
					+ "regardless of the occurrence of an exception");
		}
	}
}
