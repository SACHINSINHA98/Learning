package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Graphs.BreadthFirstSearch.bfs;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(0));
        arr.add(Arrays.asList(2,3));
        arr.add(Arrays.asList(1,5));
        arr.add(Arrays.asList(1,4,6));
        arr.add(Arrays.asList( 3));
        arr.add(Arrays.asList(2,7));
        arr.add(Arrays.asList( 3,7));
        arr.add(Arrays.asList(7,6));
       /* bfs(arr);
        ArrayList<Integer>dfs= new ArrayList<>();
        int start=1;
        int []visited = new int[arr.size()+1];
        DepthFirstSearch.dfs(arr,start,dfs,visited);
        System.out.print(dfs +" ");
        //DepthFirstSearch.iterativeDfs(arr,start);
        Provinces.provinces(arr,start);*/
        int v=7;
        int []visited1 = new int[v+1];
        //System.out.println(PathInAUndirectedGraph.isCycle(arr,visited1));
        System.out.println(PathInAUndirectedGraph.isCycleDfs(arr,visited1));
    }
}
