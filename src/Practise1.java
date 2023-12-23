import java.util.Scanner;
//Circular Linked list
public class Practise1 {
	
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
	Scanner scan=new Scanner(System.in);
	int n;
	public void addElements() {
		do {
		System.out.println("Enter the data to be added");
		int data=scan.nextInt();
		Node new_node=new Node(data);
		if (head==null) {
			head=new_node;
			tail=new_node;
		}
		else {
			System.out.println("press 1 to add the elements from first");
			System.out.println("press 2 to add the elements from last");
			System.out.println("press 3 to add the elements from the specified position");

			int key=scan.nextInt();
			switch (key) {
			case 1:

				new_node.next=head;
				head=new_node;
				tail.next=head;
				break;

			case 2:
				Node temp=head;
				tail.next=new_node;
				new_node.next=head;
				break;
			case 3:
				
				System.out.println("Enter the specified position to add");
				int pos=scan.nextInt();
				temp=head;
				for (int i = 0; i < pos-1; i++) {
					temp=temp.next;
				}
				new_node.next=temp.next;
				temp.next=new_node;
				break;
			default:
				System.out.println("Invalid Entry!!!");
				break;
			}
			
		}
		System.out.println("Press 1 to add more elements");
		n=scan.nextInt();
		}
		while(n==1);
	}
	public void traverse() {
		
		Node temp=head;
		if (head==null) {
			System.out.println(" Circular Linked list doesnt exists!!!");
		}
		else {
			
			while (temp.next!=head) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public void deleteElemets() {
		do {
		System.out.println("Hit 1 to delete elements from front!!");
		System.out.println("Hit 2 to delete elements from end!!");
		System.out.println("Hit 3 to delete elements from the specified position");
		int key=scan.nextInt();
		switch (key) {
		case 1:
			Node temp=head;
			head=temp.next;
			break;
		case 2:
			temp=head;
			Node ptr=temp.next;
			while(ptr.next!=null) {
				temp.next=ptr;
				ptr=ptr.next;
			}
			temp.next=head;
			break;
		case 3:
			  System.out.println("Enter the specified position where you want to delete");
              int index = scan.nextInt();

              Node temp2 = head;
              ptr = temp2.next;

              for (int i = 0; i < index - 2; i++) {
                  temp2 = ptr;
                  ptr = ptr.next;
              }

              temp2.next = ptr.next;
              break;

          default:
              System.out.println("Invalid entry!!");
              break;

		}
		System.out.println("Press 1 to delete more elements");
		n=scan.nextInt();
		}
		while(n==1);
		
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean falg=true;
	Practise1 p1=new Practise1();
		while (falg) {
		System.out.println("Hit 1 to add the elements");
		System.out.println("Hit 2 to traverse the elements");
		System.out.println("Hit 3 to delete the elements");
		int key=scan.nextInt();
		
		switch (key) {
		case 1:
			p1.addElements();
			
			break;
		case 2:
			p1.traverse();
			break;
		case 3:
			p1.deleteElemets();
			break;

		default:
			break;
		}
		
		
		}
		}

}
