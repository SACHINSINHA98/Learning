package Session2;

import java.util.ArrayList;

public class evenSubarrays {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(8);
		//list.add(7);
		list.add(6);
		System.out.println(solve(list));

	}
	 public static String solve(ArrayList<Integer> A) {
		 
		 
			 if((A.size())%2==0) {
				 if(A.get(0)%2==0 && (A.get((A.size()-1)))%2==0) {
					 return "YES";
				 }
				 
			 }
			 
		 return "NO";
		 }
			 

}
