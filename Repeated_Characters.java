package StringsNew;

import java.util.Scanner;

public class Repeated_Characters {

	public static void main(String[] args) {
		
		String str="malayalam";
		Scanner sc=new Scanner(System.in);
		System.out.println("Given String :"+str);
		System.out.println();
		System.out.println("Enter a character to find count of character :");
		char ch=sc.next().charAt(0);
		int count=0;	
		for(int i=0; i<str.length();i++) 
		{	
         if(str.charAt(i)==ch) {
        	count++; 
         }
		}
		
		System.out.println(ch+" repeated "+count+" times");

	}

}
