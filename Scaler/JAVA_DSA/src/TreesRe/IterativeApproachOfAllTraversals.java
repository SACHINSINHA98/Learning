package TreesRe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IterativeApproachOfAllTraversals {
    static void levelOrderTraversal(Node root){
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        ArrayList<ArrayList<Integer>>traversal= new ArrayList<>();
        while(!queue.isEmpty()){
            int currentSize=queue.size();
            ArrayList<Integer>list= new ArrayList<>();
            for(int i=0;i<currentSize;i++){
                Node peek=queue.peek();
                list.add(peek.data);
                queue.poll();
                if(peek.left!=null){
                    queue.add(peek.left);
                }
                if(peek.right!=null){
                    queue.add(peek.right);
                }
            }
            traversal.add(list);

        }
        System.out.println(traversal);
    }

    static void inOrder(Node root){
        Stack<Node>stack= new Stack<>();
        Node current = root;
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }else{
                Node top=stack.peek();
                System.out.print(top.data + " ");
                current=top.right;
                stack.pop();
            }
        }
    }
    static void preOrder(Node root){
        Node current =root;
        Stack<Node>stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node top=stack.pop();
            System.out.print(top.data + " ");
            if(top.right!=null){
                stack.push(top.right);
            }
            if(top.left!=null){
                stack.push(top.left);
            }
        }
    }
}
