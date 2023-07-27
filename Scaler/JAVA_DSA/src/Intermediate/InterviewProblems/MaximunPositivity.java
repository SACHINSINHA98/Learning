package Intermediate.InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximunPositivity {
    public static void main(String[] args) {
        Integer []arr={5, 6, -1, 7, 8};
        List<Integer> list= Arrays.asList(arr);

        maxPos(list);
    }

    private static void maxPos(List<Integer> A) {
        ArrayList<Integer> list= new ArrayList();
        ArrayList<Integer> ans= new ArrayList();
        int start=0;
        int end=0;

        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                list.add(0);
            }
        }
        if(list.size()==0){
            System.out.println(A);;
        }else if(list.size()==1){
            for(int i=0;i<1;i++){
                ans.add(A.get(i));
            }
            System.out.println(ans);
        }else {
            int maxDiff=0;

            for(int k=1;k<list.size();k++){
                int diff = list.get(k)-list.get(k-1);
                if(diff>maxDiff){
                    maxDiff=diff;
                    start=list.get(k-1);
                    end=list.get(k);
                }
            }

        }
        if(start==0){
        for(int i=start;i<end;i++){
            ans.add(A.get(i));
        }}else{
            for(int i=start+1;i<end;i++){
                ans.add(A.get(i));
        }
        }
        System.out.println(ans);
    }
}
