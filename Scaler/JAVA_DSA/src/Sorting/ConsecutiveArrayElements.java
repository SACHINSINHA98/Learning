package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConsecutiveArrayElements {
    public static void main(String[] args) {
        Integer []arr= {3, 2, 1, 4, 5};
        List<Integer> list=Arrays.asList(arr);
        checkConsecutive(list);
    }

    private static void checkConsecutive(List<Integer>list) {
        Collections.sort(list);
        int i=1;
        int count=0;
        while( i<list.size()&&(list.get(i)-list.get(i-1))==1 ){
            count++;
            i++;
        }
        if(count==list.size()-1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
