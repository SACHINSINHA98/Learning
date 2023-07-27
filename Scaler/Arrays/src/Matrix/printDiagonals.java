package Matrix;

public class printDiagonals {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3,50}, { 4, 5, 6 ,51}, { 7, 8, 9 ,52}};
		alldiagonals(arr);
	}

	public static void alldiagonals(int[][] arr) {//my approach
		int x=arr[0].length-1;
		for(int m=0;m<arr[0].length;m++) {
			int i=0;
			int j=x;
			while(i < arr.length && j>=0) {
			System.out.print(arr[i][j]+" ");
			i++;
			j--;
			}
			System.out.println(" ");
			x--;
		}
		
		for(int row=1;row<arr.length;row++) {//sir approach
			int i=row;
			int j=arr[0].length-1;
			while(i < arr.length && j>=0) {
			System.out.print(arr[i][j]+" ");
			i++;
			j--;
			}
			System.out.println(" ");
			
		}
		
	}
}
