package Intermediate.SubsequneceAndSubsets;

import java.util.*;

public class LittlePonyAndSubsequence {
    public static void main(String[] args) {
        String A= "dvdgajrqal";
        solve(A);
    }

    private static void solve(String A) {
        ArrayList<StringBuilder> minSeq= new ArrayList();
        for(int i=0;i<(1<<A.length());i++){
            StringBuilder ans= new StringBuilder();
            for(int j=0;j<A.length();j++){
                if(checkBit(i,j)){
                    ans.append(A.charAt(j));
                }
            }
            if(ans.length()>=2){
                minSeq.add(ans);
            }
        }
        Comparator<StringBuilder> c= (a, b)->{
            for(int i=0;i<a.length() && i<b.length();i++){
                if(a.charAt(i)<b.charAt(i)){
                    return -1;
                }else if(a.charAt(i)>b.charAt(i)){
                    return 1;
                }
            }
            if(a.length()>b.length()){
                return 1;
            }
            return -1;
        };
        Collections.sort(minSeq,c);
        System.out.println(minSeq.get(0).toString());

    }
    public static boolean checkBit(int i,int j){
        if(((i>>j)&1)==1){
            return true;
        }
        return false;
    }

}
