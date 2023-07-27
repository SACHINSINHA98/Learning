package HashMap;

import java.util.HashMap;

public class MinDiffBtwDupli {
    public static void main(String[] args) {
        int []arr={1,2,3,2,1,2,1,3,2};
        minDiff(arr);
    }

    private static void minDiff(int[] arr) {
        HashMap<Integer,Integer>map= new HashMap();
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val= i;
               diff= Math.min(val-(map.get(arr[i])),diff);
               map.put(arr[i],val);
            }else{
                map.put(arr[i],i);
            }
        }
        System.out.println(diff);
        System.out.println(map);
    }
}
