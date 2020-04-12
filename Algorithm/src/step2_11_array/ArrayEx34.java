package step2_11_array;

public class ArrayEx34 {
	public static void main(String[] args) {
		String[] name= {"Elsa", "Anna", "Olaf", "Kristoff", "Snoggy"};
		int[] score= {71, 100, 30, 88, 2};
		
		for(int i=0; i<5; i++) {
			int maxScore=score[i];
			int maxIdx=i;
			for(int j=i; j<5; j++) {
				if(maxScore<score[j]) {
					maxScore=score[j];
					maxIdx=j;
				}
			}
			int scoreTemp=score[i];
			score[i]=score[maxIdx];
			score[maxIdx]=scoreTemp;
			
			String nameTemp=name[i];
			name[i]=name[maxIdx];
			name[maxIdx]=nameTemp;
		}
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"'s score is "+score[i]);
		}
	}
}
