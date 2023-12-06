package Srikanth;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary :");
		double salary = sc.nextInt();

		if (salary >= 25000) {
			double tax = salary * 0.20;
			System.out.println("Tax = " + tax);
			salary -= tax;
			System.out.println("Salary after Tax = " + salary);

		} else
			System.out.println("No Tax.. Njoyyyy");
	}

}
