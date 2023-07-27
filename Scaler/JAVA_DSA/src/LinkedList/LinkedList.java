package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }


}

public class LinkedList {
    Node head = null;

    void addAtFirst(LinkedList list, int data) {
        Node node = new Node(data);
        if (list.head == null) {
            list.head = node;
            node.next = null;
            showLinkedList(list);
        } else {
            node.next = head;
            head = node;
            showLinkedList(list);
        }
    }

    void addAtLast(LinkedList list, int data) {
        Node node = new Node(data);
        if (list.head == null) {
            addAtFirst(list, data);
            showLinkedList(list);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            //node.next=null;
            temp.next = node;
            showLinkedList(list);
        }
    }

    void addAtkthPosition(LinkedList list, int data, int k) {
        Node node = new Node(data);
        if (k == 0) {
            addAtFirst(list, data);

        } else {
            int count = 0;
            Node temp = head;
            if (k < getLength(list)) {
                while (temp.next != null && count < k - 2) {
                    count++;
                    temp = temp.next;
                }
                node.next = temp.next;
                if (temp.next != null) {
                    temp.next = node;
                }
                showLinkedList(list);
            } else if (k == getLength(list) + 1) {
                addAtLast(list, data);

            } else {
                showLinkedList(list);
                System.out.println("entered index is greater than length of list");
            }


        }
    }

    void reverseLinkedList(LinkedList list) {
        Node dummyNode = null;
        Node temp = null;
        Node pointingOriginalList = head;
        if (head == null) {
            showLinkedList(list);
        } else {
            while (pointingOriginalList != null) {
                temp = pointingOriginalList;
                pointingOriginalList = pointingOriginalList.next;
                temp.next = dummyNode;
                dummyNode = temp;
            }
            Node temp1 = dummyNode;
            System.out.println("Reversed Linked List is");
            while (dummyNode != null) {
                System.out.print(dummyNode.data + "->");
                dummyNode = dummyNode.next;
            }
        }
    }

    void reverseFirstKNodesLinkedList(LinkedList list, int k) {
        Node dummyNode = null;
        Node temp = null;
        Node pointingOriginalList = head;
        if(head==null || k==0){
            showLinkedList(list);
        }else if(k>getLength(list)){
            System.out.println(k +  "  is larger than size of list" );
            System.out.println("enter k smaller than or equal to " + getLength(list));
            showLinkedList(list);
        }else {
            while (k > 0 && pointingOriginalList != null) {
                temp = pointingOriginalList;
                pointingOriginalList = pointingOriginalList.next;
                temp.next = dummyNode;
                dummyNode = temp;
                k--;
            }
            head.next = pointingOriginalList;
            Node temp1 = dummyNode;
            System.out.println("Reversed Linked List is");
            while (dummyNode != null) {
                System.out.print(dummyNode.data + "->");
                dummyNode = dummyNode.next;
            }
        }
    }

    int getLength(LinkedList list) {
        int length = 0;
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
        }

        return length;
    }

    void showLinkedList(LinkedList list) {
        if (list.head == null) {
            System.out.println("Length is 0");
            System.out.println("LinkedListIsEmpty");
        } else {
            Node temp = list.head;
            int count = 0;
            while (temp != null) {
                System.out.print(temp.data + "->");
                count++;

                temp = temp.next;


            }
            System.out.println();
            System.out.println("length is " + count);
        }
    }
    //1 2 3 5 7 9
    //4 6 8 10
    void mergeSortedList(LinkedList list1, LinkedList list2){
        Node tempList1=list1.head;
        Node tempList2=list2.head;
        Node current=null;
        while(tempList1.next!=null && tempList2.next!=null){
            if(tempList2.data>tempList1.data ){
                current=tempList1;
               tempList1=tempList1.next;
               current.next=tempList2;
            }else {
                current=tempList2;
                tempList2=tempList2.next;
                current.next=tempList1;
            }
        }
    }

}

class DryRunLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtFirst(list, 9);
        list.addAtFirst(list, 7);
        list.addAtFirst(list, 5);
        list.addAtFirst(list, 3);
        list.addAtFirst(list, 2);
        list.addAtkthPosition(list, 1, 0);
        System.out.println("-------------------------------------------");
        LinkedList list2 = new LinkedList();
        list2.addAtFirst(list2, 10);
        list2.addAtFirst(list2, 8);
        list2.addAtFirst(list2, 6);
        list2.addAtFirst(list2, 4);
    }
}
