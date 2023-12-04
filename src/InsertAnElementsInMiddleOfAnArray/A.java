package InsertAnElementsInMiddleOfAnArray;

import java.util.Scanner;
//In Array  time complexity will be incresed so we do not prefer array for insertion and deletion of an array
public class A {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int []a=new int[n];
		
		int b[]=new int[n+1];
		System.out.println("Insert an element in an array");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println("Try to insert element in middle of the index");
	System.out.println("now enter the index u want to insert with");
		int k=scan.nextInt();
		System.out.println("Enter the new element u want to insert");
		int r=scan.nextInt();
		
		for (int i = 0; i < b.length; i++) {
			if (i<k) {
				b[i]=a[i];
			}
			else if (i==k) {
				b[i]=r;
			}
			else {
				b[i]=a[i-1];
			}
		}
		
		
		
		System.out.println("To read an element in an array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

}
