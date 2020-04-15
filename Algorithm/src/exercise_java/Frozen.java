package exercise_java;

public class Frozen {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		
		int eCount=0, aCount=0, kCount=0, oCount=0;
		System.out.println("Repeat "+num+" times!");
		
		for(int i=1; i<num; i++) {
			System.out.print(i+".");
			if(i%3==0) {
				System.out.print("Elsa");
				eCount+=1;
			}if(i%4==0) {
				System.out.print("Anna");
				aCount+=1;
			}if(i%5==0) {
				System.out.print("Kristoff");
				kCount+=1;
			}if(i%8==0) {
				System.out.print("Olaf");
				oCount+=1;
			}
			System.out.println("");
		}
		
		System.out.println("\n"+"*** Counts on Frozen's Characters ***");
		System.out.println("\t"+"Elsa : "+eCount);
		System.out.println("\t"+"Anna : "+aCount);
		System.out.println("\t"+"Kristoff : "+kCount);
		System.out.println("\t"+"Olaf : "+oCount);
	}
}
