package Matrix;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		transpose(arr);
		

	}
	public static void transpose(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			for (int col=row;col<arr.length;col++) {
				swap(arr,row,col);
			}
		}
		System.out.println(Arrays.deepToString(arr));
		/*
		 * for(int[]row:arr) System.out.println(Arrays.toString(row)); }
		 */
		}
	public static void swap(int arr[][],int i,int j) {
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
}
