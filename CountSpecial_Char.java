package Strings;

public class CountSpecial_Char {

	public static void main(String[] args) {

		String s = "V@#NG^&BKJ*&HUB";
      //  String SpecialCharacterRemoved=" ";
		int count = 0;
		for (int i = 1; i < s.length(); i++) {

			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
                    count++;
			}
		//	else
		//		SpecialCharacterRemoved=SpecialCharacterRemoved + s.charAt(i);
		}
		if(count==0)
			System.out.println("Not found");
		else
		System.out.println("Special Characters are : "+count);

	//	System.out.println("Special Character Removed "+SpecialCharacterRemoved);
	}
	

}
