package TreesRe;

import java.util.ArrayList;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
class DryRun{
    public static void main(String[] args) {
        Node root= new Node(5);
        root.left=new Node(3);
        root.right= new Node(6);
        root.left.left=new Node(2);
        root.left.right= new Node(4);
        root.right.right= new Node(7);

        IterativeApproachOfAllTraversals.inOrder(root);
        System.out.println();
        System.out.println("---------");
        IterativeApproachOfAllTraversals.preOrder(root);
        System.out.println();
        System.out.println("---------");
        System.out.println(Utility.height(root));
        System.out.println();
        System.out.println("---------");
        System.out.println(Utility.balanced(root));
        System.out.println();
        System.out.println("---------");
        System.out.println(Utility.balanced2(root));
        System.out.println();
        System.out.println("---------");
        IterativeApproachOfAllTraversals.levelOrderTraversal(root);
        System.out.println();
        System.out.println("---------");
        System.out.println(VerticalLevelOrderTraversal.verticalOrderTraversal(root));
        System.out.println();
        System.out.println("---------");
        ArrayList<Integer>arr= new ArrayList<>();
        Utility.path(root,5,arr);
        System.out.println(arr);
        System.out.println();
        System.out.println("---------");
        Integer []a= new Integer[1];
        a[0]=Integer.MIN_VALUE;
        Utility.maxPathSum(root,a);
        System.out.println(a[0]);
    }
}

