package exercise_java;

import java.util.Scanner;

public class DiceGame {
	static int[] p1=new int[2];
	static int[] p2=new int[2];
	static String p1name;
	static String p2name;
	
	public static void main(String[] args) {
		boolean start=false;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("***** Dice Game *****");
		System.out.println("Set a player 1's name : ");
		p1name=scanner.nextLine();
		System.out.println("Set a player 2's name : ");
		p2name=scanner.nextLine();
		System.out.println("----------------------");
		
		while(!start) {
			for(int i=0; i<2; i++) {
				p1[i]=getRandom();
				p2[i]=getRandom();
				System.out.printf("[Turn %d] %s : %d\t%s : %d\n",i+1,p1name,p1[i],p2name,p2[i]);
			}
			if(isTen(getSum(p1))&&isTen(getSum(p2))) {
				System.out.println("Both player are lose!");
				continue;
			}else {
				start=true;
				System.out.println("***** Result of Game *****");
				System.out.printf("[Result] %s : %d\t%s : %d\n",p1name,getSum(p1),p2name,getSum(p2));
				System.out.println("The WINNER is "+isWinner());
			}
		}
	}
	
	private static int getSum(int[] arr) {
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	private static int getRandom() {
		int ran=(int)(Math.random()*6+1);
		return ran;
	}
	
	private static String isWinner() {
		String winner="";
		if(getSum(p1) > getSum(p2)) {
            if(isTen(getSum(p1))){
                winner = p2name;
            }else {
                winner = p1name;
            }
        }else if(getSum(p1) == getSum(p2)) {
            winner = "Same";
        }else if(getSum(p1) < getSum(p2)) {
            if(isTen(getSum(p2))){
                winner = p1name;
            }else {
                winner = p2name;
            }
        }
        return winner;
	}
	
	private static boolean isTen(int sum) {
		if(sum>10) {
			return true;
		}else {
			return false;
		}
	}
}
