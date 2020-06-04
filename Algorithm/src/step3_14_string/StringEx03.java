package step3_14_string;

public class StringEx03 {
	public static void main(String[] args) {
		String str1="A";
		String str2="B";
		String str3="A";
		
		int rs1=str1.compareTo(str2);
		System.out.println(rs1);		// a negative number
		
		int rs2=str2.compareTo(str1);
		System.out.println(rs2);		// a positive number
		
		int rs3=str1.compareTo(str3);
		System.out.println(rs3);		// 0
		
		// Q) Order by alphabet
		String[] frohana= 
			{"Agnarr", "Iduna", "Elsa", "Anna", "Olaf", "Kristoff", "Sven", "Jorgenbjorgen"};
	
		System.out.println("Original list of Characters : "+frohana);
		
		for(int i=0; i<frohana.length; i++) {
			String firstChar=frohana[i];
			int firstIdx=i;
			
			for(int j=i; j<frohana.length; j++) {
				if(firstChar.compareTo(frohana[j])>0) {
					firstChar=frohana[j];
					firstIdx=j;
				}
			}
			
			String temp=frohana[i];
			frohana[i]=frohana[firstIdx];
			frohana[firstIdx]=temp;
		}
		
		for(int i=0; i<frohana.length; i++) {
			System.out.println(frohana[i]+" ");
		}
	}
}
