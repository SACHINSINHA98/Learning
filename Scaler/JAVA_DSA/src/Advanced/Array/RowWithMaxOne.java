package Advanced.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowWithMaxOne {
    public static void main(String[] args) {
        Integer[] arr ={0,0,0,0};
        Integer[] arr1 ={0,0,0,1};
        Integer[] arr2 ={0,0,1,1};
        Integer[] arr3 ={0,1,1,1};
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(arr1);
        List<Integer> list3 = Arrays.asList(arr2);
        List<Integer> list4 = Arrays.asList(arr3);
        List<List<Integer>> A = new ArrayList<>();
        A.add(list1);
        A.add(list2);
        A.add(list3);
        A.add(list4);
        max(A);
    }

    private static void max(List<List<Integer>> A) {
        int row=0;
        int col=(A.get(row).size())-1;
        int count=0;
        int maxcount=0;
        int ans=0;
        while(row<A.size() && col>=0){
            if(A.get(row).get(col)==1){
                col--;
                count++;
                if(count >= maxcount){
                    maxcount=count;
                    ans=row;
                }
            }else if(A.get(row).get(col)==0){
                row++;
            }
        }

        System.out.println(ans);
    }
}
