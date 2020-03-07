package step1_07.random;

import java.util.Random;

public class RadnomEx03_Example {
	public static void main(String[] args) {
		Random rd=new Random();
		int rnum=rd.nextInt();
		if(rnum<3) {
			System.out.println("Prize Winning!");
		}
		if(rnum>=3) {
			System.out.println("Bang!!");
		}
	}
}
