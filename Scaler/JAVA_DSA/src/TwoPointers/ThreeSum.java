package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int []arr={-2,-1,2,4,5};
        int b=1;
        findSum(arr,b);
    }

    private static void findSum(int []arr,int b) {
        int current=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length ;i++){
            int p1=i;
            int p2=i+1;
            int p3=arr.length-1;

            while(p2<p3){
                int sum=arr[p1]+arr[p2]+arr[p3];
                if(sum-b < current-b){
                    current=sum;
                }
                else if (sum>b){
                    p3--;
                }else if(sum<b){
                    p2++;
                }else{
                    System.out.println(current);
                    return ;
                }
            }
        }
        System.out.println(current);

    }

}
