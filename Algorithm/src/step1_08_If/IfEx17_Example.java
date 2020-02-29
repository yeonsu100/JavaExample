package step1_08_If;

import java.util.Random;

public class IfEx17_Example {
	public static void main(String[] args) {
		Random ran=new Random();
		
		int rNum=ran.nextInt(90)+1;
		System.out.println("Clap or non clap? : "+rNum);
		
		int x=rNum/10;
		int y=rNum%10;
		
		int exam=0;
		if(x==3 || x==6 || x==9) {
			exam=exam+1;
		}
		if(y==3 || y==6 || y==9) {
			exam=exam+1;
		}
		
		if(exam==2) {
			System.out.println("Double Clap!");
		}else if(exam==1) {
			System.out.println("Clap!");
		}else {
			System.out.println("The number is "+rNum+"!");
		}
	}
}
