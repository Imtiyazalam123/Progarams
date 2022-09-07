package com.linkedList;

public class SinglyLinkedList {

	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	Node head = null;
  //this method is appending the data at the last of the linkedList.	
	public void addNode(int data) {
		
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}	
	}
	//this method will add the data at first of the linked list.
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	//to print all the items of the linked list.
	public void displayList() {
		
		if(head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addFirst(7);
		list.addFirst(8);
		list.displayList();		
	}
}
