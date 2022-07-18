/*
 <this의 사용법>
 1. this.멤버변수 -> 자신의 클래스 내에서 자신의 멤버변수를  참조하는 방법
 2. this() -> 자신의 클래스 내에서 생성자를 호출하는 방법
 
 <this()사용하는 장점>
 -코드를 간결하게 함
 -멤버변수의 값을 하나의 생성자에서 값을 결정하도록 함 -> 멤버 변수의 값을 설정하는 곳이 1군데로 귀결됨
 */
class Day{
	//멤버 변수
	//초기값 설정
	private int year = 2022;
	private int month = 1;
	private int date = 1;
	
	
	//복사생성자 -> 복사하기 위한 생성자
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	//매개변수를 갖지 않는 생성자 -> 디폴트 생성자
	public Day() {
	}
	
	//매개변수를 1개 갖는 생성자
	public Day(int year) {
		this.year = year;
	}
	
	//매개변수를 2개 갖는 생성자
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
		
	//매개변수를 3개 갖는 생성자
	public Day(int year, int month, int date) {
		this(year, month);
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
	
	//두 개의 날짜를 비교하는 메소드
	public boolean isEqualDay(Day d) {
		return year==d.year && month==d.month && date==d.date;
	}
	
	//날짜 정보 출력 메소드
	public String printDay() {
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		return String.format("%4d년 %02d월 %02d일(%s)", year, month, date, week[dayOfWeek()]);
	}
}

public class DayTest05 {
	public static void main(String[] args) {
		Day day1 = new Day(2022, 7, 18); //매개변수를 세 개 갖는 생성자->년, 월, 일을 설정
		Day day2 = new Day(day1);//복사 생성자
		Day day3 = new Day(2022);//매개변수를 1개 갖는 생성자->년도를 설정, 월과 일은 1로 설정
		Day day4 = new Day(2022, 7);//매개변수를 2개 갖는 생성자-> 년, 월을 설정, 일은 1로 설정
		Day day5 = new Day();//매개변수를 갖지 않는 생성자->년,월,일을 1로 설정
		
		System.out.println(day1.printDay());
		System.out.println(day2.printDay());
		System.out.println(day3.printDay());
		System.out.println(day4.printDay());
		System.out.println(day5.printDay());
	}
}
