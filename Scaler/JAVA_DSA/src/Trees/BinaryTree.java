package Trees;



class Node  {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        left=null;
        right=null;
    }





//    @Override
//    public int compareTo(Node o) {
//        return o.data;
//
//    }
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
    void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data +" " +"->");
        preorder(root.left);
        preorder(root.right);

    }
    void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data +" " +"->");
    }
    int height(Node root){
        if(root==null){
            return -1;
        }
       int left= height(root.left);
      int right=  height(root.right);
      return 1+Integer.max(left,right);
    }
    int size(Node root){
        if(root==null){
            return 0;
        }
       int leftsize= size(root.left);
       int rightsize= size(root.right);
        return 1+leftsize+rightsize;
    }
    int sumNode(Node root){
        if(root==null){
            return 0;
        }
        int leftSum= sumNode(root.left);
        int rightSum= sumNode(root.right);
        return root.data+leftSum+rightSum;
    }
    boolean search(Node root,int k){
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        boolean left=search(root.left,k);
//        if(left){
//            return true;
//        }
        boolean right=search(root.right,k);
       return left||right;
    }


}

 class BinaryTree {
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left= new Node(15);
        root.right= new Node(20);
        root.left.left= new Node(3);
        root.left.right=new Node(7);
        root.right.left= new Node(16);
        root.right.right= new Node(15);
        /*Utility util = new Utility();
        util.inorder(root);
        System.out.println();
        util.preorder(root);
        System.out.println();
        util.postorder(root);
        System.out.println("");
        System.out.println(util.height(root));
        System.out.println(util.size(root));
        System.out.println(util.sumNode(root));
        System.out.println(util.search(root,16));
        System.out.println(util.search(root,56));
        TreeViews treeViews= new TreeViews();
        treeViews.levelOrderTraversal(root);
        System.out.println("----------------------------------");
        treeViews.levelOrderEachLevelInDiffLineAndSumOfNode(root);
        System.out.println("----------------------------------");
        treeViews.leftView(root);
        System.out.println("----------------------------------");
        treeViews.levelOrderTraversalInReverse(root);
        System.out.println("----------------------------------");
        treeViews.rightView(root);
        System.out.println("----------------------------------");*/
        InorderUsingStack ino= new InorderUsingStack();
        ino.inorderUsingStack(root);
        System.out.println("--------------------");
        ino.morrisTraversal(root);
    }



 }
