package com.linkedList;

public class DoublyLinkedList {

	class Node {
		
		Node previous = null;
		int data;
		Node next = null;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	Node head = null;
	//adding data at last
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			newNode.previous = temp;
			temp.next = newNode;
		}
	}
	//forward traversing
	public void display() {
		
		if(head == null)
			System.out.println("List id Empty");
		else {
			
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + ", ");
				temp = temp.next;
			}
				
		}
	}
	public static void main(String[] args) {
		
		DoublyLinkedList dLL = new DoublyLinkedList();
		dLL.append(15);
		dLL.append(1);
		dLL.append(52);
		dLL.append(11);
		dLL.append(7);
		dLL.display();
	}

}
