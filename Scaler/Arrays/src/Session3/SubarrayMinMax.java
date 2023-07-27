package Session3;

public class SubarrayMinMax {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 4, 6, 5, 1, 5, 2, 6, 4, 4, 2, 1, 5 };
		
		System.out.println(length(arr));

	}
	public static int length(int []arr) {
		int min= min(arr);
		int max= max(arr);
		int len=arr.length;
		int minIndex=-1;
		int maxIndex=-1;
		
		if(min==max) {
			return 1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==min) {
				minIndex=i;
				int ans= minIndex-maxIndex+1;
				if(maxIndex!=-1) {
					len=Math.min(len,ans);
				}
				}
			if(arr[i]==max) {
				maxIndex=i;
				int ans=maxIndex-minIndex+1;
				
				if(minIndex!=-1) {
					len=Math.min(len,ans);
				}
			}
		}
		return len;
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}