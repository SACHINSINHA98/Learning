package Session1;
//count elements which has atleast one element greater than it
public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,5,1,4,8,0,8,1,3,8};
		//System.out.println(max(arr));
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< max(arr)) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	public static int max(int []arr) {
		int max=Integer.MIN_VALUE;
		
		for (int index=0;index<arr.length;index++) {
			if(arr[index]>max) {
				max=arr[index];
			}
		}
		
		return max;
		
	}
	

}
