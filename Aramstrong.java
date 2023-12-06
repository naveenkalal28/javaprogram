package Srikanth;

import java.util.Scanner;

public class Aramstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
       
		int N=num,temp=num;int count=0;int sum=0;
		
		while(num>0)
		{
			num /=10;
			count++;
		}
		while(N>0)
		{
			int digit=N%10;
			sum +=Math.pow(digit, count);
			N /=10;
			
		}
		
		if(sum==temp)
			System.out.println("Armstrong Number ");
		else
			System.out.println("Not a Armstrong Number ");

	}

}
