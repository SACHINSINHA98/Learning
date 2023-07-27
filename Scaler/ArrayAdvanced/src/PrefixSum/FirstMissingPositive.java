package PrefixSum;

import java.util.Arrays;

public class FirstMissingPositive {
public static void main(String[] args) {
	int []arr= {7,6,1,2,3,3,-1,0,4,2,9,8,8,0,-1};
	missing(arr);
}

private static void missing(int[] arr) {
	int i=0;
	while(i<arr.length) {
		int correct=arr[i]-1;
		if(arr[i]>0 &&arr[i]<arr.length&& arr[i]!=arr[correct]   ) {
			swap(arr,i,correct);
		}else {
			i++;
		}
	}
	for(int j=0;j<arr.length;j++) {
		if(arr[j]!=j+1) {
			System.out.println(j+1);
			break;
		}
	}
	
}

private static void swap(int[] arr, int i, int correct) {
	int temp=arr[correct];
	arr[correct]=arr[i];
	arr[i]=temp;
	
}
}
