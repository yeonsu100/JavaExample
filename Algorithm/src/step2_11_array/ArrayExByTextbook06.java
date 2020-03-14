package step2_11_array;

public class ArrayExByTextbook06 {
	public static void main(String[] args) {
		
		int[][] num= {{1,2},{3,4},{5,6,7}};
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}
		
		String[][] name= {{"Elsa", "Anna"},{"Olaf"}};
		
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.println("name["+i+"]["+j+"] = "+name[i][j]);
			}
		}
	}
}
