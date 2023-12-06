package Strings;

public class STRING_in_Multipleline {

	public static void main(String[] args) {

		String s="My Name is Prasanth";
		
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			System.out.println(c+" - "+(int)c);
		}
	}

}
