package Matrix;

public class rowSum {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		//sumRow(arr);
		//maxColRow(arr);
		diagonals(arr);
		System.out.println("  ");
		diagonals2(arr);
	}
	public static void sumRow(int[][]arr) {
		
		for(int row=0;row < arr.length;row++) {
			int sum=0;
			for(int col=0;col < arr[row].length;col++) {
				sum=sum+arr[row][col];
			}
			System.out.println(sum);
		}
		
	}
public static void maxColRow(int[][]arr) {
		int max=Integer.MIN_VALUE;
		System.out.println(arr.length); 
		
		for(int col=0;col<arr[0].length;col++) {
			int sum=0;
			for(int row=0;row < arr.length;row++) {
				
				sum=sum+arr[row][col];
				
				
			}
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println(max);
	}

public static void diagonals(int[][]arr) {
	
	for(int row=0;row < arr.length;row++) {
		
		for(int col=0;col < arr[row].length;col++) {
			if(row==col) {
		System.out.println(arr[row][col]);
		}
			}
		
	}
	
}
public static void diagonals2(int[][]arr) {
	int i=0;
	int j=arr.length-1;
	while(i<arr.length && j>=0) {
	
	System.out.println(arr[i][j]);
		i++;
		j--;
	}
	
}
}
