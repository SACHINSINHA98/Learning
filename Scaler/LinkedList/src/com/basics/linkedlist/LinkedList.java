package com.basics.linkedlist;

public class LinkedList {
	Node head = null;

	public Node createNewNode(int data) {
		Node newNode = new Node(data);
		return newNode;
	}

	public void insertAtFirst(int data) {
		Node newNode = createNewNode(data);
		if (head == null) {
			head = newNode;
		} else if (head != null) {
			newNode.next = head;
			head = newNode;
		}
	}
	public void insertAtEnd(int data) {
		Node newNode=createNewNode(data);
		
		if(head==null) {
			insertAtFirst(data);
		}else{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		
	}
	public void insertAtK(int data,int k){
		Node newNode= new Node(data);
		if(head==null) {
			insertAtFirst(data);
		}else {
			int i=1;
			Node temp=head;
			if(k==1) {
				insertAtFirst(data);
			}else {
				while(i<k-1) {
					temp=temp.next;
					if(temp==null) {
						System.out.println("elements are less than position required");
						break;
					}
					i++;
				}
				
				 if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
				 }
			}
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("enter elements first");
		}
		else {
			head=head.next;
		}
	}
	public int findLength() {
		int length=0;
		if(head==null) {
			print();
			return 0;
		}else {
			Node temp=head;
			
			while(temp!=null) {
				length++;
				temp=temp.next;
			}
			
		}
		return length;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("enter elements first");
		}else {
			Node temp=head;
			int i=1;
			if(i==findLength()) {
				deleteFirst();
			}else {
			while(i<findLength()-1) {
				temp=temp.next;
				i++;
			}
			temp.next=null;
			
		}}
	}
	public void deleteKthnode(int k) {
		
		if(head==null) {
			System.out.println("Enter elements first");
		}else {
			Node temp=head;
			int i=1;
			if(k==1) {
				deleteFirst();
			}else {
				while(i<k-1) {
					temp=temp.next;
					
					if(temp==null || temp.next==null) {
						System.out.println("elements are less than the position required to be deleted ");
						break;
					}
					i++;
				}
				if(temp!=null) {
					if(temp.next!=null){
						temp.next=temp.next.next;
					} /*
						 * else { System.out.println("there are only "+findLength()+" "+ "elements"); }
						 */
				}
			}
		}
	}
	public void print() {
		if (head == null) {
			System.out.println("linked list is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data+" " +"-> ");
			temp = temp.next;}
		}
	}

}
