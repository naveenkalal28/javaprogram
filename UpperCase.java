package StringsNew;

public class UpperCase {

	public static void main(String[] args) {
		String Str="I Am a Bad Boy";		
		int count=0;
		System.out.println("Upper Case Letters :");
		for(int i=0; i<Str.length();i++) {
			char c=Str.charAt(i);			
			if(Character.isUpperCase(c)) {
				
				System.out.println(c);
				count++;
			}
		}
		;
		System.out.println("Count Of Upper Cases "+count);
	}

}
