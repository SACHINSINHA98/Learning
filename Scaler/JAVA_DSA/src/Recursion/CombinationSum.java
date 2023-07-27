package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,6,7);
        Integer target=7;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        combineSum(0,list,target,new ArrayList<Integer>(),ans);
        System.out.println(ans);
    }

    private static void combineSum(int i, List<Integer> list, Integer target, ArrayList<Integer> list1, ArrayList<ArrayList<Integer>> ans) {
        if(i==list.size()){
            if(target==0){
                ans.add(new ArrayList<>(list1));
            }
            return;
        }
        if(list.get(i)<=target){
            list1.add(list.get(i));
            combineSum(i,list,target-list.get(i),list1,ans);
            list1.remove(list1.size()-1);
        }
        combineSum(i+1,list,target,list1,ans);
    }
}
