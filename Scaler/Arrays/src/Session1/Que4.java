package Session1;

import java.util.Arrays;

//RotateArray
public class Que4 {

	public static void main(String[] args) {
		int[] arr = { 7,8,9,10,11,12 };
		rotateArray(arr,7);
		System.out.println(Arrays.toString(arr));
	}
	public static void rotateArray(int[]arr,int k) {
		k=k%arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
	}

	public static void reverse(int[] arr,int start, int end) {
		

		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		// return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}