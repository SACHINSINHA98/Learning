package TreesRev;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
class Utility{
    void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data +" " +"->");
        inorder(root.right);
    }
    void levelOrder(Node root){
        Queue<Node> q= new LinkedList<Node>() ;
        q.add(root);
        while(q.size()>0){
            Node front= q.peek();
            System.out.print(front.data + "->");
            q.poll();
            if(front.left !=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
        }
    }
    void levelOrderNewLine(Node root){
        Queue<Node> q= new LinkedList<Node>() ;
        q.add(root);
        q.add(null);
        while(q.size()>0){
            Node front= q.peek();
            if(front!=null){
            System.out.print(front.data + " ->");
            }
            q.poll();
            if(front==null){
                System.out.println(" ");
                if(q.size()>0){
                    q.add(null);
                }
                continue;
            }
            if(front.left !=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
        }
    }
    void leftView(Node root){
        Queue<Node> q= new LinkedList<Node>() ;
        System.out.println(root.data);
        q.add(root);
        q.add(null);
        while(q.size()>0){
            Node front= q.peek();
            q.poll();
            if(front==null){
                System.out.println(" ");
                if(!q.isEmpty()){
                System.out.println(q.peek().data);
                }
                if(q.size()>0){
                    q.add(null);
                }
                continue;
            }
            if(front.left !=null){
                q.add(front.left);
            }
            if(front.right!=null){
                q.add(front.right);
            }
        }
    }
}

class TreeStruct{
    public static void main(String[] args) {
        Node root= new Node(3);
        root.left = new Node(9);
        root.right= new Node(8);
        root.left.right= new Node(6);
        root.right.left= new Node(2);
        root.right.right= new Node(-7);
        root.right.left.left= new Node(-4);
        root.right.left.right= new Node(8);
        root.right.left.right.left= new Node(10);
        Utility util= new Utility();
        util.inorder(root);
        System.out.println("-----------");
        util.levelOrder(root);
        System.out.println("-----------");
        util.levelOrderNewLine(root);
        System.out.println("-----------");
        util.leftView(root);
    }
}
