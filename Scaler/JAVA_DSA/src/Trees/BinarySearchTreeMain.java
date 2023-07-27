package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        Node root= new Node(20);
        root.left= new Node(15);
        root.right= new Node(30);
        root.left.left= new Node(12);
        root.left.right= new Node(16);
        root.right.left= new Node(28);
        root.right.right= new Node(34);
        root.left.left.left= new Node(10);
        root.left.left.right= new Node(14);
        root.right.right.left= new Node(32);
        root.right.right.right= new Node(37);
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.searchInBinaryTree(root,23));
        ArrayList<Integer> list=bst.traverseBstInorderTraversal(root);
        System.out.println(list);
       if( list.stream().sorted().collect(Collectors.toList()).equals(list)){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
        int min= Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        System.out.println(bst.isBST(root,min,max));
        bst.insertInBinaryTree(root,23);




    }
}
