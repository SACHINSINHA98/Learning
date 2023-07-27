package Trees;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class SerializeBinaryTree {
    public static void main(String[] args) {
        Integer []arr={1,2,3,4,5,-1,6};
        List<Integer>list= Arrays.asList(arr);
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        serialize(root);
        deserialize(list);
    }

    private static TreeNode  deserialize(List<Integer> list) {
        Queue<TreeNode>q= new LinkedList<>();
        TreeNode root= new TreeNode(list.get(0));
        q.add(root);
        for(int i=1;i<list.size();i++){
            TreeNode parent = q.poll();
            if(list.get(i)!=-1 && list.get(i)!=null){
                TreeNode left=new TreeNode(list.get(i));
                parent.left=left;
                q.add(left);

            }
            if(list.get(++i)!=-1 && list.get(i)!=null){
                TreeNode right=new TreeNode(list.get(i));
                parent.right=right;
                q.add(right);

            }

        }
        return root;
    }

    private static void serialize(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode temp = q.remove();
            if (temp != null)
                list.add(temp.val);
            else {
                list.add(-1);
                continue;
            }
            q.add(temp.left);
            q.add(temp.right);
        }
        System.out.println(list);
    }


}
