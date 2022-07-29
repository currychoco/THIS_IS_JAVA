package day5;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime()); //타임 스탬프 시간
		System.out.println(System.currentTimeMillis());
	}

}
