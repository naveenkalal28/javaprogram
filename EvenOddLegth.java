package Strings;

public class EvenOddLegth {

	public static void main(String[] args) {
	
		String str="Hello Java what are you doing baby";
		System.out.println("Even Words...");
		
		for(String s: str.split(" "))
		{
			if(s.length()%2==0)
			{
				
				System.out.println(s);
			}
		}

	}

}
