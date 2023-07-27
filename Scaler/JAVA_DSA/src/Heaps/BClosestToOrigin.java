package Heaps;

import java.util.*;

class Pair{
   int x;
   int y;

    public Pair(int coordinateX, int coordinateY) {
        this.x = coordinateX;
        this.y = coordinateY;
    }
}
public class BClosestToOrigin {
    public static void main(String[] args) {
        ArrayList<List<Integer>> list = new ArrayList();
        int c = 1;
        Integer[] arr1 = {1,2};
        Integer[] arr2 = {3,4};
        List<Integer> li1 = Arrays.asList(arr1);
        List<Integer> li2 = Arrays.asList(arr2);
        list.add(li1);
        list.add(li2);
        closest(list,c);
    }

    private static void closest(ArrayList<List<Integer>> list,int c) {
        PriorityQueue<Pair>pq= new PriorityQueue<>((Pair a, Pair b)->{
            int dist1= (a.x * a.x)+(a.y * a.y);
            int dist2= (b.x * b.x)+(b.y * b.y);
            return Integer.compare(dist1,dist2);
        });

        for(int i=0; i<list.size(); i++){
            List<Integer> getPair = list.get(i);
            Pair temp = new Pair(getPair.get(0), getPair.get(1));
            pq.add(temp);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        int k=0;
        while(k < c){
            Pair ansPair = pq.remove();
            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(ansPair.x);
            a.add(ansPair.y);
            ans.add(a);
            k++;
        }
        System.out.println(ans);
    }
}
