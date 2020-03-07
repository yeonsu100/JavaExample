package step1_03_variable;

/*
 * 변수의 특징
 * - 변수 하나 당 값은 한개만 저장할 수 있다.
 * - 그렇기 때문에 새로운 값이 저장되면 이전의 값은 사라지게 된다.
 * - 같은 이름의 변수를 사용할 수 없다.
 */
public class VarEx04 {
	public static void main(String[] args) {
		int num=10;
		num=9;
		num=3;
		System.out.println(num);
	}
}
