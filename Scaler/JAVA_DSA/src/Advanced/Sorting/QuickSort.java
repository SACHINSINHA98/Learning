package Advanced.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        Integer []arr= {1, 4, 10, 2, 1, 5};
        List<Integer> A= Arrays.asList(arr);
        quickSort(A,0,A.size()-1);
        System.out.println(A);
    }
    static void quickSort(List<Integer>A,int start, int end){
            if(start>end){
                return;
            }
            int p= partition(A,start,end);
            quickSort(A,start,p-1);
            quickSort(A,p+1,end);
        }
    static int partition(List<Integer> A, int start, int end){
        int pivot=A.get(start);
        int i=start+1;
        int j=end;
        while(i<=j){
            if(A.get(i)<=pivot){
                i++;
            }else if(A.get(j)>pivot){
                j--;
            }else{
                Collections.swap(A,i,j);
                i++;
                j--;
            }
        }
        Collections.swap(A,start,j);
        return j;
    }

}
