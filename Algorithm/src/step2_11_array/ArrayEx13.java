package step2_11_array;

public class ArrayEx13 {
	public static void main(String[] args) {
		int[] arr= {44, 11, 29, 24, 76};
		int[] temp=null;
		
		int cnt=0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				cnt += 1;
			}
		}
		
		temp=new int[cnt];
		int j=0;
		for(int i=0; i<5; i++){
			if(arr[i]%4 == 0) {
				temp[j] = arr[i];
				j += 1;
			}
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.println(temp[i]+" ");
		}
		System.out.println();
	}
}