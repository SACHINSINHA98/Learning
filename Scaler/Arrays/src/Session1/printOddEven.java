package Session1;

import java.util.Arrays;
import java.util.Scanner;

public class printOddEven {

	public static void main(String[] args) {
		int T;

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		while (T > 0) {
			int length;

			length = sc.nextInt();
			int[] arr = new int[length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2!=0) {
					System.out.print(arr[i]+" ");
				}
				//System.out.println("");
				}
			System.out.println("");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2==0) {
					System.out.print(arr[i]+" ");
				}
				//System.out.println("");
				}
			System.out.println("");
			
			

			T--;
		}

	}
}
