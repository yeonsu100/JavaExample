package step3_14_string;

import java.util.Scanner;

public class StringEx17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String text="Some things never change";
		System.out.println(text);
		
		System.out.println("Enter a word for changing");
		String word=scan.nextLine();
		
		char[] arr=new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i]=text.charAt(i);
		}
		
		int size=word.length();
		int check=-1;
		int idx=0;
		for(int i=0; i<arr.length-size+1; i++) {
			int count=0;
			for(int j=0; j<size; j++) {
				if(arr[i+j]==word.charAt(j)) {
					count+=1;
				}
			}
			if(count==size) {
				idx=i;
				check=1;
			}
		}
		
		if(check==1) {
			int firstIdx=idx;
			int lastIdx=idx+size;
			
			System.out.println("For what?");
			String change=scan.nextLine();
			int length=change.length();
			
			char[] temp=arr;
			String front="";
			for(int i=0; i<firstIdx; i++) {
				front+=temp[i];
			}
			System.out.println(front);
			
			String back="";
			for(int i=lastIdx; i<temp.length; i++) {
				back+=temp[i];
			}
			System.out.println(back);
			
			String result=front+change+back;
			System.out.println(result);
		}else {
			System.out.println("That word is NOT exist");
		}
	}
}
