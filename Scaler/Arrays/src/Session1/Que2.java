package Session1;
//return true if there is target sum available in array.
public class Que2 {

	public static void main(String[] args) {
		int []arr= {2,5,1,4,8,0,8,1,3,8};
		//System.out.println(max(arr));
		System.out.println(sum(arr,20));
	}



	private static boolean sum(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]+arr[j]==target) {
						return true;
					}
				}
			}
			
		}
		return false;
	}
}