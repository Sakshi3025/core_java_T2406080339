//concept of array
package session_05;

public class Test1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println(arr[0]);
		//arr[0] = 5;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		System.out.println("array elements are: ");
		for(int a:arr) {
			System.out.println(a);
			
		}
		System.out.println("length of array: " + arr.length);
		
	}
}

