package PrefixSum;

import java.util.Arrays;

public class RowColZero {
	public static void main(String[] args) {
		int[][]arr= {{0,1,0,0,1},{1,1,1,1,1},{1,1,1,1,1}};
		zeroMatrix(arr);
	}

	private static void zeroMatrix(int[][] arr) {
		boolean []row = new boolean[arr.length];
		boolean []col = new boolean[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					row[i]=true;
				}
				}
		}
		for(int i=0;i<arr[0].length;i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j][i] == 0) {
					col[i] = true;
				}
			}
		}
		for(int m=0;m<row.length;m++) {
			for(int n=0;n<col.length;n++) {
				if(row[m]==true||col[n]==true) {
					arr[m][n]=0;
				}
					
			}
		}
		System.out.println(Arrays.deepToString(arr));

}
}