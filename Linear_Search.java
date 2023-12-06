package Srikanth;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int size = sc.nextInt();

		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a[" + i + "] Values ");
			a[i] = sc.nextInt();

		}

		System.out.println("Select One Number for Searching...");
		int num = sc.nextInt();
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println("Number is Available at " + i + " index Postion.... ");
				temp += 1;

			}
		}
		if (temp == 0)
			System.out.println("Number is Not Available in the Array....");

	}

}
