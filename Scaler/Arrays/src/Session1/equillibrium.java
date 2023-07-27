package Session1;

public class equillibrium {
public static void main(String[] args) {
	int []arr= {1,2,3,4,8,10};
	System.out.println(equillibrium(arr));
}

private static int equillibrium(int[] arr) {
	int sum=0;
	for(int i=1;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	int sum1=sum;
	int x=0;
	int m=0;
	for (int j=1;j<arr.length;j++) {
		sum1=sum1-arr[j];
		x=x+arr[j-1];
		if(sum1==x) {
			m=j;
		}
		
	}
	return m;
}


}
