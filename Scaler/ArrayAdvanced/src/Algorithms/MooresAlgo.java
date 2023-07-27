package Algorithms;

public class MooresAlgo {
public static void main(String[] args) {
	int []arr= {1,2,2,2,3,4,5,6,2,2,2};
	System.out.println(majority(arr));
}

private static int majority(int[] arr) {
	int count=0;
	int me=0;
	for(int i=0;i<arr.length;i++) {
		if(count==0) {
			me=arr[i];
			count++;
		}else if(me != arr[i]) {
			count--;
		}else {
			count++;
		}
	}
	return me;
}
}
