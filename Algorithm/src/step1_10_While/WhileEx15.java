package step1_10_While;

import java.util.Random;

public class WhileEx15 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		int tot=0;
		double avg=0.0;
		
		int cnt=0;
		
		int maxScore=0;
		int maxNum=0;
		
		int i=1;
		while(i<=10) {
			int score=ran.nextInt(100)+1;
			System.out.print(score+" ");
			
			tot=tot+score;
			
			if(score>=60) {
				cnt=cnt+1;
			}
			
			if(maxScore<score) {
				maxScore=score;
				maxNum=i;
			}
			i += 1;
		}
		System.out.println();
		
		avg=tot/10.0;
		
		System.out.println("Total Score : "+tot);
		System.out.println("Average : "+avg);
		System.out.println("Passed Students : "+cnt);
		System.out.println("Summa cum laude : "+maxScore+"["+maxNum+"]");
	}
}