package step3_14_string;

import java.util.Scanner;

public class StringEx11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String start="frozen";
		
		while(true) {
			int size=start.length();
			System.out.println("Next : "+start);
			
			System.out.println("Enter : ");
			String word=scan.next();
			
			if(start.charAt(size-1) == word.charAt(0)) {
				start=word;
			}
		}
	}
}
