package StringsNew;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "Programming";

//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			int idx = str.indexOf(ch, i + 1);
//			if (idx == -1) {
//				sb.append(ch);
//			}
//		}
//		System.out.println("After Removing Dupliactes : " + sb);

		
		// Approch-2

		char ch[] = str.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			boolean repeate = false;

			for (int j = i + 1; j < str.length(); j++) {

				if (ch[i] == ch[j]) {
					repeate = true;
					break;
				}
			}
			if (!repeate) {
				sb2.append(ch[i]);

			}
		}
      System.out.println(sb2);
      
      
      
      
      //Approch-3
      
      StringBuilder sb3=new StringBuilder();
      
      str.chars().distinct().forEach(c -> sb3.append((char)c));
        
      System.out.println(sb3);
      
	}

}
