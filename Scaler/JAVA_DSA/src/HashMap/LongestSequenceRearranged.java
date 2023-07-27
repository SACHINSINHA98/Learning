package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSequenceRearranged {
    public static void main(String[] args) {
        //int []arr={9,-1,-3,7,0,6,-2,12,13,14,15,1,6,8,16,5,10};
        int []arr={1,2,3,4,5,7};
        maxLength(arr);
    }

    private static void maxLength(int[] arr) {
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int max=1;
        for(int i=0;i< arr.length;i++){

            if(set.contains(arr[i]-1)){
               continue;
            }else {
                int length=0;
                int val=arr[i];
                while(set.contains(val)){
                    length++;
                    val++;
                }
                max=Math.max(length,max);
            }

        }
        System.out.println(max);
    }
}
