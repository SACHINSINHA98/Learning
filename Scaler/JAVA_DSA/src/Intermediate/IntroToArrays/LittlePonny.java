package Intermediate.IntroToArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class LittlePonny {
    public static void main(String[] args) {
       
            Integer[] arr = {2,4,3,1,5};
            int b=2;
            List<Integer> list = Arrays.asList(arr);
            maxCount(list,b);
        
    }

    private static void maxCount(List<Integer> list, int b) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            pq.add(list.get(i));
        }
        int count=0;
        while(!pq.isEmpty() && pq.contains(b)){
            if(pq.peek()==b){

                break;
            }else{
                pq.poll();
                count++;
            }
        }
        System.out.println(count);
    }
}
