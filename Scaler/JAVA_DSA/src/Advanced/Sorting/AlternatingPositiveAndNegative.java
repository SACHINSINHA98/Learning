package Advanced.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.swap;

public class AlternatingPositiveAndNegative {
    public static void main(String[] args) {
        Integer []arr= {-1, -2, -3, 4, 5};
        List<Integer> A= Arrays.asList(arr);
        newArr(A);
    }

    private static void newArr(List<Integer> A) {
        int i=0;
        while(i<A.size()){
            if(i%2==0 && A.get(i)>=0){
                for(int j=i;j<A.size();j++){
                    if(A.get(j)<0){
                        int k=j;
                        rotate(A,i,k);
                        break;
                    }
                }
            }else{
                if(i%2==1 && A.get(i)<0){
                    for(int j=i;j<A.size();j++){
                        if(A.get(j)>0){
                            int k=j;
                            rotate(A,i,k);
                            break;
                        }
                    }
                }
            }
            i++;
        }
        System.out.println(A);
    }


    static void rotate(List<Integer>A, int start, int end){
        reverse(A,start,end);
        reverse(A,start+1,end);
    }
    static void reverse(List<Integer>A,int start, int end){
        while(start<end){
            Collections.swap(A,start,end);
            start++;
            end--;
        }
    }
}
