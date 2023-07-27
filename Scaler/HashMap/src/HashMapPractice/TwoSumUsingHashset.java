package HashMapPractice;

import java.util.HashMap;
import java.util.HashSet;
//in hashset we will encounetr duplicate problem to resolve that instead use hashmap and store count 
public class TwoSumUsingHashset {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 3 };
		int k = 5;
		twoSum(arr, k);
		twoSumBetter(arr, k);
	}

	private static void twoSum(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], (map.get(arr[i])) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);

		for (int j = 0; j < arr.length; j++) {
			int num = k - arr[j];
			if(num==arr[j]&& map.get(num)>=2) {
				System.out.println("true");
				return ;
			}else if (num!=arr[j] && map.containsKey(num)) {
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");

	}
	//instead of inserting all elements before check wheather its counterpart exits , if it exists return true else insert that array element
	private static void twoSumBetter(int[] arr, int k) {
		HashSet<Integer>set= new HashSet<>();
		for (int i=0;i<arr.length;i++) {
			int num=k-arr[i];
			if(set.contains(num)) {
				System.out.println("true");
				return;
			}else {
				set.add(arr[i]);
			}
		}
		System.out.println("false");
	}
	
}
