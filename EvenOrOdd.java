package Srikanth;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of elements :");
		int size = sc.nextInt();
		int a[] = new int[size];
		int EvenSum = 0;
		int OddSum = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a[" + i + "] values :");
			a[i] = sc.nextInt();
		}
		System.out.println("Even Numbers : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " ");
				EvenSum = EvenSum + a[i];
			}

		}
		System.out.println("Odd Numbers : ");
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				System.out.println(a[j] + " ");
				OddSum += a[j];
			}

		}

		System.out.println("Sum Of Even Numbers : " + EvenSum);
		System.out.println("Sum of Odd Numbers : " + OddSum);

	}

}
