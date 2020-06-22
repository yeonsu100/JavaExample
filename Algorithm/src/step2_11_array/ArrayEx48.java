package step2_11_array;

public class ArrayEx48 {
	public static void main(String[] args) {
		int charCount=5;
		String[][] characters= {
				{"Anna", "Kristen Bell"},
				{"Elsa", "Idina Menzel"},
				{"Kristoff", "Jonathan Groff"},
				{"Olaf", "Josh Gad"},
				{"Sven", "Jonathan Groff"},
		};
		
		for(int i=0; i<charCount; i++) {
			String maxStr=characters[i][0];
			int maxNum=i;
			for(int j=i; j<charCount; j++) {
				if(maxStr.compareTo(characters[j][0]) > 0) {
					maxStr=characters[j][0];
					maxNum=j;
				}
			}
			
			String[] temp=characters[i];
			characters[i]=characters[maxNum];
			characters[maxNum]=temp;
		}
		
		for(int i=0; i<charCount; i++) {
			String maxStr=characters[i][1];
			int maxNum=i;
			for(int j=i; j<charCount; j++) {
				if(characters[i][0].equals(characters[j][0])) {
					if(maxStr.compareTo(characters[j][1]) > 0) {
						maxStr=characters[j][1];
						maxNum=j;
					}
				}
			}
			
			String[] temp=characters[i];
			characters[i]=characters[maxNum];
			characters[maxNum]=temp;
		}
		
		for(int i=0; i<charCount; i++) {
			System.out.println(characters[i][0]+" "+characters[i][1]);
		}
	}
}
