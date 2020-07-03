package step3_14_string;

import java.util.Random;
import java.util.Scanner;

public class StringEx12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		String[] words= {"Anna","Elsa","Olaf","Kristoff","Sven"};
		
		for(int i=0; i<1000; i++) {
			int r=ran.nextInt(words.length);
			String temp=words[0];
			words[0]=words[r];
			words[r]=temp;
		}
		
		int i=0;
		while(i<words.length) {
			int size=words[i].length();
			int r=ran.nextInt(size);
			System.out.println("Q)"+(i+1));
			
			for(int j=0; j<size; j++) {
				if(j==r) {
					System.out.println("?");
				}else {
					System.out.println(words[i].charAt(j));
				}
			}
			System.out.println();
			
			System.out.println("Enter : ");
			String myWord=scan.next();
			
			if(myWord.equals(words[i])) {
				i+=1;
			}
		}
	}
}
