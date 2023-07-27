package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class printAllSubsequences {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,1);
        subPrint(0, new ArrayList<Integer>(),list);
        sum(0, new ArrayList<Integer>(),list,0);
    }

    private static void sum(int i, ArrayList<Integer> list1, List<Integer> list,int sum) {
        int k=2;
        if(i>=list.size()){
            if(sum==k){
                System.out.println(list1);
            }
            return;
        }

        list1.add(list.get(i));
        sum(i+1,list1,list,sum+list.get(i));
        list1.remove(list.get(i));
        sum(i+1,list1,list,sum);

    }

    private static void subPrint(int i, ArrayList<Integer>list1,List<Integer>list) {
        if(i>=list.size()){
            System.out.println(list1);
            return;
        }

        list1.add(list.get(i));
        subPrint(i+1,list1,list);
        list1.remove(list.get(i));
        subPrint(i+1,list1,list);


    }
}
