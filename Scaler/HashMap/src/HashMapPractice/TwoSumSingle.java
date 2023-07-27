package HashMapPractice;

import java.util.HashSet;

public class TwoSumSingle {

	public static void main(String[] args) {
		int []arr= {2,7,-2,3,15};
		int k=11;
		System.out.println(checkSum(arr,k));

	}

	static boolean checkSum(int[] arr, int k) {
		HashSet<Integer> set= new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(k-arr[i])){
				set.add(arr[i]);
			}
			else {
				return true;
			}
		}
		return false;
		
		
	}

}
