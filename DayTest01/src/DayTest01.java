import java.util.Scanner;

//날짜 클래스
//멤버변수: 년, 월, 일
//생성자
//멤버메소드: getter/setter, 필요에 의해 만들어 사용하는 메소드
class Day{
	//멤버 변수
	private int year;
	private int month;
	private int date;
	
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
public class DayTest01 {
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
		
		//문제점: xDay는 birthday의 날짜를 복사하여, 그 복사된 날짜를 변경하였는가? - 아님
		Day birthday = new Day(year, month, date);
		Day xDay = birthday; // 복사 -> 실제로는 데이터의 복사가 아니라 birthday가 참조하는 곳을 xDay도 참조할 뿐임
		xDay.set(2022, 7, 18); // 변경 -> birthday가 참조하는 곳의 데이터를 xDay가 참조하고 있음
		
		System.out.println("birthday = " + birthday.getYear() + "년 " +
				birthday.getMonth() + "월" + birthday.getDate() +
				"일(" + week[birthday.dayOfWeek()] + ")입니다.");
		
		System.out.println("    xDay = " + xDay.getYear() + "년 " +
				xDay.getMonth() + "월" + xDay.getDate() +
				"일(" + week[xDay.dayOfWeek()] + ")입니다.");
		
		sc.close();
	}
}
