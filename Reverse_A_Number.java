package Srikanth;

import java.util.Scanner;

public class Reverse_A_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		
		int reverse=0,r;
		while (num>0) {
			r=num%10;
			reverse =(reverse*10)+r;
			num/=10;
			
		}
		System.out.println("Reversed Number is : "+reverse);

	}

}
