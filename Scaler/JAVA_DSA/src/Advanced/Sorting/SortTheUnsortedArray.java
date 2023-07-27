package Advanced.Sorting;

import java.util.Arrays;
import java.util.List;

public class SortTheUnsortedArray {
    public static void main(String[] args) {
        Integer []arr= {-355071087,-679308132,398052175,755454983,814022370,889267058};
        List<Integer> A= Arrays.asList(arr);
        min(A);
    }

    private static void min(List<Integer> A) {
        int min= Integer.MAX_VALUE;
        for(int i=1;i<A.size();i++){
            if(A.get(i)<A.get(i-1)){
                min=Integer.min(min,A.get(i));
            }
        }
        int max=Integer.MIN_VALUE;
        for(int j= A.size()-1 ; j>0;j--){
            if(A.get(j)<A.get(j-1)){
                max= Integer.max(max,A.get(j-1));
            }
        }
        int minIndex=0;
        int maxIndex=0;
        for(int k=0; k<A.size(); k++){
            if(A.get(k) > min){
                minIndex=k;
                break;
            }

        }
        for(int k=0; k<A.size(); k++){
            if(A.get(A.size()-k-1) < max){
                maxIndex=A.size()-k-1;
                break;
            }

        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(maxIndex-minIndex+1);

    }
}
