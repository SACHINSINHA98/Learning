package com.practice.strings;

import java.util.Arrays;

public class ReverseSentance {
	public static void main(String[] args) {
		String str = "I am Sachin Sinha";

		 String s= reverse(str);
		 System.out.println(s);

	}

	private static String reverse(String str) {
		char[] ch = str.toCharArray();
		int l = 0;
		int r = str.length() - 1;
		while (l < r) {
			swap(ch, l, r);
			l++;
			r--;
		}
		char[]sen=ch;
		int l1=0;
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i] == ' ' || i == ch.length - 1) {
				
				int r1 = i-1;
				while (l1 < r1 && r1<ch.length-1) {
					swap(sen, l1, r1);
					l1++;
					r1--;
					}
				 l1=i+1;
			}

		}
		return String.valueOf(sen);
	}

	private static void swap(char[] ch, int l, int r) {
		char temp = ch[l];
		ch[l] = ch[r];
		ch[r] = temp;
	}

}
