import java.util.Arrays;

public class Session6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 11;
		int a[] = { 1, 2, 3, 4, 5 };
		String A="101";
		String B="111";
		// System.out.println(n);
		// System.out.println(count(n));

		/*
		 * int m=0; while(n!=0) { m=n%2; ans.concat(m+""); n=n/2;
		 * 
		 * } System.out.println(ans);
		 */

		convertBinary(n);
		System.out.println(split(a));
		
	}

	public static int count(Integer n) {
		int count = 0;
		String s = Integer.toBinaryString(n);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		return count;
	}

	public static void convertBinary(Integer n) {

		int m = 0;
		String ans = "";
		while (n != 0) {

			m = n % 2;
			ans = ans.concat(m + "");

			n = n / 2;

		}

		char[] ch = ans.toCharArray();
		// char[]chrev=new char[ch.length];

		// System.out.println(ch);
		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = temp;
		}
		System.out.println(ch);

	}

	public static String split(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		if (sum % 2 == 0) {
			return "YES";
		}
		return "NO";
	}

}