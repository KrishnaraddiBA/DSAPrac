package DeleteAnElementInAnArray;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int []a=new int[n];
		int []b=new int[n-1];
		System.out.println("Insert an element");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("delete an element in an array");
		System.out.println("Enter the index u want to remove");
		int m=scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (i<m) {
				b[i]=a[i];
			}
			
			else if (i==m) {
				continue;
			}
			else {
				b[i-1]=a[i];
			}
			
		}
		System.out.println("Read an element in an array");
		
		for (int i = 0; i <b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

}
