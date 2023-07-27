package Advanced.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchMatrix {
    public static void main(String[] args) {
        Integer[] arr ={1};
        Integer[] arr1 ={11};
        Integer[] arr2 ={49};
        Integer[] arr3 ={74};
        Integer[] arr4 ={77};
        Integer[] arr5 ={78};
        Integer[] arr6 ={93};
        Integer[] arr7 ={94};
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(arr1);
        List<Integer> list3 = Arrays.asList(arr2);
        List<Integer> list4 = Arrays.asList(arr3);
        List<Integer> list5 = Arrays.asList(arr4);
        List<Integer> list6 = Arrays.asList(arr5);
        List<Integer> list7 = Arrays.asList(arr6);
        List<Integer> list8 = Arrays.asList(arr7);
        List<List<Integer>> A = new ArrayList<>();
        A.add(list1);
        A.add(list2);
        A.add(list3);
        A.add(list4);
        A.add(list5);
        A.add(list6);
        A.add(list7);
        A.add(list8);
        System.out.println(A);
        System.out.println(search(A,49));
        
    }

    private static int search(List<List<Integer>> A, int B) {
        int start=0;
        int end=(A.size()*A.get(0).size())-1;
        while(start<=end){
            int mid=(start+((end-start)/2));
            int row=(mid/A.get(0).size());
            int col=(mid % A.get(0).size());
            if((A.get(row).get(col)).equals(B)){
                return 1;
            }else if(B>A.get(row).get(col)){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return 0;
    }

}
