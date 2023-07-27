package ArrayMaths;

public class MajorityElement {

	public static void main(String[] args) {
		int [] arr= {5,2,5,3,5,1,2,5,5,5,4,1,5};
		System.out.println(MajorityEle(arr));
	}
	public static int MajorityEle(int[]arr) {
		int ME=0;
		int count=0;
		int i=0;
		while(i<arr.length) {
			if(count==0) {
				ME=arr[i];
				count++;
				
			}else if(ME!=arr[i]) {
				count--;
			}else {
				count++;
			}
			i++;
		}
		System.out.println(count);
		if(count>0) {
		return ME;}
		return 0;
	}
}
