package Advanced.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        Integer []arr= {1, 4, 10, 2, 1, 5};
        List<Integer> A= Arrays.asList(arr);
        solve(A);
    }
     public static List<Integer> solve(List<Integer> A) {
        mergeSort(A,0,A.size()-1);
         System.out.println(A);
         return A;
    }
    static void mergeSort(List<Integer> A,int l,int r){
        if(l==r){
            return;
        }
        int mid=((l+r)/2);
        mergeSort(A,l,mid);
        mergeSort(A,mid+1,r);
        merge(A,l,mid+1,r);
    }
    static void merge(List<Integer> A,int i, int j , int k){
        ArrayList<Integer> list= new ArrayList();
        int a=i;
        int b=j;
        while(a<j && b<=k){
            if(A.get(a)>A.get(b)){
                list.add(A.get(b));
                b++;
            }
            else{
                list.add(A.get(a));
                a++;
            }
        }
        if(a<j){
            for(int m=a;m<j;m++){
                list.add(A.get(m));
            }
        }
        if(b<=k){
            for(int m=b;m<=k;m++){
                list.add(A.get(m));
            }
        }
        for(int z=0;z<(k-i+1);z++){
            A.set((z+i), list.get(z));
        }
    }
}
