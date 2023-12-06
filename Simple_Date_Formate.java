package Srikanth;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_Date_Formate {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy, hh:mm:ss a");

		Date d = new Date();

		String str = sdf.format(d);
		System.out.println(str);

	}

}
