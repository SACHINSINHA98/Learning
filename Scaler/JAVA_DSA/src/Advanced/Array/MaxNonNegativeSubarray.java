package Advanced.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNonNegativeSubarray {
    public static void main(String[] args) {
        //Integer []arr={0,0,-1,0};
        Integer []arr={1, 2, 5, -7, 2, 3,10};
        List<Integer> list= Arrays.asList(arr);
        maxSum(list);

    }

    private static void maxSum(List<Integer> list) {
        int maxSum=list.get(0);
        int sum=0;
        ArrayList<Integer> tempArr= new ArrayList();
        ArrayList<Integer> ansArr= new ArrayList();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=0){
                sum=sum+list.get(i);
                tempArr.add(list.get(i));
            }else{
                sum=0;
                tempArr=new ArrayList<>();
            }
            if((tempArr.size() > ansArr.size() && maxSum==sum )|| sum< maxSum ){
                maxSum=sum;
                ansArr=tempArr;
            }

        }
        System.out.println(ansArr);
    }
}
