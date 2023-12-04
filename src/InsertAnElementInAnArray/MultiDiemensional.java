package InsertAnElementInAnArray;

import java.util.Scanner;

public class MultiDiemensional {

	
	//here we are specifying two diemensional array
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of a row");
		int n=scan.nextInt();
		System.out.println("Enter the size of a col");
		int m=scan.nextInt();
		
		
		int [][]a=new int[n][m];
		System.out.println("Insert an elements in the rows and column");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			a[i][j]=scan.nextInt();
		}
		
	}
	System.out.println("Printing the numbers");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println(a[i][j]);
		}
	}
	
	
	
	
	}
}
