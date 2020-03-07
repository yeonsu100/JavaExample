package step1_08_If;
/*
 * # if문의 구조 (3가지)
 * 
 * 1. 
 * 		if(조건식) {
 * 			조건식이 true일 때 실행할 문장;
 * 		}
 * 
 * 2. 
 * 		if(조건식) {
 * 			조건식이 true일 때 실행할 문장;
 * 		}else{
 * 			조건식이 flase일 때 실행할 문장;
 * 		}
 * 
 * 3. 
 * 		if(조건식1) {
 * 			조건식1이 true일 때 실행할 문장;
 * 		}else if(조건식2){
 * 			조건식2이 true일 때 실행할 문장;
 * 		}else if(조건식3){
 * 			조건식3이 true일 때 실행할 문장;
 * 		}else{
 * 			위 조건들을 모두 만족하지 않을 때 실행할 문장; 
 * 		}
 */
public class IfEx13 {
	public static void main(String[] args) {
		
		int num=10;
		
		if(num%2==0) {
			System.out.println("Even");
		}
		if(num%2==1) {
			System.out.println("Odd");
		}
		
		// 실행할 문장이 1문장일 경우, 블럭 {} 생략 가능 (But, 비추!)
		if(num%2==0)
			System.out.println("Even");
		if(num%2==1)
			System.out.println("Odd");
		
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
			
		// 다중 if-else if 구문은 다중 택일로 참인 조건식을 만나면,
		// 이하 조건은 실행하지 않는다.
		if(10==10) {
			System.out.println(10);
		}
		if(11==11) {
			System.out.println(11);
		}
		
		if(10==10) {
			System.out.println(10);
		}else if(11==11) {
			System.out.println(11);
		}
		
	}
}
