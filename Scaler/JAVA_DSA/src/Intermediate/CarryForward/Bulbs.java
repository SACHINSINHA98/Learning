package Intermediate.CarryForward;

import java.util.Arrays;
import java.util.List;

public class Bulbs {
    public static void main(String[] args) {
        Integer []arr={1, 1, 1, 1};
        List<Integer> list= Arrays.asList(arr);
        bulbs(list);
    }

    private static void bulbs(List<Integer> list) {
        int flag=0;
        int count=0;
        for(int i=0;i<list.size();i++){
            if(flag==list.get(i)){
                count++;
                if(flag==0){
                    flag=1;
                }else{
                    flag=0;
                }

            }
        }
        System.out.println(count);
    }
}
