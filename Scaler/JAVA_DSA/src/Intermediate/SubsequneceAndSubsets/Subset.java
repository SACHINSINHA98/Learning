package Intermediate.SubsequneceAndSubsets;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        Integer []arr={472,663,964,722,485,852,635,4,368,676,319,412};
        List<Integer> list= Arrays.asList(arr);
        solve((ArrayList<Integer>)list);
    }

    private static void solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList();
        Collections.sort(A);
        for(int i=0;i<(1<<A.size());i++){
            ArrayList<Integer>list=new ArrayList();
            for(int j=0;j<A.size();j++){
                if(checkBit(i,j)){
                    list.add(A.get(j));
                }
            }
            ans.add(list);
        }

        Comparator<ArrayList<Integer>>comparator = (a1, a2)->{
            for(int i=0;i<a1.size() && i<a2.size();i++){
                if(a1.get(i)>a2.get(i)){
                    return 1;
                }
                else if(a1.get(i)<a2.get(i)){
                    return -1;
                }}
                if (a1.size()>a2.size()){
                    return 1;
                }
                return -1;
            };
        Collections.sort(ans,comparator);

        System.out.println(ans);
    }


    public static boolean checkBit(int i,int j){
        if(((i>>j)&1)==1){
            return true;
        }
        return false;
    }

}
