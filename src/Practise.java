import java.util.Scanner;

public class Practise {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Scanner scan=new Scanner(System.in);
	
	int n;
	
	public void addElements() {
	
		do {
		System.out.println("Enter the element to Linked list");
	n=scan.nextInt();
	Node new_node=new Node(n);
		if (head==null) {
			head=new_node;
		}
		else {
			System.out.println("Hit 1 to add the elements from front end");
			System.out.println("Hit 2 to add the elements from the rear end");
			System.out.println("Hit 3 to add ubder a specified position");
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
				System.out.println("Enter the specified position where u want to add the elements ");
				int index=scan.nextInt();
				for (int i = 0; i < index-1; i++) {
					temp=temp.next;
				}
				new_node.next=temp.next;
				temp.next=new_node;
				
				break;

			default:
				
				System.out.println("Invalid key!!!");
				break;
			}
			
		}
		System.out.println("Hit 1 to add more elements ");
		System.out.println("Hit other keys to exit");
		n=scan.nextInt();
		}
		while(n==1);
	}
	public void traverse() {
		
		
		if (head==null) {
			System.out.println("There is no LL");
		}
		else {
			Node temp=head;
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void deleteElements() {
		int n;
		Node temp=head;
		
		do {
		System.out.println("Hit 1 to delete elements from the front ");
		System.out.println("Hit 2 to delete elements from the rear end");
		System.out.println("Hit 3 to delete elements from the specified position");
		if (head==null) {
			System.out.println("There is no LL");
		}
		else {
		int key=scan.nextInt();
		switch (key) {
		case 1:
			head=temp.next;
			break;

		case 2:
			temp=head;
			Node ptr=temp.next;
			while (ptr.next!=null) {
				ptr=ptr.next;
				temp.next=ptr;
			}
			temp.next=null;
			
			break;
		case 3:
			temp=head;
			ptr=temp.next;
			System.out.println("Enter the specified position to insert");
			n=scan.nextInt();
			for (int i = 0; i < n-1; i++) {
				temp=temp.next;
				ptr=temp.next;
			}
			temp.next=ptr.next;
			break;
		default:
			System.out.println("Invalid option!!");
			break;
		}
		
		
		}
		System.out.println("press 1 to delete more elemets ");
		n=scan.nextInt();
		}
		while(n==1);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Practise p=new Practise();
		boolean flag=true;
		while (flag) {
		System.out.println("Hit 1 to add the elements in LL");
		System.out.println("Hit 2 to traverse elements in LL");
		System.out.println("Hit 3 to delete the elements in LL");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			p.addElements();
			break;
		case 2:
			p.traverse();
			break;
		case 3:
			p.deleteElements();
			break;

		default:
			flag=false;
			System.out.println("U have terminated sucessfully!!!");
			break;
		}
		}
	}

}
