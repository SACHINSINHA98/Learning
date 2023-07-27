package Session1;

public class Pony {

	public static void main(String[] args) {
		int []arr= {2,4, 3, 1, 5};
		int B=1;
		
		System.out.println(count(arr,B));
		
	}
	public static int count(int[] arr,int B) {
		int count=0;
		if(find(arr,B)== -1){
			return -1;}else {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>B) {
			count++;}
		}}
		return count;}
	public static int find(int[]arr,int B) {
		
		for(int num:arr) {
			if(num==B) {
				return num;
			}
		}
		return -1;
	}

}
