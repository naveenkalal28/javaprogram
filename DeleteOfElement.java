package Arrays;

import java.util.Scanner;

public class DeleteOfElement {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70 };

		int delete = 70;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == delete) {

				continue;

			} else
				System.out.print(a[i]+" ");

		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Size of Array :");
//		int size = sc.nextInt();
//
//		int a[] = new int[size];
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("Enter a[" + i + "] Values ");
//          a[i] = sc.nextInt();
//
//		}
//
//		System.out.println("Enter Number to Delete :");
//		int delete = sc.nextInt();
//
//		for (int i = 0; i < a.length; i++) {
//			if (delete == a[i]) {
//				for (int j = i; j < a.length - 1; j++) {
//					a[j] = a[j + 1];
//				}
//				break;
//			}
//
//		}
//		for (int i = 0; i < a.length - 1; i++) {
//			System.out.print(a[i] + " ");
//		}

	}

}
