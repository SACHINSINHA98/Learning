package Intermediate.PrefixSum;

import java.util.Arrays;
import java.util.List;

public class PickFromBothSides {
    public static void main(String[] args) {
        Integer []arr={2,3,4,3,4,4,1};
        List<Integer> list= Arrays.asList(arr);
        int k=6;
        maxSum(list,k);
    }

    private static void maxSum(List<Integer> list, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+list.get(i);
        }
        int ansSum=sum;
        for(int i=0;i<k;i++){
            sum= sum-list.get(k-i-1)+list.get(list.size()-i-1);
            if(sum>ansSum){
                ansSum=sum;
            }
        }
        System.out.println(ansSum);
    }
}
