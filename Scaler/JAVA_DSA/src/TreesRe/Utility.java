package TreesRe;

import java.util.ArrayList;

public class Utility {
    static int height(Node root){
        if(root == null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return 1+Integer.max(l,r);
    }
    static int heightLeft(Node root){
        if(root == null){
            return 0;
        }
        int l=height(root.left);
        return 1+l;
    }
    static int heightRight(Node root){
        if(root == null){
            return 0;
        }
        int r=height(root.right);
        return 1+r;
    }
    static int balanced(Node root){
        if(root == null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        if(Math.abs(l-r)>1){
            return -1;
        }
        if(l==-1 || r==-1){
            return -1;
        }
        return 1+Integer.max(l,r);
    }
    static boolean balanced2(Node root){
        if(root == null){
            return true;
        }
        int l=heightLeft(root);
        int r=heightRight(root);
        if(Math.abs(l-r)>1){
            return false;
        }
       boolean left= balanced2(root.left);
       boolean right= balanced2(root.right);
        if(!left || !right){
            return false;
        }
        return true;
    }
    static boolean path(Node root, int k, ArrayList<Integer> list){
        if(root==null){
            return false;
        }
        if(root.data==k){
            list.add(root.data);
            return true;
        }
        boolean left =path(root.left,k,list);
        if(left==true){
            list.add(root.data);
        }
        boolean right=path(root.right,k,list);
        if(right==true){
            list.add(root.data);
        }
        return left||right;
    }
    static int maxPathSum(Node A,Integer[] maxSum){
        if(A==null){
            return 0;
        }
       int left= maxPathSum(A.left,maxSum);
       int right= maxPathSum(A.right,maxSum);
       maxSum[0]=Integer.max(maxSum[0],left+right+A.data);
       return A.data+Math.max(left,right);
    }

}
