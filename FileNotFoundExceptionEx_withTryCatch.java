package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionEx_withTryCatch {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("C:\\Users\\PRASANTH\\OneDrive\\Desktop\\360\\prasanth.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
