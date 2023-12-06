package Strings;

public class Longest_Word {

	public static void main(String[] args) {

		String str = "I LOVE INDIA FOREVER";

		String w = "";
		str += " ";
		String lw = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') {
				w += c;

			} 
			else {
				if (w.length() > lw.length()) {
					lw = w;
					w = "";
				}
			}

		}
		System.out.println("Longest Word is : " + lw);
	}

}
