package puzzles2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test3 {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		int day = Integer.parseInt(dateFormat.format(cal.getTime()).substring(8,10));
		System.out.println(day);
		String s = "2016/11/30 14:09:54";
		int day1 = Integer.parseInt(s.substring(8,10));
		System.out.println(day1);
	}

}
