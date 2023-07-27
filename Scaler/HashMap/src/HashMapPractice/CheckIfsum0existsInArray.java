package HashMapPractice;
//prefix sum approach in which if ps contains duplicates there exists a sum 0
public class CheckIfsum0existsInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, -3, 4, 3, 1, -2, -3 };
		sumZero(arr);
	}

	private static void sumZero(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum == 0) {
					System.out.println("true");
					return;
				}
			}

		}

	}

}
