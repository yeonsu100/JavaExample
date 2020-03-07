package step1_10_While;

import java.util.Random;
import java.util.Scanner;

public class WhileWx04_Example {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		int score=0;
		int count=0;
		
		int i=1;
		while(i<=5) {
			int x=ran.nextInt(8)+2;
			int y=ran.nextInt(9)+1;
			int ans=x*y;
			
			System.out.println(x+" * "+y+" = ");
			int answer=scan.nextInt();
			
			if(ans==answer) {
				count=count+1;
			}
			i=i+1;
		}
		score=count*20;
		System.out.println("The score is : "+score);
	}
}
