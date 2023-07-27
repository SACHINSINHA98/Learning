package TreesRe;

import java.util.*;

class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node=node;
        this.level=level;
    }
}
public class VerticalLevelOrderTraversal {
    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(Node A) {
            Queue<Pair> queue= new LinkedList<>();
            Pair pair = new Pair(A,0);
            queue.add(pair);
            TreeMap<Integer,ArrayList<Integer>> map = new TreeMap();
            while(!queue.isEmpty()){
                int size= queue.size();
                for(int i=0;i<size;i++){
                    Pair top =queue.peek();
                    if(map.containsKey(top.level)){
                        ArrayList<Integer>list= map.get(top.level);
                        list.add(top.node.data);
                        map.put(top.level,list);
                    }else{
                        ArrayList<Integer>list= new ArrayList<>();
                        list.add(top.node.data);
                        map.put(top.level,list);
                    }
                    queue.poll();
                    if(top.node.left!=null){
                        queue.add(new Pair(top.node.left,top.level-1));
                    }
                    if(top.node.right!=null){
                        queue.add(new Pair(top.node.right,top.level+1));
                    }
                }
            }
            ArrayList<ArrayList<Integer>>ans= new ArrayList();
            Set<Map.Entry<Integer,ArrayList<Integer>>> set=map.entrySet();
            Iterator<Map.Entry<Integer,ArrayList<Integer>>> it=set.iterator();
            while(it.hasNext()){
                Map.Entry s=it.next();
                ArrayList<Integer>arr= (ArrayList<Integer>) s.getValue();
                ans.add(arr);
            }
            return ans;
        }


}
