package step3_14_string;

import java.util.Scanner;

public class StringEx16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String text="Some things never change";
		System.out.println(text);
		
		System.out.println("Enter a word for searching");
		String word=scan.next();
		
		char[] arr=new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i]=text.charAt(i);
		}
		
		int size=word.length();
		int check=-1;
		for(int i=0; i<arr.length-size+1; i++) {
			int count=0;
			for(int j=0; j<size; j++) {
				if(arr[i+j]==word.charAt(j)) {
					count+=1;
				}
			}
			if(count==size) {
				check=1;
			}
		}
		
		if(check==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
