package Advanced.Array;

import java.util.Arrays;
import java.util.List;
public class KadaneAlgorithm {
    public static void main(String[] args) {
        Integer []arr={1,-1,2,3,4};
        List<Integer> list= Arrays.asList(arr);
        maxSum(list);
    }

    private static void maxSum(List<Integer> list) {
            int sum=0;
            int maxSum=list.get(0);
            for(int i=0;i<list.size();i++){
                sum = sum + list.get(i);
                maxSum= Integer.max(sum,maxSum);
                if(sum<0){
                    sum=0;
                }
            }
        System.out.println(maxSum);
    }
}
