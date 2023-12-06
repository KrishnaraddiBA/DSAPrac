package SinglyLinkedListInsertionAndTraversing;

import java.util.Scanner;

//practise Array
//in arrays we know that for fetching purpose the time complecity is good and t(N)=o(1)
//AND IN to insertion and deletion time complecity is is high t(n)=O(1)
public class D {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int []a=new int[n];
		//to insert the new data in an array
		int []b=new int[n+1];
		System.out.println("Entre the data in the array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the specified position to enter in an array");
		int index=scan.nextInt();
		System.out.println("Enter the new data to be inserted");
		int data=scan.nextInt();
		for (int i = 0; i < b.length; i++) {
			if (i<index) {
				b[i]=a[i];
			}
			else if (i==index) {
				b[i]=data;
			}
			else {
				b[i]=a[i-1];
			}
		}
		
	//to traverse and get the data
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	
	}
	

}
