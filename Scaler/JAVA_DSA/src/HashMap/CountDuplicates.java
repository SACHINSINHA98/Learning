package HashMap;

import java.util.*;

public class CountDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,3,4,1,2,1,4,6,1};
        findDuplicates(arr);
    }

    private static <Hashset> void findDuplicates(int[] arr) {
        HashMap<Integer,Integer>map= new HashMap();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){

                ans= ans+ ((map.get(arr[i])));

                map.put(arr[i],(map.get(arr[i]))+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        System.out.println(ans);
        int count=0;

        //Set<Map.Entry<Integer,Integer> >entry= map.entrySet();

        Collection<Integer> list= map.values();
        for(Integer i:list){
            Integer val= i;
            count=count + ((val*(val-1))/2);
        }
//        for(Map.Entry i : entry){
//            Integer val=(Integer) i.getValue();
//            count=count + ((val*(val-1))/2);
//        }
        System.out.println(count);
    }



}
