package SinglyLinkedListInsertionAndTraversing;

import java.util.Scanner;

public class B{
	
	Scanner scan=new Scanner(System.in);
	
	
	Node head=null;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void creation() {
		
		int n;
		do {
		System.out.println("Enter the data u want to insert");
		 n=scan.nextInt();
		Node new_node=new Node(n);
		
		if (head==null) {
			head=new_node;
		}
		else {
			
			System.out.println("Hit 1 to enter at front end!!");
			System.out.println("Hit 2 to enter from rear end!!");
			System.out.println("Hit 3 to enter at specified index!!");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				new_node.next=head;
				head=new_node;
				
				break;
				
			case 2:
				Node temp=head;
				while (temp.next!=null) {
					temp=temp.next;
				}
			temp.next=new_node;
				break;
				
			case 3:
				System.out.println("Enter the index u want to store a data");
				int index=scan.nextInt();
				 temp=head;
				for (int i = 0; i < index-2; i++) {
					temp=temp.next;
					
				}
				new_node.next=temp.next;
				temp.next=new_node;
				
				break;

			default:
				break;
			}
			
			
			
			
		}
		System.out.println("Press 1 to add again ");
		n=scan.nextInt();
		}
		while(n==1);
	}
	public void traversing() {
		
		Node temp=head;
		if (head==null) {
			System.out.println("Thre is no Linked List!!");
		}
		else {
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		
		B b1=new B();
		while (flag) {
		System.out.println("Hit 1 to insert data");
		System.out.println("Hit 2 to traverse and get the data in singly Linked list");
		System.out.println("Hit other keys to terminate");
	
		int key=scan.nextInt();
		switch (key) {
		case 1:
			b1.creation();
			break;
		case 2:
			b1.traversing();
			break;

		default:
			flag=false;
			System.out.println("U have terminated!!!");
			break;
		}
		
		
		}
	}
	
}