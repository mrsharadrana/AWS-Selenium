package com.automation.aws.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DateUtils {
	public String name = null;
	@BeforeTest
	public String date() {
		SimpleDateFormat formatter = new SimpleDateFormat("YYYYMMDDHHMMss");
		Date date = new Date();
		name = formatter.format(date);
		
		return name;
		
	}
}
