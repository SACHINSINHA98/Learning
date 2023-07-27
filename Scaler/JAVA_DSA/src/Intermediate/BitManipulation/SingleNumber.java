package Intermediate.BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        Integer []arr={1780,170,1157,1922,1032,1922,866,681,320,2115,1989,1684,1358,2239,681,1501,1989,2239,1780,2416,2115,2416,1501,320,483,170,1157,1032,1684,483};
        List<Integer> list= Arrays.asList(arr);
        solve(list);
    }

    private static void solve(List<Integer> A) {
        ArrayList<Integer> ans= new ArrayList();
        long xor=0;
        for(int i=0;i<A.size();i++){
            xor=xor^A.get(i);
        }
        for(int i=0;i<A.size();i++){
            long ans1= (xor^A.get(i));
            for(int j=0;j<A.size();j++){
                if(A.get(j)==ans1){
                    ans.add(A.get(i));
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans);

    }
}
