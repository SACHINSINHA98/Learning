package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllPermutations {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3);
        ArrayList<Boolean> status=new ArrayList<Boolean>(list.size());
        ArrayList<Integer> ans=new ArrayList<>();
        List<List<Integer>>finalAns=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            status.add(false);
        }
        permute(list,ans,status,finalAns);
        System.out.println(finalAns);
    }

    private static  void permute(List<Integer> list, ArrayList<Integer> ans, ArrayList<Boolean> status, List<List<Integer>>finalAns) {
        if(list.size()==ans.size()){
            finalAns.add(new ArrayList<>(ans));
            return;
        }
        for(int index=0; index<list.size();index++){
            if(!status.get(index)){
                status.set(index,true);
                ans.add(list.get(index));
                permute(list,ans,status,finalAns);
                ans.remove(ans.size()-1);
                status.set(index,false);
            }
        }
    }


}
