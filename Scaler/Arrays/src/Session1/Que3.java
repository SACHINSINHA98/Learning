package Session1;

import java.util.Arrays;

//reverse array in constant space
public class Que3 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		// return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	}
		


