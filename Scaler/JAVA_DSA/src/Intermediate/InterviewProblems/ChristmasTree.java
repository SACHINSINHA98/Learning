package Intermediate.InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChristmasTree {
    public static void main(String[] args) {
        Integer []arr={1, 6, 4, 2, 6, 9};
        List<Integer> list= Arrays.asList(arr);
        Integer []arr2={2, 5, 7, 3, 2, 7};
        List<Integer> list2= Arrays.asList(arr2);
        minCost(list,list2);
    }

    private static void minCost(List<Integer> list, List<Integer> list2) {

    ArrayList<Integer>ans = new ArrayList<>();

        int cost=0;
        int minCost=Integer.MAX_VALUE;
        for(int i=1;i<list.size()-1;i++){
            int leftMin=Integer.MAX_VALUE;
            int rightMin=Integer.MAX_VALUE;
            int leftsum =0;
            int lefttempSum=0;
            int leftprevSum=0;
            for(int j=i-1;j>=0;j--){
                if(list.get(j)<list.get(i)){
                     leftprevSum=lefttempSum ;
                     lefttempSum=lefttempSum+list2.get(j);
                     leftsum=lefttempSum-leftprevSum;
                     if(leftsum<leftMin){
                         leftMin=leftsum;
                     }
                }
            }
            int rightsum =0;
            int righttempSum=0;
            int rightprevSum=0;
            for(int k=i+1;k<list.size();k++){
                if(list.get(k)>list.get(i)){
                    rightprevSum=righttempSum ;
                    righttempSum=righttempSum+list2.get(k);
                    rightsum=righttempSum-rightprevSum;
                    if(rightsum<rightMin){
                        rightMin=rightsum;
                    }
                }
            }
            if(rightMin != Integer.MAX_VALUE && leftMin != Integer.MAX_VALUE){
                cost= leftMin+ rightMin + list2.get(i);
                if(cost<minCost){
                    minCost=cost;
                }
            }
            ans.add(list.get(list.get(i)));
        }


        if(minCost==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        System.out.println(minCost);
    }

}
