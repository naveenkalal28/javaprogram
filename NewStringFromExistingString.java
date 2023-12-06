package Strings;

public class NewStringFromExistingString {

	public static void main(String[] args) {


		String s="Prasanth Kumar";
		String s2="";
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
				s2=s2+c;
				
               			
		}
		System.out.println("Uppercase Letters Word :"+s2);

	}

}
