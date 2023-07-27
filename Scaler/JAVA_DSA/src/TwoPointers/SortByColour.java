package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

//Dutch National Flag Algo
public class SortByColour {
    public static void main(String[] args) {
        Integer []arr={0,1,2,0,1,2};
        List<Integer> list= Arrays.asList(arr);
         sort(list);
    }

    private static void sort(List<Integer> list) {
        int low=0;
        int mid=0;
        int high=list.size()-1;

        while(mid<=high){
            if(list.get(mid)==0){
                swap(list,low,mid);
                low++;
                mid++;
            }else if(list.get(mid)==2){
                swap(list,mid,high);
                high--;

            }else{
                mid++;
            }
        }
        System.out.println(list);

    }
}
