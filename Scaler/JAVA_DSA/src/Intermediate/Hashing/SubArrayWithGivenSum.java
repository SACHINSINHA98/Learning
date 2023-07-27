package Intermediate.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Integer []arr={1, 2, 3, 4, 5};
        List<Integer> list= Arrays.asList(arr);
        int B=5;
        System.out.println(solve((List<Integer>)list,B));
    }

    private static ArrayList<Integer>  solve(List<Integer> A, int B) {
        HashMap<Integer,List<Integer>> map= new HashMap();
        ArrayList<Integer> ans= new ArrayList();
        for(int i=0;i<A.size();i++){
            int sum=0;
            for(int j=i;j<A.size();j++){
                ArrayList<Integer>list= new ArrayList();
                sum= sum+ A.get(j);
                list.add(i);
                list.add(j);
                map.put(sum,list);

                if(map.containsKey(B)){
                    for(int m=map.get(sum).get(0); m<=map.get(sum).get(1);m++){
                        ans.add(A.get(m));
                    }
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans ;
    }
}
