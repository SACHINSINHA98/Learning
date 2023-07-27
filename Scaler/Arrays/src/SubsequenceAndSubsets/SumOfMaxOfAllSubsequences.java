package SubsequenceAndSubsets;
//by contribution technique sort and check choices.


public class SumOfMaxOfAllSubsequences {
	public static void main(String[] args) {
		int[] arr = { 3, 1, -4 };
		subsets(arr);
	}

	private static void subsets(int[] arr) {
		int sum1=0;
		for (int i = 1; i < (1 << arr.length); i++) {
			
			int max = Integer.MIN_VALUE;
			int num=0;
			for (int j = 0; j < arr.length; j++) {
				
				if (checkbit(i, j)) {
					 num = arr[j];
					if(num>max) {
						max=num;
					}
					
				}
				
				
			}
			sum1=sum1+max;
			
			
		}
		System.out.println(sum1);
	}

	private static boolean checkbit(int i, int j) {
		if (((i >> j) & 1) == 1) {
			return true;
		}
		return false;
	}
}
