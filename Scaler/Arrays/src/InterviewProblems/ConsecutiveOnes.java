package InterviewProblems;

import java.util.ArrayList;
import java.util.List;
//when we get 0 iterate towards left and get the left count of 1's and then towards right side do the same.
public class ConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 0, 1, 1, 1 };
		maxConsecutive(arr);
	}

	private static void maxConsecutive(int[] arr) {
		int count = 0;
		int maximum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			int L = 0;
			int R = 0;
			int max = Integer.MIN_VALUE;
			if (arr[j] == 0) {
				for (int k = j - 1; k >= 0; k--) {
					if (arr[k] == 1) {
						L++;
					} else {
						break;
					}
				}
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[k] == 1) {
						R++;
					} else {
						break;
					}
				}
				if (count - (L + R) > 0) {
					max = Math.max(maximum, L + R + 1);
					maximum = max;
				}else {
					max=Math.max(maximum,L+R);
					maximum=max;
				}
			}

		}
		System.out.println(maximum);
	}
}
