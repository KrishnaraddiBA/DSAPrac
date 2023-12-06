package SinglyLinkedListInsertionAndTraversing;
//in the Linked list insertion and deletion the time complexity is good but for fetching purpose the time complecity is too high
import java.util.Scanner;

public class C {
//practise DSA
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	public void creation() {
		//we must satisfy the condition given weather LL exists Or LL doesnt exists
		Scanner scan=new Scanner(System.in);
		int n;
		do {
		System.out.println("Enter the data u want to store");
		 n=scan.nextInt();
		
		Node new_node=new Node(n);
		//if LL doesnt exists
		if (head==null) {
			head=new_node;
		}
		//if LL exists
		else {
			
			
				
				System.out.println("Hit 1 to enter from front");
				System.out.println("Hit 2 to enter from end");
				System.out.println("Hit 3 to enter from the specifies position");
				
				System.out.println("Hit 4 or other keys to terminate from adding the data");
				int j=scan.nextInt();
			switch (j) {
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
				int r=scan.nextInt();
				
				
				for (int i = 0; i < r-2; i++) {
					temp=temp.next;
				}
				new_node.next=temp.next;
				temp.next=new_node;
				break;

			default:
				System.out.println("u have exited!!!");
				break;
			}
			
			}
		System.out.println("Press 1 if u want to enter more data");
		n=scan.nextInt();
			}
		
		while(n==1);
		
	}
	public void traversing() {

		Node temp=head;
		
		if (head==null) {
			System.out.println("LL doesnt exists!!!");
		}
		else {
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	
	
	public void removeElements() {
		Node temp=head;
		Scanner scan=new Scanner(System.in);
		int n;
		do {
		if (head==null) {
			System.out.println("To delete no LL is present first add the element and then delete!!!");
		}
		else {
			System.out.println("press 1 to delete from the front");
			System.out.println("press 2 to delete an element from the end");
			System.out.println("press 3 to delete an element from the specified position");
			System.out.println("press other keys to exit");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				head=temp.next;	
				break;
			case 2:
				Node ptr=temp.next;
				while (ptr.next!=null) {
					temp.next=ptr;
					ptr=ptr.next;
				}
				temp.next=null;
				break;
			case 3:
				
				System.out.println("Enter the index to which position to be deleted!!");
				int g=scan.nextInt();
				ptr=temp.next;
				for (int i = 0; i < g; i++) {
					temp.next=ptr;
					ptr=ptr.next;
				}
				temp.next=ptr.next;
				break;

			default:
				System.out.println("U Pressed an Invalid option!!!");
				
				break;
			}
			
		}
		System.out.println("Press 1 to continue to delete elements in an LinkedList");
		 n=scan.nextInt();
		}
		while(n==1);
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		Boolean flag=true;
		C c1=new C();
		while (flag) {
			
	
		System.out.println("Hit 1 to add the elements in an SinglyLinkedList");
		System.out.println("Hit 2 to traverse and get the elements from the Linked List");
System.out.println("Hit 3 to delete an element in an array");
		System.out.println("Hit other keys to terminate the program");
		
		int key =scan.nextInt();
		switch (key) {
		case 1:
			c1.creation();
			break;
		case 2:
			c1.traversing();
			break;
		case 3:
			c1.removeElements();
			break;
		default:
			flag=false;
			break;
		}
		}
		}
	
}
