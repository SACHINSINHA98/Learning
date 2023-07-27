package Session2;

import java.util.ArrayList;

public class ProductArrayPuzzle {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(1);
		 A = solve(list);
		System.out.println(A);
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int product = productList(A);
		ArrayList<Integer> B = new ArrayList<Integer>();
		//System.out.println(list);

		for (int i = 0; i < A.size(); i++) {
			int ans = 0;
			ans = (product/A.get(i));
			B.add(ans);
		}

		return B;
	}

	public static int productList(ArrayList<Integer> A) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int product = 1;
		for (int i = 0; i < A.size(); i++) {
			product = product * A.get(i);
			
		}
		return product;
	}
}
