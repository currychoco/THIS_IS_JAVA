import java.util.Scanner;

class Day{
	//멤버 변수
	private int year;
	private int month;
	private int date;
	
	
	//복사생성자 -> 복사하기 위한 생성자
	public Day(Day d) {
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	//매개변수를 깆는 생성자
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	//멤버 메소드
	//getter
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	//setter
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	//년, 월, 일을 한꺼번에 설정하는 메소드
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	//요일을 계산하는 메소드
	//제리의 공식 = 0~6사이의 정수를 리턴
	//0: 일, 1: 월, 2: 화, 3:수, 4: 목, 5: 금, 6: 토
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if(m==1 || m==2) {
			m +=12;
		}
		return(y + y/4 - y/100 + y/400 + (13*m + 8)/5+d) % 7;
	}
}

public class DayTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("생년월일을 입력하시오.");
		System.out.print("년 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		System.out.print("일 입력: ");
		int date = sc.nextInt();
		
		
		Day birthday = new Day(year, month, date);
		
		//DayTest01에서 발현된 문제점을 해결
		Day xDay = new Day(birthday); //복사 생성자를 활용하여 복사도니 인스턴스를 생성함 -> 인스턴스의 복사
		xDay.set(2022, 7, 18); //복사한 인스턴스의 값을 변경하므로, birthday의 값은 유지하고, xDay의 값만 변경됨
		
		System.out.println("birthday = " + birthday.getYear() + "년 " +
				birthday.getMonth() + "월" + birthday.getDate() +
				"일(" + week[birthday.dayOfWeek()] + ")입니다.");
		
		System.out.println("    xDay = " + xDay.getYear() + "년 " +
				xDay.getMonth() + "월" + xDay.getDate() +
				"일(" + week[xDay.dayOfWeek()] + ")입니다.");
		
		sc.close();
	}
}
