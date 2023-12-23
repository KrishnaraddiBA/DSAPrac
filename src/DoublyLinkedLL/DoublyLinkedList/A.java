package DoublyLinkedLL.DoublyLinkedList;



import java.util.Scanner;

public class A {
	
	//this is for a doubly linked list
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=prev;
		}
	}
	Node head=null;
	Node tail=null;
	
	
	public void creation() {
		int n,data;
		Scanner scan=new Scanner(System.in);
		do {
		System.out.println("Enter the data in the node");
		data=scan.nextInt();
		Node newnode=new Node(data);
		
			if (head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
			System.out.println("Press 1 to add the elements at front!!");
			System.out.println("Press 2 to add the element at the end!!");
			System.out.println("Press 3 to add the element at the specified index");
			int key=scan.nextInt();
			switch (key) {
			case 1:
				head.prev=newnode;
				newnode.next=head;
				head=newnode;
				break;
			case 2:
				newnode.prev=tail;
				tail.next=newnode;
				tail=newnode;
				break;
			case 3:
				Node temp=head;
				System.out.println("Enter the specified position to add the elements");
				int pos=scan.nextInt();
				for(int i=1;i<pos-1;i++) {
					temp=temp.next;
				}
				newnode.prev=temp;
				newnode.next=temp.next;
				temp.next=newnode;
				break;

			default:
				System.out.println("U have entered invalid input!!!");
				break;
			}
			}
			
			System.out.println("Press 1 to add the elements again");
			n=scan.nextInt();
		
		}
		while(n==1);
	}
	public void traversing() {
		
		Node temp=head;
		if (head==null) {
			System.out.println("NO LL present");
		}
		else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void deletion() {
	
		Scanner scan=new Scanner(System.in);
		int n;
		do {
		System.out.println("Press 1 to delete at front end");
		System.out.println("Press 2 to delete at the rear end");
		System.out.println("Press 3 to delete at the specified position");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			Node temp=head;
		
			Node ptr=temp.next;
			head=ptr;
			ptr.prev=null;
			
			break;
		case 2:
		 temp=tail;
		 ptr=tail.prev;
		 ptr.next=null;
		 tail=ptr;
			break;
		case 3:
			System.out.println("Enter the specified position!!!");
			int pos=scan.nextInt();
			temp=head;
			ptr=temp.next;
			for(int i=1;i<pos-1;i++) {
				temp=ptr;
				ptr=ptr.next;
			}
			temp.next=ptr.next;
			ptr.next.prev=temp;
			break;

		default:
			System.out.println("U have entered an invalid prompt");
			break;
		}
		System.out.println("Press 1 to delete more elements");
		n=scan.nextInt();
		}
		while(n==1);
		
	}
	
	public static void main(String[] args) {
		
		A a1=new A();
		boolean flag=true;
		Scanner scan=new Scanner(System.in);
		while(flag) {
		
		System.out.println("Hit 1 to add the details");
		System.out.println("Hit 2 to traverse along the array");
		System.out.println("Hit 3 to delete the elements in an array");
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
			System.out.println("GOOD BYE HOG BA!!!");
			flag=false;
			break;
		}
		
		}
	}

}
