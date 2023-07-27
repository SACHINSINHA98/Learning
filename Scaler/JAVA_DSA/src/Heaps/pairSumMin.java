package Heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Pair1{
    int i;
    int j;
    int sum;

    public Pair1(int i, int j, int sum) {
        this.i = i;
        this.j = j;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Pair1{" +
                "i=" + i +
                ", j=" + j +
                ", sum=" + sum +
                '}';
    }
}
 class pairSumMin {
    public static void main(String[] args) {
        Integer[] arr = {7,14,5,23,5,0,2};
        int a=10;
        List<Integer> list = Arrays.asList(arr);
        sum(list);
    }

    private static void sum(List<Integer> list) {
        Comparator<Pair1>comp = (Pair1 a, Pair1 b)->{
            return a.sum-b.sum;
        };
        PriorityQueue<Pair1> pq = new PriorityQueue<>(comp);
        for(int i=0;i<list.size()-1;i++){
            int sum =list.get(i)+list.get(i+1);
            Pair1 pair = new Pair1(i,i+1,sum);
            pq.add(pair);
        }
        System.out.println(pq.poll().toString());
    }
}
