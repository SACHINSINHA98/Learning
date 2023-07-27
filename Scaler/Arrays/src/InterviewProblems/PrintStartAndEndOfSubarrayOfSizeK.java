package InterviewProblems;

public class PrintStartAndEndOfSubarrayOfSizeK {
public static void main(String[] args) {
	int []arr= {1,2,3,4,5};
	int k=3;
	startAndend(arr,k);
	bruteMax(arr,k);
	System.out.println("-----------------------------------");
	slidingWindow(arr,k);
}

private static void startAndend(int[] arr, int k) {
	int start=0;
	int end=k-1;
	for(int i=0;i<arr.length-(k-1);i++) {
		System.out.println(start+" "+end);
		start++;
		end++;
	}
	
}
//bruteforceapproach to calculate max in each window
private static void bruteMax(int[] arr, int k) {
	int max=Integer.MIN_VALUE;
	int start=0;
	int end=k-1;
	for( int i=0;i<arr.length-(k-1);i++) {
		
		int sum=0;
		for( int j=i;j<=end;j++) {
			sum=sum+arr[j];
			
			
			}
		if(sum>max) {
			max=Math.max(max, sum);
		}
		start++;
		end++;
		
		
	}
	System.out.println(max);
}

//slidingwindowapproachtocalculatesum
private static void slidingWindow(int[] arr, int k) {
	int start=0;
	int end=k-1;
	int firstwindowSum=0;
	for(int i=start; i<=end;i++) {
		firstwindowSum=firstwindowSum+arr[i];
	}
	start++;
	end++;
	int max=firstwindowSum;
	for(int j=start;j<arr.length-(k-1);j++) {
		firstwindowSum=firstwindowSum-arr[start-1]+arr[end];
		max=Math.max(firstwindowSum, max);
		start++;
		end++;
	}
	System.out.println(max);
	
}

}
