package com.agilecrm.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
	public static String toDate(String dateString) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return (sdf.format(new Date(System.currentTimeMillis())));

}
}
