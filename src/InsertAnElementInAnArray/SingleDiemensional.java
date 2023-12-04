package InsertAnElementInAnArray;

import java.util.Scanner;

public class SingleDiemensional {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		int []a=new int[n];
		System.out.println("Enter the numbers");
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("Printing all the numbers");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		
		
	}

}
