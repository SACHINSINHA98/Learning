package TwoPointers;

public class SumOfTwo {
    public static void main(String[] args) {
        int []arr={-3,0,1,3,6,8,11,14,18,25};
        int k=5;

        if(isTwoSum(arr,k)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        if(isTwoMinus(arr,k)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static boolean isTwoMinus(int[] arr, int k) {
        int p1=0;
        int p2=1;
        while(p2<arr.length){
            if(arr[p2]-arr[p1]==k){
                return true;
            }else if(arr[p2]-arr[p1]>k) {
                p1++;
                if(p1==p2){
                    p2++;
                }

            }else{
                p2++;
            }

        }
        return false;
    }

    private static boolean isTwoSum(int[] arr, int k) {
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            if(arr[p1]+arr[p2]==k){
                return true;
            }else if(arr[p1]+arr[p2]<k){
                p1++;
            }else {
                p2--;
            }
        }

        return false;

    }


}
