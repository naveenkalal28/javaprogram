package Exception_Handling;

public class Arithematic_Exception_WithTryCatch {

	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);		
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		
	}

}
