package com.Ecommerce.generic.javautility;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNum() {
		Random random = new Random();
		int ranDomNumber = random.nextInt();
		return ranDomNumber;
	}

	public String getSystemDate() {

		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(dateobj);
		return date;
	}

	public String getReqiredDateYYYYDDMM(int days) {
		SimpleDateFormat sim = new SimpleDateFormat("YYYY-MM-DD");

		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reQdate = sim.format(cal.getTime());
		return reQdate;
	}

	public String localdataTime() {

		LocalDateTime time = LocalDateTime.now();
		String date = time.toString();
		String sysdate = date.replaceAll(":", "-");
		return sysdate;
	}

}
