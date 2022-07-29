package day5;
import java.util.*;
public class GregorianCalendarTest {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_YEAR)); //365일중 지나간 일수
		System.out.println(gc.get(Calendar.YEAR)); //년도
		System.out.println(gc.get(Calendar.MONTH)); //0부터 시작하는 달
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));//일
		System.out.println(gc.get(Calendar.DATE));//일
		System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));//오늘이 이번달에서 몇번째 요일인가
		System.out.println(gc.get(Calendar.DAY_OF_WEEK)); //요일(일요일부터)
		
		System.out.printf("%tY\n", gc);
		System.out.printf("%ty\n", gc);
		System.out.printf("%tm\n", gc);
		System.out.printf("%tb\n", gc);
		System.out.printf("%tH\n", gc);
		System.out.printf("%tM\n", gc);
		System.out.printf("%tS\n", gc);
		System.out.printf("%tA\n", gc);
		System.out.printf("%ta\n", gc);
	}
}
