package test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.Test;

public class GenerateDate {
	
	@Test
	public void generateCYear() {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		String strCMonth =	cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
		System.out.println(year+" "+strCMonth );
	}

}
