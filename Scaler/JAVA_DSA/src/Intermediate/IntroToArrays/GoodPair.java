package Intermediate.IntroToArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodPair {
    public static void main(String[] args) {
        Integer []arr={1,2,3,4};
        List<Integer> list= Arrays.asList(arr);
        int k=7;
        System.out.println(goodpair(list,k));

        }

    private static boolean goodpair(List<Integer> list,int k) {
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i)+list.get(j)==k && i!=j){
                    return true;
                }
            }
    }
        return false;
}
}
