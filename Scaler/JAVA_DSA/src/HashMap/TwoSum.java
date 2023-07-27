package HashMap;

import java.util.Collection;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {7,8,2,3,4};
        int sum=14;
        twoSum(arr,sum);
    }

    private static void twoSum(int[] arr, int sum) {
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],(map.get(arr[i])+1));
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            int x= sum-arr[i];
            if((map.get(arr[i]))>1 && x==arr[i]){
                System.out.println("present");
                return;
            }else if(x!=arr[i] && map.containsKey(arr[i])){
                System.out.println("present");
                return;
            }
        }

        System.out.println("Not Present");
    }
}
