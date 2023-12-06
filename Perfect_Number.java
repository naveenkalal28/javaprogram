package Srikanth;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == temp)
			System.out.println(num+" is a Perfect Number ");
		else
			System.out.println(num+" is Not a Perfect Number ");
	}

}
