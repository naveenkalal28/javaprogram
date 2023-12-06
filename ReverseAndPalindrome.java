package StringsNew;

import java.util.Scanner;

public class ReverseAndPalindrome {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :" );
		String str=sc.nextLine();
		String pal=str;
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) {
			rev +=str.charAt(i);
		}
		System.out.println("Reversed String : "+rev);
		
		if(rev.equalsIgnoreCase(pal)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}
	


}
