package step3_14_string;

import java.util.Random;
import java.util.Scanner;

public class StringEx10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		String[] frozen= 
			{"Anna", "Elsa", "Olaf", "Kristoff", "Sven", "Agnarr", "Iduna", "Jorgenbjorgen"};
		
		// Shuffle
		for(int i=0; i<1000; i++) {
			int r=ran.nextInt(frozen.length);
			
			String temp=frozen[0];
			frozen[0]=frozen[r];
			frozen[r]=temp;
		}
		
		int i=0; 
		while(i<frozen.length) {
			System.out.println("Q : "+(i+1)+" "+frozen[i]);
			System.out.println("Enter : ");
			String answer=scan.next();
			
			if(frozen[i].contentEquals(answer)) {
				i+=1;
			}
		}
	}
}
