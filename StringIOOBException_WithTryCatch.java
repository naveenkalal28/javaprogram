package Exception_Handling;

public class StringIOOBException_WithTryCatch {

	public static void main(String[] args) {
		
		try{
			String str="Prasanth";
			char ch=str.charAt(9);
			System.out.println(ch);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
