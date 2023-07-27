package com.practice.strings;

import java.util.Arrays;

//given a string sort it in dictionary order(small letters)
public class DictOrder {
	public static void main(String[] args) {
		String str= "bbbacbacdadbcadbcbcdabcbdbaabcbda";
		
		
		String dictString= dictorder(str);
		System.out.println(dictString);
		
	}

	private static String dictorder(String str) {
		int []arr= new int[26];
		
			for(int j=0;j<str.length();j++) {
			arr[str.charAt(j)-'a']++;
		}
		String dictString= generateString(arr, str);
		return dictString;
	}
	private static String generateString(int[]arr, String str) {
		
		StringBuilder dictString= new StringBuilder(str);
		int k=0;
		for(int i=0;i<26;i++) {
			int count=arr[i];
			for(int j=0;j<count;j++) {
				dictString.setCharAt(k,  (char) (i+'a'));
				k++;
			}
		}
		
		return dictString.toString();
	}
}
