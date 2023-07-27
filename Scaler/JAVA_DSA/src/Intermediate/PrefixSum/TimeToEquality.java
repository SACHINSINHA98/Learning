package Intermediate.PrefixSum;

import java.util.Arrays;
import java.util.List;

public class TimeToEquality {
    public static void main(String[] args) {
        Integer []arr={731,349,490,781,271,405,811,181,102,126,866,16,622,492,194,735};
        List<Integer> list= Arrays.asList(arr);
        time(list);
        timeUsingPrefixApproach(list);
    }

    private static void timeUsingPrefixApproach(List<Integer> list) {
        int max= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        int mulValue=list.size();
        int totalDesiredValue= max*mulValue;
        int deficit= totalDesiredValue-sum;
        System.out.println(deficit);

    }

    private static void time(List<Integer> list) {
        int count=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        for(int i=0;i<list.size();i++){
            count=count+max-list.get(i);
        }
        System.out.println(count);
    }

}
