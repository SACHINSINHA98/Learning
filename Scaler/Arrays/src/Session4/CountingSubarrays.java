package Session4;

import java.util.ArrayList;

public class CountingSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		int B = 4;
		list.add(0);
		list.add(1);
		 list.add(0);
		 list.add(1);
		 list.add(0);
		//list.add(6);
		//System.out.println(solve(list, B));
		//System.out.println(goodSubArrays(list, B));
		System.out.println(AlternatingSubArrays(list, B));
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			int sum = 0;
			for (int j = i; j < A.size(); j++) {

				sum = sum + A.get(j);
				if (sum < B) {
					count++;
				}
			}
		}
		return count;
	}
	public static int goodSubArrays(ArrayList<Integer> A, int B) {
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
			int sum = 0;
			for (int j = i; j < A.size(); j++) {
				sum = sum + A.get(j);
				if((j-i+1)%2==0) {
				if (sum < B) {
					count++;
				}}else {
					if (sum > B) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public static String AlternatingSubArrays(ArrayList<Integer> A, int B) {
		int count = 0;
		String a="true";
		for (int i = 0; i < A.size()-1; i++) {
			for(int j=i;j<A.size()-1;j++) {
			
				if((A.get(i)^A.get(i+1))==1 && a=="true"&& (j-i+1%B)==0) {
					a="true";
				}else {
					a="false";
				}
				
			}}
		return a;
	}

}
