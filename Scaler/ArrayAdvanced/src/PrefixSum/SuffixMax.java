package PrefixSum;

import java.util.Arrays;

public class SuffixMax {
public static void main(String[] args) {
	int [] arr= {3,10,6,7,0,2,-1};
	System.out.println(Arrays.toString(suffixMax(arr)));
}

private static int[] suffixMax(int[] arr) {
	int max= arr[arr.length-1];
	for(int j=arr.length-2;j>=0;j--) {
		if(arr[j]>max) {
			max=arr[j];
		}else {
			arr[j]=max;
		}
	}
	return arr;
}
}
