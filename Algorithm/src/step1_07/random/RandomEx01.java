package step1_07.random;

import java.util.Random;

public class RandomEx01 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		// ex) between 0 and 2
		int rnum=ran.nextInt(3);
		System.out.println(rnum);
		
		// Example1) random number between 1 and 5
		rnum=ran.nextInt(5)+1;
		System.out.println(rnum);
		
		// Example2) random number between -3 and 3 
		rnum=ran.nextInt(7)-3;
		System.out.println(rnum);
		
	}
}
