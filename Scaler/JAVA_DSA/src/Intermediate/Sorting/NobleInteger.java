package Intermediate.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NobleInteger {
    public static void main(String[] args) {
        Integer []arr={3, 2, 1, 3,};
        List<Integer> list= Arrays.asList(arr);

        System.out.println(solve(list));
    }

    private static int solve(List<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
            int count=0;
            if(A.get(0)==0){
                count=1;
            }else{
                count=0;
            }
            for(int i=1;i<A.size();i++){
                if(A.get(i)==i && A.get(i)!=A.get(i-1)){
                    count++;
                }
            }
            if(count >0){
                return count;
            }
        return -1;

    }
}

