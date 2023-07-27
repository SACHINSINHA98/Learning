package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Provinces {
    static void provinces(List<List<Integer>>arr,int start){
        int[]visited=new int[arr.size()];
        int count=0;
        ArrayList<Integer> dfs= new ArrayList<>();
        for(int i=1;i< arr.size();i++){
            if(visited[i]==0){
                DepthFirstSearch.dfs(arr,i,dfs,visited);
                count++;
            }
        }
        System.out.println(count);
    }

}
