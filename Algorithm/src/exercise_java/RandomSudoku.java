package exercise_java;

import java.util.Random;
import java.util.Scanner;

public class RandomSudoku {
	public static void main(String[] args) {
		int size=0;
		int rand;
		Random ran=new Random(System.currentTimeMillis());
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("2 이상 숫자를 입력하세요");
			size=scanner.nextInt();
			if(size<2) {
				System.out.println("2 이상 숫자를 입력하세요");
			}else {
				break;
			}
		}
		
		int result[][]=new int[size][size];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				result[i][j]=0;
			}
		}
		
		rand=ran.nextInt(size)+1;
		int a;
		int b;
		int row;
		int col;
		boolean isSame=true;
		int loopCount=0;
		
		long curTime=System.currentTimeMillis();
		System.out.println("시작시간 : "+(curTime/1000));
		
		Loop2: while(true) {
			loopCount=0;
			
			for(int i=0; i<size;i++) {
				for(int j=0; j<size; j++) {
					row=j;
					col=i;
					
					Loop1:
						while(true) {
							rand=ran.nextInt(size)+1;
							result[i][j]=rand;
							
							for(a=row-1; a>=0; a--) {
								while(isSame==true) {
									if(result[i][j]==result[i][a]) {
										isSame=true;
										continue Loop1;
									}else {
										isSame=false;
									}
								}
								isSame=true;
							}
							
							for(b=col-1; b>=0; b--) {
								while(isSame==true) {
									if(result[i][j]==result[b][j]) {
										loopCount++;
										if(loopCount>300) {
											continue Loop2;
										}
										isSame=true;
										continue Loop1;
									}else {
										isSame=false;
									}
								}
								isSame=true;
							}
							break;
						}
				}
			}
			long curTime2=System.currentTimeMillis();
			System.out.println("종료시간 : "+(curTime2/1000));
			System.out.println("걸린시간 : "+((curTime2-curTime)/1000));

			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					if(String.valueOf(result[i][j]).length()==1) {
						System.out.print(" "+result[i][j]+" ");
					}else {
						System.out.print(" "+result[i][j]);
					}
				}
				System.out.println();
			}
			break;
		}
	}
}
