package Srikanth;

import java.util.Scanner;

public class primeSeparate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();

		}

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {

				if (a[i] % j == 0) {
					count++;
				}
			}
			if (count == 2)

				System.out.println("Prime Number : " + a[i]);

		}
	}
}
