package step3_14_string;

public class StringEx09 {
	public static void main(String[] args) {
		String[] name= {"Anna","Elsa","Kristoff","Olaf","Sven"};
		int[] score= {99,100,75,22,50};
		
		String str="";
		
		for(int i=0; i<name.length; i++) {
			str+=name[i];
			str+="'s score is ";
			str+=score[i]+"";
			
			if(i != name.length-1) {
				str+=" / ";
			}
		}
		System.out.println(str);
	}
}
