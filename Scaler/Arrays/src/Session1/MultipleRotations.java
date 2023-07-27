package Session1;

import java.util.Arrays;

public class MultipleRotations {
	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 4, 5 };
		int B[] = {2,3,5};
		int[][] arr = solve(A, B);
		 
		/*for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < A.length; j++) {
				arr[i][j] = A[j];
			}
		}*/
		System.out.println(Arrays.deepToString(arr));

	}

	public static int[][] solve(int[] A, int[] B) {
		int[][] arr = new int[B.length][A.length];
		int []temp=new int[A.length];
		for (int d = 0; d < A.length; d++) {
			temp[d]=A[d];
		}
		
		
		
		for (int i = 0; i < B.length; i++) {
			for (int d = 0; d < A.length; d++) {
				temp[d]=A[d];
			}
			int x=B[i]%A.length;
			if(x==0) {
				for (int d = 0; d < A.length; d++) {
					temp[d]=A[d];
				}
				for (int m = i; m<=i; m++) {
					for (int j = 0; j < A.length; j++) {
						arr[m][j] = temp[j];
					}}
				
			}else {
			
			
			reverse(temp, 0, A.length - 1);
			
			reverse(temp, A.length - 1-x+1, A.length -1 );
			
			reverse(temp, 0, A.length - 1-x );
			
			for (int m = i; m<=i; m++) {
				for (int j = 0; j < A.length; j++) {
					arr[m][j] = temp[j];
				}}
			
			}
			
			for (int m = i; m<=i; m++) {
				for (int j = 0; j < A.length; j++) {
					arr[m][j] = temp[j];
				}}
			
			
			
		}
		
		return arr;}
		
		
	
	

	 

	public static void reverse(int[] A, int i, int j) {

		while (i < j) {
			swap(A, i, j);
			i++;
			j--;
		}

	}

	public static void swap(int[] A, int i, int j) {

		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
		
	}
}
