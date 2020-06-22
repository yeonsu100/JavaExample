package step2_11_array;

import java.util.Scanner;

public class ArrayEx47 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String[][] characters= {
				{"Anna", "Kristen Bell"},
				{"Elsa", "Idina Menzel"},
				{"Kristoff", "Jonathan Groff"},
				{"Olaf", "Josh Gad"},
				{"Sven", "Jonathan Groff"},
				{"Iduna", "Evan Rachel Wood"},
				{"Agnarr", "Alfred Molina"},
				{"Runeard", "Jeremy Sisto"},
		};
		
		for(int i=0; i<characters.length; i++) {
			System.out.println(characters[i][0]+" played by "+characters[i][1]);
		}
		
		System.out.println("Enter a name for deleting");
		String name=scan.next();
		System.out.println("Enter a number for deleting");
		int num=scan.nextInt();
		
		int delNum=-1;
		
		int count=0;
		
		for(int i=0; i<characters.length; i++) {
			if(name.equals(characters[i][0])) {
				if(count==num) {
					delNum=i;
				}
				count+=1;
			}
		}
		System.out.println(delNum);
		
		String[][] temp=characters;
		characters=new String[temp.length-1][2];
		
		int chars=0;
		for(int i=0; i<temp.length; i++) {
			if(i!=delNum) {
				characters[chars]=temp[i];
				chars+=1;
			}
		}
		
		for(int i=0; i<characters.length; i++) {
			System.out.println(characters[i][0]+ " played by "+characters[i][1]);
		}
	}
}
