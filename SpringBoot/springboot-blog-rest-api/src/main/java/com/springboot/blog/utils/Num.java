package com.springboot.blog.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Num {
	public static void main(String[] args) {
		 Integer[] arr= {1,2,3};
		 List<Integer> number= Arrays.asList(arr);
		 System.out.println(number.stream().map((num)->Integer.toString(num) ).collect(Collectors.toList()));
		  

 
 
}}
