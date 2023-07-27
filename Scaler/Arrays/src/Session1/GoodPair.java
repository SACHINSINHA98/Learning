package Session1;

public class GoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,4,5,6,7};
		int B=5;
		System.out.println(solve(arr,B));
	}
	
	    public static int solve(int[] A, int B) {
	        for(int i=0;i<A.length;i++){
	            for(int j=0;j<A.length;j++){
	                if(A[i]+A[j]==B && i!=j){
	                    return 1;
	                }
	            }
	        }
	        return 0;
	    }
	}



