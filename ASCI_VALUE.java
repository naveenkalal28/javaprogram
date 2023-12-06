package Srikanth;

import java.util.Scanner;

public class ASCI_VALUE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);

		int AsciNumber = ch;
		System.out.println("Asci Number for " + ch + " is " + AsciNumber);

	}

}
