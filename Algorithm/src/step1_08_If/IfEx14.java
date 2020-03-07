package step1_08_If;

public class IfEx14 {
	public static void main(String[] args) {
		int score=80;
		if(score>=60) {
			System.out.println("Pass!");
		}else {
			System.out.println("Fail!");
		}
		
		System.out.println("1.Apple | 2.Mango | 3.Orange");
		int select=1;
		if(select==1) {System.out.println("Apple");}
		if(select==2) {System.out.println("Mango");}
		if(select==3) {System.out.println("Orange");}
		else {System.out.println("Error!");}
		
		System.out.println("1.Corn | 2.Sausage | 3.Potato");
		select=1;
		if(select==1) {System.out.println("Corn");}
		else if(select==2) {System.out.println("Sausage");}
		else if(select==3) {System.out.println("Potato");}
		else {System.out.println("Error!!");}
		
	}
}
