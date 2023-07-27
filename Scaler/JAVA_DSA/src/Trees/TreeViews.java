package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeViews {

    void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            Node node = queue.peek();
            System.out.print(node.data + "->");
            queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    void levelOrderEachLevelInDiffLineAndSumOfNode(Node root) {
        Queue<Node> queue = new LinkedList<>();
        int maxSum = 0;
        queue.add(root);
        //System.out.println(queue.peek());
        queue.add(null);
        int sumLevel = 0;
        while (queue.size() > 0) {

            Node front = queue.peek();
            queue.remove();
            if (front == null) {
                System.out.println("");
                System.out.println("------------");
                if (queue.size() > 0) {
                    queue.add(null);
                    sumLevel = 0;
                }
                continue;
            }
            sumLevel += front.data;
            System.out.print(front.data + "=" + sumLevel + " ");
            maxSum = Integer.max(sumLevel, maxSum);
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }

        }
        System.out.println(maxSum);
    }

    void leftView(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        System.out.println(root.data);
        while (queue.size() > 0) {
            Node front = queue.peek();
            queue.remove();
            if (front == null) {
                System.out.println("---");
                System.out.println("");
                if (queue.size() > 0) {
                    queue.add(null);
                }
                if (!queue.isEmpty()) {
                    System.out.println(queue.peek().data);
                }
                continue;
            }
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }
        }
    }

    void levelOrderTraversalInReverse(Node root) {
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (queue.size() > 0) {
            Node front = queue.peek();
            queue.remove();
            System.out.print(front.data + "<-");
            if (front.right != null) {
                queue.add(front.right);
            }
            if (front.left != null) {
                queue.add(front.left);
            }

        }
    }
    void rightView(Node root) {
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        System.out.println(root.data);
        queue.add(null);
        while (queue.size() > 0) {
            Node front = queue.peek();
            queue.remove();
            if(front==null){
                System.out.println("---------");
                System.out.println("");
                if(queue.size()>0){
                    queue.add(null);
                }
                if(!queue.isEmpty()){
                    System.out.println(queue.peek().data);
                }
                continue;
            }
            if (front.right != null) {
                queue.add(front.right);
            }
            if (front.left != null) {
                queue.add(front.left);
            }

        }
    }

}
