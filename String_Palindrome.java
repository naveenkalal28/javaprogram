package Strings;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		String rev="";
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println("Reversed String : "+rev);
		if(rev.equalsIgnoreCase(str)) 
			System.out.println("Given String is Palindrome...");
		else
			System.out.println("Given String is Not a Palindrome...");
		
	}

}
