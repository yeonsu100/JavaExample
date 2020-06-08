package step2_11_array;
import java.util.*;

public class ArrayEx45 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String[] ids= {"Elsa", "Anna", "Olaf"};
		String[] pws= {"1111", "2222", "3333"};
		
		int MAX_SIZE=100;
		int[][] shop=new int[MAX_SIZE][2];
		
		int count=0;
		
		String[] items= {"Apple", "Orange", "Grape"};
		
		int log=-1;
		
		while(true) {
			System.out.println("Sign In");
			if(log==-1) {
				System.out.println("Sign Out");
			}else {
				System.out.println(ids[log]+" Signed In");
			}
			System.out.println("*******************");
			
			System.out.println("*** Frozen Shop ***");
			System.out.println("[1] Sign In");
			System.out.println("[2] Sign Out");
			System.out.println("[3] Shopping");
			System.out.println("[4] Cart");
			System.out.println("[0] Terminate");
			
			System.out.print("Select a menu");
			int sel=scan.nextInt();
			
			if(sel==1) {
				System.out.print("ID : ");
				String ID=scan.next();
				System.out.print("PW : ");
				String PW=scan.next();
				
				for(int i=0; i<ids.length; i++) {
					if(ID.equals(ids[i]) && PW.equals(pws[i])) {
						log=i;
					}
				}
				
				if(log==-1) {
					System.out.println("Failure to Sign In. Please enter a valid ID or PW");
				}else {
					System.out.println("Singed In as "+ids[log]);
				}
			}else if(sel==2) {
				log=-1;
				System.out.println("Successfully Signed Out.");
			}else if(sel==3) {
				if(log==-1) {
					System.out.println("You have to sign in first.");
					continue;
				}
				
				while(true) {
					System.out.println("List of items");
					for(int i=0; i<items.length; i++) {
						System.out.println(items[i]);
					}
					System.out.println("[4] Move to Back");
					
					System.out.print("Select a number for choosing item");
					int choice=scan.nextInt();
					
					if(choice==4) {
						break;
					}
					
					shop[count][0]=log;
					shop[count][1]=choice;
					count+=1;
				}
			}else if(sel==4) {
				int apple=0;
				int orange=0;
				int grape=0;
				
				for(int i=0; i<count; i++) {
					if(shop[i][0]==log) {
						if(shop[i][1]==1) {
							apple+=1;
						}else if(shop[i][1]==2) {
							orange+=1;
						}else if(shop[i][1]==3) {
							grape+=1;
						}
					}
				}
				
				System.out.println("Item "+items[0]+" | count : "+apple);
				System.out.println("Item "+items[0]+" | count : "+orange);
				System.out.println("Item "+items[0]+" | count : "+grape);
			}else if(sel==0) {
				System.out.println("Terminate?");
				break;
			}
		}
	}
}
