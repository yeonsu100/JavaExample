package step3_14_string;

public class StringEx08 {
	public static void main(String[] args) {
		String str="Anna/99,Elsa/100,Kristoff/75,Olaf/22,Sven/50";
		String[] name=new String[5];
		int[] score=new int[5];
		
		String[] temp=str.split(",");
		for(int i=0; i<temp.length; i++) {
			String[] info=temp[i].split("/");
			name[i]=info[0];
			score[i]=Integer.parseInt(info[1]);
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"'s score is "+score[i]);
		}
	}
}
