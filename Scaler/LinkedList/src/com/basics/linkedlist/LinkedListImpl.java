package com.basics.linkedlist;

public class LinkedListImpl {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	
	  //list.insertAtFirst(50); 
	  //list.insertAtFirst(30);
	 //list.insertAtEnd(90);
	//list.insertAtEnd(80);
	//list.insertAtK(30, 1);
	list.insertAtK(40, 1);
	list.insertAtK(100, 2);
	list.insertAtK(110,3);
	list.print();
	System.out.println(" ");
	//list.deleteFirst();
	//list.deleteFirst();
	//list.deleteFirst();
	//list.deleteLast();
	//list.deleteLast();
	//list.deleteKthnode(1);
	//list.deleteKthnode(2);
	//list.deleteKthnode(1);
	//list.deleteKthnode(1);
	//list.deleteKthnode(1);
	//list.deleteKthnode(1);
	//list.deleteKthnode(1);
	list.deleteKthnode(6);
	//list.deleteLast();
	//list.deleteLast();
	//list.findLength();
	list.print();
}
}
