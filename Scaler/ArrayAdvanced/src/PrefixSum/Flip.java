package PrefixSum;

import java.util.Arrays;

public class Flip {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0 };
		flip(arr);
	}

	private static int flip(int[] arr) {
		int[] b = arr.clone();
		int maxcount = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int count = 0;
				
				b=arr.clone();
				for (int k = i; k <= j; k++) {
					if (b[i] == 1) {
						b[i] = 0;
					} else {
						b[i] = 1;

					}
				}
				for(int m=0;m<b.length;m++) {
					if(b[i]==1) {
						count++;
					}
				}
				maxcount = Math.max(count, maxcount);
			}
		}
		System.out.println(maxcount);
		return 0;
	}
}