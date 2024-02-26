package session_05;

//concept of array
public class Demo {
	
public static void main(String[] args) {
	int[][] arr= new int[2][3];
	/*
	arr[0][0] = 1;
	arr[1][2] = 10;*/
	
	for(int i =0;i<arr.length;i++) {
		int sum=0;
		for(int j =0;j<arr[i].length;j++) {
			arr[i][j] = i+j+1;
			System.out.println(arr[i][j]+ "\t");
			sum += arr[i][j]; // Add element to row sum
	    }
	    System.out.println("  Sum: " + sum); 
		
		System.out.println();
	}
	/*for(int[] i:arr) {
		for(int j:i) {
			System.out.println(j+"\t");
		}
		System.out.println();
	}*/
	
	
}
}
