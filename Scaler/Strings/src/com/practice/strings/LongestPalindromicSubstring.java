package com.practice.strings;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		String str = "abccbaaaaaaa";
		longestPalindrome(str);
	}

	private static void longestPalindrome(String str) {

		int maxLength = 1;
		for (int k = 0; k < str.length(); k++) {
			int i = k;
			int j = k;
			while (i > 0 && j < str.length() - 1) {

				if (str.charAt(i - 1) == str.charAt(j + 1)) {
					i--;
					j++;
				} else {
					break;
				}
				maxLength = Integer.max(maxLength, j - i + 1);
			}
		}
		for (int m = 0; m < str.length(); m++) {
			int x = m;
			int z = m + 1;
			while (x > 0 && z < str.length() - 1) {

				if (str.charAt(x - 1) == str.charAt(z + 1)) {
					x--;
					z++;
				} else {
					break;
				}
				maxLength = Integer.max(maxLength, z - x + 1);
			}

		}

		System.out.println(maxLength);
	}
}
