package Algorithms;

public class KadanesAlgo {
	public static void main(String[] args) {
		int []arr= {5,4,-9,2,3};
		System.out.println(maxSum(arr));
	}

	private static int maxSum(int[] arr) {
		int maxsum=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			maxsum=Integer.max(maxsum, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return maxsum;
	}
	
	
}
