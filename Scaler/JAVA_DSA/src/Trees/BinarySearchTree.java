package Trees;

import java.util.ArrayList;

//insert in binary search tree
//check whether tree is bst or not, inorder vs maintaining index values 
public class BinarySearchTree {
   boolean searchInBinaryTree(Node root,int k){
        while(root!=null){
            if(root.data==k){
                return true;
            }
            if(k>root.data){
                root= root.right;
            }else{
                root= root.left;
            }
        }
        return false;
    }
    ArrayList<Integer>list= new ArrayList<>();
   ArrayList<Integer> traverseBstInorderTraversal(Node root){

       if (root==null){
           return null;
       }

       traverseBstInorderTraversal(root.left);
       list.add(root.data);
       traverseBstInorderTraversal(root.right);
       return  list;
   }
   //another approach

   boolean isBST(Node root, int min, int max){
       if(root==null){
           return true;
       }
       if(min<=root.data && root.data<=max){
           return isBST(root.left,min,root.data-1) && isBST(root.right,root.data+1,max);
       }
        return false;
   }
   void  insertInBinaryTree(Node root,int k){
       Node rootTemp= root;
       Node prev=null;
       while(rootTemp!=null){
           prev=rootTemp;
           if(rootTemp.data > k){
               rootTemp=rootTemp.left;
           }else{
               rootTemp=rootTemp.right;
           }
       }
       Node tobeInserted = new Node(k);
       if(prev.data>=k){
           prev.left=tobeInserted;
       }
       else{
           prev.right=tobeInserted;
       }
       traverseBST(root);
   }
   void traverseBST(Node root){
       if(root==null){
           return;
       }
       traverseBST(root.left);
       System.out.print(root.data + "->");
       traverseBST(root.right);
   }

}
