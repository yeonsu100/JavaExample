package step1_08_If;

import java.util.Scanner;

public class IfEx18_Answer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a counting number that you'll pass the stations. : ");
		int station=scan.nextInt();
		
		int fee=0;
		if(1 <= station && station <= 5) {
			fee=5;
		}else if(6 <= station && station <= 10) {
			fee=6;
		}else {
			if(station %2==1) {
				fee=(station-10)/2*50;
				fee=fee+7;
			}else {
				fee=(station-10)/2*50;
				fee=fee+6;
			}
		}
		System.out.println("Your fare is $"+fee+". Enjoy your trip!");
	}
}
