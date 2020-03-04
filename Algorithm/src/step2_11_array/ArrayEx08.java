package step2_11_array;

import java.util.Random;

public class ArrayEx08 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		int[] answer= {1, 3, 2, 4, 5};
		int[] hgd=new int[5];
		
		for(int i=0; i<5; i++) {
			hgd[i]=ran.nextInt(5)+1;
		}
		
		System.out.print("Answer : [");
		for(int i=0; i<5; i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println("]");
		
		System.out.print("hgd = [");
		for(int i=0; i<5; i++) {
			System.out.print(hgd[i]+" ");
		}
		System.out.println("]");
		
		int count=0;
		System.out.print("Your Answer : [");
		for(int i=0; i<5; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("O ");
				count += 1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		
		int score=count*20;
		System.out.println("Your Score is : "+score);
	}
}
