package step3_14_string;

public class StringEx06 {
	public static void main(String[] args) {
		String id_num="920621-1222621";
		
		// Print an age
		String strAge=id_num.substring(0, 2);
		int intAge=Integer.parseInt(strAge);
		int age=2020-(1900+intAge);
		System.out.println(age);
		
		// Print a sex
		char key=id_num.charAt(7);
		if(key=='1') {
			System.out.println("Male");
		}else if(key=='2') {
			System.out.println("Female");
		}
	}
}
