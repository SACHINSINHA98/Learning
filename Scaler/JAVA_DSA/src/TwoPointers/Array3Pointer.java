package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array3Pointer {
    public static void main(String[] args) {
        Integer []arr1= {1, 4, 10};
        Integer []arr2= {2, 15, 20};
        Integer []arr3= {10, 12};
        List<Integer> list1= Arrays.asList(arr1);
        List<Integer> list2= Arrays.asList(arr2);
        List<Integer> list3= Arrays.asList(arr3);
        System.out.println(minimize(list1,list2,list3));
    }

        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        static  int minimize(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
        int p1=0;
        int p2=0;
        int p3=0;
        int currentMin=Integer.MAX_VALUE;
           while(p1<A.size()&&p2<B.size()&&p3<C.size()){
               int max=Math.max(Math.max(Math.abs(A.get(p1)-B.get(p2)),Math.abs(B.get(p2)-C.get(p3))),Math.abs(C.get(p3)-A.get(p1)));
               currentMin=Math.min(currentMin,max);
                if(max==C.get(p3)){
                    p1++;
                    p2++;
                }else if(max==B.get(p2)){
                    p1++;
                    p3++;
                }else{
                    p2++;
                    p3++;
                }
           }
            return currentMin;
        }
}

