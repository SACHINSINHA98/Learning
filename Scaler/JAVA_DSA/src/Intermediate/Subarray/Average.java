package Intermediate.Subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        Integer []arr={20,3,13,5,10,14,8,5,11,9,1,11};
        List<Integer> list= Arrays.asList(arr);
        int k=9;
        solve(list,k);
    }
    private static void solve(List<Integer> list, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+list.get(i);
        }
        int average= sum/k;
        int minIndex=0;
        for(int i=1;i<list.size()-k+1;i++){
            int start=i-1;
            int end=i+k-1;
            sum= sum-list.get(start)+list.get(end);
            if((sum/k)<=average){
                average= (sum/k);
                 minIndex=i;
            }


        }
        System.out.println(average);
        System.out.println(minIndex);
    }
}
