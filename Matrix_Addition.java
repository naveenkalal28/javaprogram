package Arrays;

import java.util.Scanner;

public class Matrix_Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter the Number of Columns :");
		int column=sc.nextInt();
		int a[][]=new int[rows][column];
		int b[][]=new int[rows][column];
		int c[][]=new int[rows][column];
		
		
		System.out.println("Enter the First Matrix Values : ");
		for(int i=0; i<rows ;i++) {
			for(int j=0; j<column; j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter the Second Matrix Values : ");
		for(int i=0; i<rows ;i++) {
			for(int j=0; j<column; j++) {
				b[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0; i<rows ;i++) {
			for(int j=0; j<column; j++) {
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		System.out.println("The Sum of Matrices : ");
		for(int i=0; i<rows ;i++) {
			for(int j=0; j<column; j++) {
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
