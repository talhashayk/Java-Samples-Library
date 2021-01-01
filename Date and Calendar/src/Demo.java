import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Demo {

	public static String getDOB(int dayDOB, int monthDOB, int yearDOB) {

		Calendar cal = new GregorianCalendar();

		DateFormat df = new SimpleDateFormat("dd:MMM:yyyy");

		cal.set(Calendar.DAY_OF_MONTH, dayDOB);
		cal.set(Calendar.MONTH, (monthDOB - 1));
		cal.set(Calendar.YEAR, yearDOB);

		return df.format(cal.getTime());
	}

	public static void main(String[] args) {

		/*
		 * Date date = new Date(); System.out.println(date); // Prints current date and
		 * time System.out.println(date.getTime()); // prints the amount of milliseconds
		 * from 1970
		 * 
		 * DateFormat sdf = new SimpleDateFormat("E yyyy/MMM dd HH:mm-ss");
		 * System.out.println(sdf.format(date));
		 * 
		 * System.out.println();
		 * 
		 * Calendar cal = new GregorianCalendar(); cal.set(Calendar.MILLISECOND, 0);
		 * cal.set(Calendar.SECOND, 0); cal.set(Calendar.MINUTE, 0);
		 * cal.set(Calendar.HOUR, -12); System.out.println(cal.getTime());
		 * 
		 * System.out.println();
		 */

		System.out.println(getDOB(1, 02, 1999));

	}

}
