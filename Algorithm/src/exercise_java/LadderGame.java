package exercise_java;

import java.util.Random;
import java.util.Stack;

public class LadderGame {
	public static final int STRAIGHT=1;
	public static final int TURN_RIGHT=2;
	public static final int TURN_LEFT=3;
	
	public static int[][] generateLadder(int width, int height){
		Random random=new Random();
		int[][] ladder=new int[height][width];
		Stack<Integer> pathStack=new Stack<Integer>();
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				if(!pathStack.isEmpty()) {
					ladder[i][j]=TURN_LEFT;
					pathStack.pop();
				}else {
					int path=random.nextInt(2)+1;
					while(!isValid(path,i,j,width,height)) {
						path=random.nextInt(2)+1;
					}
					if(path==TURN_RIGHT)pathStack.push(path);
					ladder[i][j]=path;
				}
			}
		}
		return ladder;
	};
	
	public static void printLadder(int[][] ladder) {
		for(int i=0; i<ladder.length; i++) {
			for(int j=0; j<ladder[0].length; j++) {
				System.out.print(ladder[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean isValid(int path, int i, int j, int height, int width) {
		if(path==TURN_RIGHT && j==width-1)return false;
		if(path==TURN_LEFT && j==0)return false;
		return true;
	}
	
	public static int visitLadder(int[][] ladder, int start) {
		int dest=-1;
		int cursorX=start;
		int cursorY=0;
		
		if(start<ladder[0].length) {
			while(cursorY<ladder.length) {
				if(ladder[cursorY][cursorX] == TURN_RIGHT) {
					cursorX++;
				}else if(ladder[cursorY][cursorX] == TURN_LEFT) {
					cursorX--;
				}
				cursorY++;
			}
			dest=cursorX;
		}
		return dest;
	}
	
	public static void main(String[] args) {
		int[][] ladder=generateLadder(4,6);
		int start=2;
		while(visitLadder(ladder, start)==3) {
			ladder=generateLadder(4,6);
		}
		printLadder(ladder);
	}
}
