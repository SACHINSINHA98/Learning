package InterviewProblems;

public class GivenNArrayElementsFindTriplets {
public static void main(String[] args) {
	int []arr= {3,4,6,9,2};
	triplets(arr);
	triplets2(arr);
}
//optimized fix middle and check element less than middle on left and then check greater than middle on right
private static void triplets2(int[] arr) {
	int sum=0;
	for(int i=1;i<arr.length-1;i++) {
		int L=0;
		int R=0;
		int middle=arr[i];
		for(int j=0;j<i;j++) {
			if(arr[j]<middle) {
				L++;
			}
		}
		for(int k=i+1;k<arr.length;k++) {
			if(arr[k]>middle) {
				R++;
			}
		}
		sum=sum+(L*R);
	}
	System.out.println(sum);
}
//brute force
private static void triplets(int[] arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[i]<arr[j]&&arr[j]<arr[k]) {
					count++;
				}
			}
		}
	}
	System.out.println(count);
	
}

}
