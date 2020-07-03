package step3_14_string;

import java.util.Scanner;

public class StringEx13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String suggest="frozen";
		
		System.out.println("Enter the name of the character in the <FROZEN> : ");
		String name=scan.next();
		
		int check=-1;
		if(suggest.length() == name.length()) {
			check=1;
			for(int i=0; i<suggest.length(); i++) {
				if(suggest.charAt(i) != name.charAt(i)) {
					check=-1;
				}
			}
		}
		if(check==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
