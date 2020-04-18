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
	
	public static void main2(String[] args) {
		int[] lotto=new int[6];
		int cnt=0;
		boolean overlap=false;
		
		while(cnt<6) {
			lotto[cnt]=1+random.nextInt(45);
			
			for(int i=0; i<cnt; i++) {
				overlap=lotto[i]==lotto[cnt];
				if(overlap) {
					cnt--;
				}
			}
			cnt++;
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main3(String[] args) {
		int[] lotto=new int[6];
		boolean overlap=false;
		
		for(int i=0; i<6; i++) {
			lotto[i]=1+random.nextInt(45);
			
			for(int j=0; j<i; j++) {
				overlap=lotto[i]==lotto[j];
				if(overlap) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
