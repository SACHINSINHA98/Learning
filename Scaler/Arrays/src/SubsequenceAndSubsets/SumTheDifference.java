package SubsequenceAndSubsets;

public class SumTheDifference {
	public static void main(String[] args) {
		int[] arr = { 1,3,4 };

		subsets(arr);
	}

	private static void subsets(int[] arr) {
		int sum = 0;
		for (int i = 1; i < (1 << arr.length); i++) {
			
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			int num=0;
			int diff=0;
			for (int j = 0; j < arr.length; j++) {
				
				if (checkbit(i, j)) {
					  num=arr[j];
					  if(num>max) {
						  max=num;
					  }
					  if(num<min) {
						  min=num;
					  }
				}
				 diff= max-min;
			}
			sum=sum+diff;
		}
		System.out.println(sum %(1e9 + 7 *(1000000007)));
	}

	private static boolean checkbit(int i, int j) {
		if (((i >> j) & 1) == 1) {
			return true;
		}
		return false;
	}
}
