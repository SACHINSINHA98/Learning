package Session1;

public class MinMaxDif {
	public static void main(String[] args) {
		int[]A= {1,2,3,4};
		System.out.println(solve(A));
		
	}
	public static int solve(int[] A) {
		int MAX= Integer.MIN_VALUE;
		int MIN=Integer.MAX_VALUE;
		int diff=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				if(A[i]>MAX) {
					MAX=A[i];
				} }else{
					if(A[i]<MIN) {
						MIN=A[i];
					}
				}
			}
		
		
		return MAX-MIN;
    }


}


