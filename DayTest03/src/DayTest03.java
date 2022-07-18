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
	
	//두 개의 날짜를 비교하는 메소드
	public boolean isEqualDay(Day d) {
		return year==d.year && month==d.month && date==d.date;
	}
}

public class DayTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("날짜 1을 입력하시오. ");
		System.out.print("년입력: ");
		y = sc.nextInt();
		System.out.print("월입력: ");
		m = sc.nextInt();
		System.out.print("일입력: ");
		d = sc.nextInt();	
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜 2를 입력하시오. ");
		System.out.print("년입력: ");
		y = sc.nextInt();
		System.out.print("월입력: ");
		m = sc.nextInt();
		System.out.print("일입력: ");
		d = sc.nextInt();	
		Day day2 = new Day(y, m, d);
		
		//1. 답은 맞지만 비교하는 수식이 길어서 보기에 좋지 않음
		/*
		if(day1.getYear()==day2.getYear() && day1.getMonth()==day2.getMonth() &&
				day1.getDate()==day2.getDate()) {
			System.out.println("두 날짜는 같습니다.");
		}else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		//2. 비교 메소드를 만들어 활용 두 개의 인스턴스의 값을 비교하는 메소드를 멤버로 선언해서 사용->식이 간결해짐
		if(day1.isEqualDay(day2)) {
			System.out.println("두 날짜는 같습니다.");
		}else {
			System.out.println("두 날짜는 다릅니다.");
		}
		
		sc.close();
	}
}
