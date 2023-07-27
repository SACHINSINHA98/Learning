package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    static void dfs(List<List<Integer>> arr, int node,ArrayList<Integer> dfs, int[]visited){
        visited[node]=1;
        dfs.add(node);
        for(int i=0;i<arr.get(node).size();i++){
            if(visited[arr.get(node).get(i)]==0){
                dfs(arr,arr.get(node).get(i),dfs,visited);
            }
        }
    }
    static void iterativeDfs(List<List<Integer>> arr,int start){
        int[]visited=new int[arr.size()];
        Stack<Integer>stack= new Stack<>();
        stack.push(start);
        while(!stack.isEmpty()){
            int top=stack.pop();
            if(visited[top]==0){
                System.out.println(top);
            }
            visited[top]=1;
            for(int i=0;i<arr.get(top).size();i++){
                if(visited[arr.get(top).get(i)]==0){
                    stack.push(arr.get(top).get(i));
                }
            }
        }
    }
}
