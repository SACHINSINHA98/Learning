package Trees;


import java.util.Stack;

public class InorderUsingStack {

    void inorderUsingStack(Node root){
        Stack<Node>stack= new Stack();
        Node current =root;
        while(current!=null || !stack.isEmpty()){
            if(current!=null){
                stack.push(current);
                current= current.left;
            }
            else{
                Node top= stack.peek();
                System.out.println(top.data);
                current=top.right;
                stack.pop();
            }
        }
    }

    void morrisTraversal(Node root){
        Node current= root;
        while(current!=null){
            if(current.left==null){
                System.out.print(current.data + "->");
                current=current.right;
            }
            else{
                Node temp= current.left;
                while(temp.right!=null && temp.right!=current){
                    temp= temp.right;
                }
                if(temp.right==null){
                    temp.right=current;
                    current=current.left;
                }
                if(temp.right==current){
                    temp.right=null;
                    System.out.print(current.data + "->");
                    current=current.right;
                }
            }
        }
    }
}
