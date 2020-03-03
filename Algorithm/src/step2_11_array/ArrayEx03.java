package step2_11_array;

public class ArrayEx03 {
	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		// 1. 
		for(int i=0; i<5; i++) {
			arr[i]=10*(i+1);
			System.out.println(arr[i]);
		}
		
		System.out.println("=====");
		
		// 2.
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				System.out.println(arr[i]+" ");
			}
		}
		
		System.out.println("=====");
		
		// 3. 
		int sum=0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		
		System.out.println("=====");
		
		// 4.
		int count=0;
		for(int i=0; i<5; i++) {
			if(arr[i]%4 == 0) {
				count=count+1;
			}
		}
		System.out.println(count);
		
		System.out.println("=====");
		
		// 5. 
		int even=0;
		for(int i=0; i<5; i++) {
			if(arr[i]%2 == 0) {
				even += 1;
			}
		}
		System.out.println(even);
	}
}
