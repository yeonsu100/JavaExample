package step1_10_While;

public class WhileEx12 {
	public static void main(String[] args) {
		int i=1;
		while(i<=99) {
			int x=i/10;
			int y=i%10;
			
			int cnt=0;
			if(x != 0 && x%3 == 0) {
				cnt=cnt+1;
			}
			if(y != 0 && y%3 == 0) {
				cnt=cnt+1;
			}
			if(cnt == 2) {
				System.out.println("Double Clap!!");
			}else if(cnt == 1) {
				System.out.println("Clap!");
			}else {
				System.out.println(i);
			}
			i += 1;
		}
	}
}
