package Session2;

import java.util.Arrays;

//equillibrium
public class Que2 {
	
		public static void main(String[] args) {
			int[] arr = {5,-2,3,1,2 };
			Math.max(0, 0);
			int[]ps=prefixsum(arr);
			//System.out.println(checkEquillibrium(arr,ps));
			int []ss=suffixsum(arr,ps);
			System.out.println(Arrays.toString(ss));
		}

		/*
		 * static boolean checkEquillibrium(int[]arr,int[]ps) { for(int
		 * i=1;i<arr.length;i++) { int sumleft=0;
		 * 
		 * sumleft=sumleft+ps[i-1]; int sumright=0;
		 * sumright=sumright+ps[arr.length-1]-ps[i]; if(sumleft==sumright) { return
		 * true; } } return false; }
		 */
		static int[] prefixsum(int[]arr) {
			int[]ps= new int[arr.length];
			ps[0]=arr[0];
			for(int i=1;i<arr.length;i++) {
				ps[i]=ps[i-1]+arr[i];
			}
			return ps;
		}
		 public static int[] suffixsum(int[]A,int[]ps) {
				int[]ss= new int[A.length];
				ss[0]=ps[A.length-1];
				ss[A.length-1]=A[A.length-1];
				for(int i=A.length-2;i>0;i--) {
					ss[i]=ss[i+1]+A[i];
				}
				return ss;
			}
	}

