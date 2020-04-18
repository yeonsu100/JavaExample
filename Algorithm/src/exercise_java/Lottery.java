package exercise_java;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
	static Random random=new Random();
	
	public static void main(String[] args) {
		int[] lotto=new int[6];
		int cnt=0;
		
		while(cnt<6) {
			lotto[cnt]=1+random.nextInt(45);
			
			for(int i=0; i<cnt; i++) {
				if(lotto[i]==lotto[cnt]) {
					cnt--;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto));
	}
	

}
