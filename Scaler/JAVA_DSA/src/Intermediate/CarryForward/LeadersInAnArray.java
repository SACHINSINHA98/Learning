package Intermediate.CarryForward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInAnArray {
    public static void main(String[] args) {
        Integer []arr={16, 17, 4, 3, 5, 2};
        List<Integer> list= Arrays.asList(arr);
        leader(list);
    }

    private static void leader(List<Integer> list) {
        List<Integer> anslist=new ArrayList<>();
        anslist.add(list.get(list.size()-1));
        int max=list.get(list.size()-1);
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i)>max){
                max=list.get(i);
                anslist.add(max);
            }
        }
        System.out.println(anslist);
    }

}
