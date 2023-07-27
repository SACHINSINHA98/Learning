package Advanced.BinarySearch;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialNumber {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int B = 10;
        System.out.println(solve(arr,B));
    }

    static int solve(List<Integer> A, int B) {
        int low=0;
        int high=A.size()-1;
        int ans=0;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(maxSumWindow(A,mid)>B){
                high=mid-1;
            }else if(maxSumWindow(A,mid)<=B){
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
    static int maxSumWindow(List<Integer> A, int k){
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+A.get(i);
        }
        int maxSum=sum;
        for(int i=1;i<=A.size()-k;i++){
            sum=sum-A.get(i-1)+A.get(i+k-1);
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
}
