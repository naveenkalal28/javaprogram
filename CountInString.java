package StringsNew;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s=sc.nextLine();
		s=s.replace(" ", "");
		char a[]=s.toCharArray();
		Map<Character, Integer> map=new TreeMap<>();		
		for(int i=0;i<a.length;i++) 
		{
			int count=0;
			for(int j=0; j<a.length;j++)
			{
			    if(a[i]==a[j])
			    {
			    	count++;
			    
			    }
			}
			
			map.put(a[i],count);
		}
		System.out.println("Count of String :"+map);
		
	}

}
