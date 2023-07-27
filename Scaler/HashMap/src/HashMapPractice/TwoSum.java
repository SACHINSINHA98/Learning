package HashMapPractice;

public class TwoSum {
public static void main(String[] args) {
	int []arr= {1,2,3};
	int k=5;
	checkSum(arr,k);
}

private static void checkSum(int[] arr, int k) {
	for(int i =0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(i!=j && (arr[i]+arr[j]==k)) {
				System.out.println("true");
				return;
			}
		}
	}
	System.out.println("false");
}
}
