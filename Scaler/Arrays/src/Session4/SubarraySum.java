package Session4;

public class SubarraySum {
	public static void main(String[] args) {
		int[] arr = { 2, -1, 3, 1 };
		// printSubarrays(arr);
		// System.out.println("sums ");
		// Subarrayssum(arr);
		Subarrayssum(arr);
		 System.out.println("MAX is ");
		maxSubarrayssum(arr);
	}

	public static void printSubarrays(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				// int sum=0;
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
					// sum=sum+arr[k];
				}
				// System.out.print(sum);brute approach to print sum
				System.out.println(" ");
			}

		}

	}

	public static void Subarrayssum(int[] arr) {// using carry forward

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {

				sum = sum + arr[j];
				System.out.println(sum);

			}
		}
	}

	public static void maxSubarrayssum(int[] arr) {// using carry forward

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if(sum>maxSum) {
					maxSum=sum;
				}
			}
		}
		System.out.println(maxSum);
	}
}
