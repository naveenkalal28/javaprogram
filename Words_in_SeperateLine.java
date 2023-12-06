package Strings;

public class Words_in_SeperateLine {

	public static void main(String[] args) {

       String str="I LOVE INDIA";
       
       String w=""; str+=" ";
      for(int i=0; i<str.length(); i++)
      {
    	  char c=str.charAt(i);
    	  if(c !=' ')
    	  
    	     w +=c;
    	   
    	  
    	  else {
    		 if(w.startsWith("I")) {
    			System.out.println(w);
    		 }
    	      w="";
    	  }
      }
	}

}
