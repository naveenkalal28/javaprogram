package Strings;

public class String_Reverse {

	public static void main(String[] args) {

		String s1 = "Prasanth";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			s2 = c + s2;

		}
		System.out.println("Reversed String : " + s2);
	}

}
