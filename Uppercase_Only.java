package Strings;

public class Uppercase_Only {

	public static void main(String[] args) {

		String s = "My Name is Prasanth";
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
			
				System.out.println(c);
				count++;
			}

		}
		System.out.println(count + " - UpperCase Letters");

	}

}
