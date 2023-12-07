package SinglyLinkedListInsertionAndTraversing;
import java.util.Scanner;

public class Practise {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=next;
		}
	}
	Node head=null;
	int n;
	Scanner scan=new Scanner(System.in);
	public void creation() {
	do {
		System.out.println("Enter the data");
		n=scan.nextInt();
		Node new_node=new Node(n);
		if (head==null) {
			head=new_node;
		}
		else {
			System.out.println("Press 1 to enter the data from front end");
			System.out.println("Press 2 to enter the data from the rear end");
			System.out.println("Press 3 to enter the data at specified position");
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
				temp=head;
				System.out.println("Enter the specified position where u wnt to enter the details");
				int index=scan.nextInt();
				for (int i = 0; i < index-2; i++) {
					temp=temp.next;
				}
				new_node.next=temp.next;
				temp.next=new_node;
				break;

			default:
				System.out.println("U are exited from adding the elements");
				break;
			}
		}		System.out.println("Press 1 to add more details");
		n=scan.nextInt();
	}	
	
	while(n==1);
	}
	public void traversing() {
	
		Node temp=head;
		if (head==null) {
			System.out.println("There is no data in Linked list means LL only doesnt exists");
			
		}
		else {
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void deletion() {
		do {
			System.out.println("Press 1 to delete elements from the front");
			System.out.println("Press 2 to delete elements from the end");
			System.out.println("Press 3 to delete elements  from specified index");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				Node temp=head;
				if (head==null) {
					System.out.println("LL doesnt exists!!!");
				}
				else {
					head=temp.next;
				}
				break;

			case 2:
				temp=head;
				Node ptr=temp.next;
				while (ptr.next!=null) {
					temp.next=ptr;
					ptr=ptr.next;
				}
				temp.next=null;
				
				
				break;
			case 3:
				
				temp=head;
				ptr=temp.next;
				
				System.out.println("Enter the specified position to delete an elements");
				int index=scan.nextInt();
				for (int i = 0; i < index; i++) {
					temp.next=ptr;
					ptr=ptr.next;
				}
				temp.next=ptr.next;
				break;
			default:
				System.out.println("U are terminated thanku u have pressed an invalid option");
				break;
			}
			System.out.println("do u want to delete more elements press 1 else exit by pressing other keys");
			n=scan.nextInt();
		}
		while(n==1);
	}	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		Practise p=new Practise();
		while (flag) {
		System.out.println("Hit 1 to add data in singly linked list");
		System.out.println("Hit 2 to traverse a singly linked list");
		System.out.println("Hit 3 to delete an elements in Linked list");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			p.creation();
			break;
		case 2:
			p.traversing();
			break;
		case 3:
			p.deletion();
			break;
		default:
			
			flag=false;
			break;
		}
		}
	}

}
