package day5;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTimeTest2 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();		
		System.out.println("getMonth() = " + now.getMonth());
		System.out.println("getMonth() = " + now.getMonth().getDisplayName(
				TextStyle.FULL, Locale.KOREAN));		
		System.out.println("getDayOfWeek() = " + now.getDayOfWeek());
		System.out.println("getDayOfWeek() = " + now.getDayOfWeek().getDisplayName(
				TextStyle.FULL, Locale.KOREAN));
	}
}
