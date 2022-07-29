package day5;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("getYear() = " + now.getYear());
		System.out.println("getMonth() = " + now.getMonth());
		System.out.println("getDayOfMonth() = " + now.getDayOfMonth());
		System.out.println("getDayOfWeek() = " + now.getDayOfWeek());
		System.out.println("getDayOfYear() = " + now.getDayOfYear());
		System.out.println("getHour() = " + now.getHour());
		System.out.println("getMinute() = " + now.getMinute());
		System.out.println("getSecond() = " + now.getSecond());
		System.out.println("---------------------------");
		LocalDateTime xmas = LocalDateTime.of(2022, 12, 25, 10, 30, 0);
		System.out.println("getYear() = " + xmas.getYear());
		System.out.println("getMonth() = " + xmas.getMonth());
		System.out.println("getDayOfMonth() = " + xmas.getDayOfMonth());
		System.out.println("getDayOfWeek() = " + xmas.getDayOfWeek());
		System.out.println("getDayOfYear() = " + xmas.getDayOfYear());
		System.out.println("getHour() = " + xmas.getHour());
		System.out.println("getMinute() = " + xmas.getMinute());
		System.out.println("getSecond() = " + xmas.getSecond());

	}

}
