package Advanced.BinarySearch;

import java.util.Arrays;
import java.util.List;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Integer []arr= {13,13,21,21,27,50,50,102,102,108,108,110,110,117,117,120,120,123,123,124,124,132,132,164,164,166,166,190,190,200,200,212,212,217,217,225,225,238,238,261,261,276,276,347,347,348,348,386,386,394,394,405,405,426,426,435,435,474,474,493,493};
        List<Integer> A= Arrays.asList(arr);
        System.out.println(element(A));
    }

    private static int element(List<Integer> A) {
        int start=1;
        int end=A.size()-2;
        if(A.get(0)!=A.get(1)){
            return A.get(0);
        }
        if(!(A.get(A.size()-1).equals(A.get(A.size()-2)))){
           return A.get(A.size()-1);
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(!(A.get(mid)).equals(A.get(mid-1)) && !(A.get(mid)).equals(A.get(mid+1))){
                return A.get(mid);
            }
            if((A.get(mid)).equals(A.get(mid-1))){
                mid=mid-1;
            }
            if(mid % 2==0){
                start=mid+2;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
