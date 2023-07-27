package Heaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MishaAndCandies {
    public static void main(String[] args) {
        Integer[] arr = {440,443,463};
        int b=810;
        List<Integer> list = Arrays.asList(arr);
        candies(list,b);
    }

    private static void candies(List<Integer> list, int b) {
        PriorityQueue<Integer> pq= new PriorityQueue();
        for (int i = 0; i < list.size(); i++) {
            pq.add(list.get(i));
        }

        int totalEaten=0;
        while(!pq.isEmpty() && pq.peek()<=b){

            if(pq.peek()<=b){
                int candies=pq.poll();
                int candiesEaten=candies/2;
                totalEaten=totalEaten+candiesEaten;
                int remaining=candies-candiesEaten;
                if(!pq.isEmpty() ){
                    int replace=pq.poll();
                    int addedCandies= remaining+replace;
                    pq.add(addedCandies);
                }
            }

        }
        System.out.println(totalEaten);
        }

    }

