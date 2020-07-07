package step3_14_string;

import java.util.Scanner;

public class StringEx14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter : ");
		String text=scan.next();
		
		char[] charNum= {'0','1','2','3','4','5','6','7','8','9'};
		
		int cnt=0;
		for(int i=0; i<charNum.length; i++) {
			for(int j=0; j<text.length(); j++) {
				if(charNum[i]==text.charAt(j)) {
					cnt+=1;
				}
			}
		}
		
		if(cnt==text.length()) {
			System.out.println("Only Number");
		}else if(cnt==0) {
			System.out.println("Only Text");
		}else {
			System.out.println("Number & Text");
		}
	}
}
