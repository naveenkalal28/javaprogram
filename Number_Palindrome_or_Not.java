package Srikanth;

import java.util.Scanner;

public class Number_Palindrome_or_Not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		int temp = num, sum = 0, r;
		while (num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num /= 10;

		}
		if (temp == sum) {
			System.out.println("Number is Palindrome... ");
		} else
			System.out.println("Number is Not a Palindrome");

	}

}
