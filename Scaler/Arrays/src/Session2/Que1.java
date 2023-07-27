package Session2;

import java.util.Arrays;

//prefixsum
public class Que1 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 6, -2 };

		int[] ps = prefixsum(arr);
		int[] po = prefixsumodd(arr);
		int[] pe = prefixsumeven(arr);
		System.out.println(Arrays.toString(pe));
		System.out.println(specialindices(arr, po, pe, ps));
	}

	static int[] prefixsum(int[] arr) {
		int[] ps = new int[arr.length];
		ps[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			ps[i] = ps[i - 1] + arr[i];
		}
		return ps;
	}

	static int[] prefixsumodd(int[] arr) {
		int[] po = new int[arr.length];
		po[0] = 0;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				po[i] = po[i - 1];
			} else {
				po[i] = po[i - 1] + arr[i];
			}
		}

		return po;
	}

	static int[] prefixsumeven(int[] arr) {
		int[] pe = new int[arr.length];
		pe[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				pe[i] = pe[i - 1] + arr[i];
			} else {
				pe[i] = pe[i - 1];
			}
		}

		return pe;
	}

	static int specialindices(int[] arr, int[] po, int[] pe, int[] ps) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			
			int sumodd = 0;
			int sumeven =0 ;
			if (i == 0) {
				
				sumodd = sumodd + pe[arr.length - 1] - pe[i];

				sumeven = sumeven + po[arr.length - 1] - po[i];
				if (sumeven == sumodd) {
					count++;
				}
			} else {
				
				sumodd = sumodd + po[i - 1] + pe[arr.length - 1] - pe[i];

				sumeven = sumeven + pe[i - 1] + po[arr.length - 1] - po[i];
				if (sumeven == sumodd) {
					count++;
				}
			}
		}
			
		
		return count;
	}
}
