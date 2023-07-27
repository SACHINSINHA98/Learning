package Session4;

import java.util.Arrays;

public class Que1 {

	public static void main(String[] args) {
		int[] arr = { 2, -1, 3, 1 };
		//printSubarrays(arr);
		//System.out.println("sums ");
		//Subarrayssum(arr);
		SubarrayssumIndex(arr);
	}

	public static void printSubarrays(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				// int sum=0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					// sum=sum+arr[k];
				}
				// System.out.print(sum);brute approach to print sum
				System.out.println(" ");
			}

		}

	}

	public static void Subarrayssum(int[] arr) {// using prefix sum
		int[] ps = prefixsum(arr);
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				if (i == 0) {
					sum = sum + ps[j];
				} else {
					sum = sum + ps[j] - ps[i - 1];
				}
				System.out.println(sum);

			}
		}
	}
	public static void SubarrayssumIndex(int[] arr) {// sum from particular index say index 2 my approach first
		int[] ps = prefixsum(arr);
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i==2) {
				
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				if (i == 0) {
					sum = sum + ps[j];
				} else {
					sum = sum + ps[j] - ps[i - 1];
				}
				System.out.println(sum);

			}
		}}
	}


	static int[] prefixsum(int[] arr) {
		int[] ps = new int[arr.length];
		ps[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ps[i] = ps[i - 1] + arr[i];
		}
		return ps;
	}

}
