package step2_11_array;

import java.util.Scanner;

public class ArrayEx36 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] score=null;
		int count=0;
		
		while(true) {
			for(int i=0; i<count; i++) {
				System.out.print(score[i]+" ");
			}
			System.out.println();
			
			System.out.println("*** Vector Controller ***");
			System.out.println("[1] Add");
			System.out.println("[2] Delete (Index)");
			System.out.println("[3] Delete (Value)");
			System.out.println("[4] Insert");
			System.out.println("[0] Terminate");
			
			System.out.print("Select a menu : ");
			int sel=scan.nextInt();
			
			if(sel==1) {
				if(count==0) {
					score=new int[count+1];
				}else if(count>0) {
					int[] temp=score;
					score=new int[count+1];
					
					for(int i=0; i<count; i++) {
						score[i]=temp[i];
					}
					temp=null;
				}
				System.out.print("[Add] Insert a score : ");
				int data=scan.nextInt();
				
				score[count]=data;
				count+=1;
			}else if(sel==2) {
				System.out.print("[Delete] Insert a Index : ");
				int delIdx=scan.nextInt();
				
				if(count-1>delIdx || delIdx<0) {
					System.out.println("[*] This location can NOT be deleted!");
					continue;
				}
				
				if(count==1) {
					score=null;
				}else if(count>1) {
					int[] temp=score;
					score=new int[count-1];
					
					for(int i=0; i<delIdx; i++) {
						score[i]=temp[i];
					}
					for(int i=delIdx; i<count-1; i++) {
						score[i]=temp[i+1];
					}
					temp=null;
				}
				count-=1;
			}else if(sel==3) {
				System.out.print("[Delete] Insert a value for deleting : ");
				int delValue=scan.nextInt();
				
				int delIdx=-1;
				for(int i=0; i<count; i++) {
					if(score[i]==delValue) {
						delIdx=i;
					}
				}
				
				if(delIdx==-1) {
					System.out.println("[*] The value you entered does NOT exist!");
					continue;
				}
				
				if(count==1) {
					score=null;
				}else if(count>1) {
					int[] temp=score;
					score=new int[count-1];
					
					int j=0;
					for(int i=0; i<count; i++) {
						if(i!=delIdx) {
							score[j]=temp[i];
							j+=1;
						}
					}
					temp=null;
				}
				count-=1;
			}else if(sel==4) {
				System.out.print("[Insert] Insert an Index number : ");
				int insertIdx=scan.nextInt();
				
				if(count<insertIdx || insertIdx<0) {
					System.out.println("[*] This location can NOT be inserted!");
					continue;
				}
				
				System.out.print("[Insert] Insert a value : ");
				int insertValue=scan.nextInt();
				
				if(count==0) {
					score=new int[count+1];
				}else if(count>0) {
					int[] temp=score;
					score=new int[count+1];
					
					int j=0;
					for(int i=0; i<count+1; i++) {
						if(i!=insertIdx) {
							score[i]=temp[j];
							j+=1;
						}
					}
					temp=null;
				}
				score[insertIdx]=insertValue;
				count+=1;
			}else if(sel==0) {
				break;
			}
		}
	}
}

