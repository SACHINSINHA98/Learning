package Advanced.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergerInsame {
    public static void main(String[] args) {
        Integer []arr= {8,1,3,6,11,2,4,9,7,6};
        List<Integer> A= Arrays.asList(arr);
        merge(A,2,5,7);
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
        System.out.println(A);
    }
}
