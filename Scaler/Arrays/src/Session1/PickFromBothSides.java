package Session1;

public class PickFromBothSides {
public static void main(String[] args) {
	int arr[]= {5,-2,3,1,2};
	int b=3;
	System.out.println(maxpick(arr,b));
}

private static int maxpick(int[] arr,int b) {
	int sum=0;
	for(int i=0;i<b;i++) {
		sum=sum+arr[i];
		}
	int sumuptillb=sum;
	int result=0;
	for(int j=0;j<b;j++) {
		sumuptillb=sumuptillb-arr[arr.length-b-j];//subtract element from last index of b
		sumuptillb=sumuptillb+arr[b-j+1];//add element from last index of array
		if(sumuptillb>result) {
			result=sumuptillb;
		}
		}
	
	return result;

}}
