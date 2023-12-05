package SinglyLinkedListInsertionAndTraversing;

import java.util.Scanner;

public class A {
	
	static class Node{
		//this is an inner class called as node where we can store a data in it 
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		
	} 
	Node head=null;
	
	public void creation() {
		
		
		Scanner scan=new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Enter the data");
			 n=scan.nextInt();
		
		//we have two condition where head has Node or Head doesnot have a node
		Node new_node=new Node(n);
		
		if (head==null) {
			head=new_node;
		}
		else {
			new_node.next=head;
			head=new_node;
		}
		
		System.out.println("press 1 to add more data");
		
		n=scan.nextInt();
		}
		while(n==1);
		
	}
	
	
	public void traversing() {
		
		
		Node temp=head;
		if (head==null) {
			System.out.println("LL doesnot exists");
		}
		else {
			while(temp!=null) {
				
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	
	public static void main(String[] args) {
		A a1= new A();
		System.out.println("what u want to do see or add the data in linked list");
		Scanner scan=new Scanner(System.in);
	
		
		boolean flag=true;
		while (flag) {
			
		
		System.out.println("Hit 1 to insert the data in Linked list");
		System.out.println("Hit 2 to see the data i linked list");
		System.out.println("Hit other keys to exit");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			a1.creation();
			break;
		case 2:
			a1.traversing();
			break;
		default:
			flag=false;
		System.out.println("U are exited!!!");
			break;
		}
		}
	}
		
		
		

}
