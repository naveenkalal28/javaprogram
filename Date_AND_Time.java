package Srikanth;

import java.util.Calendar;
import java.util.Date;

public class Date_AND_Time {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		

		// -->> SET-METHOD

//		cal.set(Calendar.DAY_OF_MONTH, 13);
//		cal.set(Calendar.MONTH, 6);
//		cal.set(Calendar.YEAR, 1999);
//		cal.set(Calendar.HOUR, 10);
//		cal.set(Calendar.MINUTE, 54);
//		cal.set(Calendar.SECOND, 12);
//		cal.set(Calendar.AM_PM, Calendar.AM);

		// ADD-METHOD

		cal.add(Calendar.DAY_OF_MONTH,-12);
		cal.add(Calendar.MONTH, 6);
		cal.add(Calendar.YEAR, 0);
		cal.add(Calendar.HOUR, -5);
		cal.add(Calendar.MINUTE, 2);
		cal.add(Calendar.SECOND, 2);
		cal.add(Calendar.AM_PM, Calendar.AM);

		// -->> GET-METHOD

		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("Day = " + day);

		int month = cal.get(Calendar.MONTH);
		System.out.println("Month = " + (month + 1));

		int year = cal.get(Calendar.YEAR);
		System.out.println("Year = " + year);

		int hours = cal.get(Calendar.HOUR);
		System.out.println("Hours = " + hours);

		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes = " + minutes);

		int seconds = cal.get(Calendar.SECOND);
		System.out.println("Seconds = " + seconds);
		Date d = cal.getTime();
		System.out.println(d);

		

	}

}
