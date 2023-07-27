package Advanced.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallestElement {
    public static void main(String[] args) {
        Integer []arr= {1,2,3,4,5};
        List<Integer> A= Arrays.asList(arr);
        Collections.sort(A);
        int b=9;
        min(A,b);
    }

    private static void min(List<Integer> A,int B) {
        ArrayList<Integer>ans= new ArrayList();
        for(int i=0;i<A.size();i++){
            ans.add(A.get(i));
        }
        int j=0;
        while(j<B){
            int minIndex=findMin(ans,j,ans.size());
            swap(ans,j,minIndex);
            j++;
        }
        System.out.println(ans.get(B-1));
    }
    static int findMin(ArrayList<Integer> A,int i,int j){
        int minIndex=i;
        int min=A.get(i);
        for(int k=i;k<j;k++){
            if(A.get(k)<min){
                min=A.get(k);
                minIndex=k;
            }
        }
        return minIndex;
    }
    static void swap(ArrayList<Integer> A, int i, int j){
        int temp=A.get(i);
        A.set(i,A.get(j));
        A.set(j,temp);

    }
}
