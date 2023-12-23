package CircularLinkedList;

import java.util.Scanner;

public class A {
	
	Scanner scan=new Scanner(System.in);
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;

	Node tail=null;
	int n;
	public void creation() {
		
		int l;
		do {
		System.out.println("Enter the data to be inserted");
		n=scan.nextInt();
		Node new_node=new Node(n);
		if (head==null) {
			head=new_node;
			tail=new_node;
		}
		else {
			System.out.println("Hit 1 to insert the data from the front");
			System.out.println("Hit 2 to insert the data from the rear end");
			System.out.println("Hit 3 to insert the data from the specified index");
			System.out.println("Hit other keys to exit from the adding the data");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				new_node.next=head;
				head=new_node;
				tail.next=head;
				break;
			case 2:
				new_node.next=head;
				tail.next=new_node;
				break;
			case 3:
				Node temp=head;
				System.out.println("Enter the specified position u want to enter the details");
				int index=scan.nextInt();
				for (int i = 0; i < index-1; i++) {
					temp=temp.next;
				}
				new_node.next=temp.next;
				temp.next=new_node;
				
				break;

			default:
				System.out.println("U are exited from adding the data!!!");
				break;
			}
		}
		System.out.println("press 1 add more data");
		 l=scan.nextInt();
		}
		while(l==1);
	}
	public void traversing() {

		Node temp=head;
		if (head==null) {
			System.out.println("Circular Linked list doesnt exists");
		}
		else {
			
			while (temp.next!=head) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	
	
	public void deletion() {
		
		do {
			System.out.println("Press 1 to delete from the front");
			System.out.println("Press 2 to delete from the rear end");
			System.out.println("Press 3 to delete from the specified position");
			if (head==null) {
				System.out.println("Circular LL Doesnt exists!!!");
			}
			else {
			int key=scan.nextInt();
			switch (key) {
			case 1:
			Node temp=head;
			head=temp.next;
				break;
			case 2:
				temp=head;
				Node ptr=temp.next;
				while (ptr.next!=head) {
					temp.next=ptr;
					ptr=ptr.next;
					
				}
				temp.next=head;
				break;
			case 3:
				temp=head;
				ptr=temp.next;
				System.out.println("Enter the position u want to delete the data!!!");
				n=scan.nextInt();
				for (int i = 0; i < n-1; i++) {
					temp.next=ptr;
					ptr=ptr.next;
				}
				temp.next=ptr.next;
				
				break;

			default:
				System.out.println("u are terminated!!!");
				break;
			}
			
			}
			
			System.out.println("Hit 1 to delete more data");
			n=scan.nextInt();
		}
		while(n==1);
		
	}

	
	
	public static void main(String[] args) {

		boolean flag=true;
		
	
	A a1= new A();
	Scanner scan=new Scanner(System.in);
		while (flag) {
			
		
		System.out.println("press 1 to enter the data in circular LL");
		System.out.println("Press 2 to traverse along circular Ll");
		System.out.println("press 3 to delete an elements along the circular Ll");
	
	int key=scan.nextInt();
		switch (key) {
		case 1:
		a1.creation();	
			break;

		case 2:
			a1.traversing();
			break;
		case 3:
			a1.deletion();
			break;
		default:
			flag=false;
			System.out.println("U are terminated good bye!!!");
			break;
		}
		
		}
		
	}

}
