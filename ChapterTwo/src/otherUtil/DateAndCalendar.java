package otherUtil;

import java.util.*;

public class DateAndCalendar {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		Calendar calendar = Calendar.getInstance();
		System.out.println(months[calendar.get(Calendar.MONTH)]);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.DATE));
		GregorianCalendar grCl = new GregorianCalendar();
		System.out.println(grCl.isLeapYear(2019));
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz);
		System.out.println(Locale.getDefault());
		System
	}

}
