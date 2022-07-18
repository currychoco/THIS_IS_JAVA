import java.util.Scanner;

class Day{
	//��� ����
	private int year;
	private int month;
	private int date;
	
	
	//��������� -> �����ϱ� ���� ������
	public Day(Day d) {
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	//�Ű������� ��� ������
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	//��� �޼ҵ�
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
	
	//��, ��, ���� �Ѳ����� �����ϴ� �޼ҵ�
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	//������ ����ϴ� �޼ҵ�
	//������ ���� = 0~6������ ������ ����
	//0: ��, 1: ��, 2: ȭ, 3:��, 4: ��, 5: ��, 6: ��
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if(m==1 || m==2) {
			m +=12;
		}
		return(y + y/4 - y/100 + y/400 + (13*m + 8)/5+d) % 7;
	}
	
	//�� ���� ��¥�� ���ϴ� �޼ҵ�
	public boolean isEqualDay(Day d) {
		return year==d.year && month==d.month && date==d.date;
	}
}

public class DayTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("��¥ 1�� �Է��Ͻÿ�. ");
		System.out.print("���Է�: ");
		y = sc.nextInt();
		System.out.print("���Է�: ");
		m = sc.nextInt();
		System.out.print("���Է�: ");
		d = sc.nextInt();	
		Day day1 = new Day(y, m, d);
		
		System.out.println("��¥ 2�� �Է��Ͻÿ�. ");
		System.out.print("���Է�: ");
		y = sc.nextInt();
		System.out.print("���Է�: ");
		m = sc.nextInt();
		System.out.print("���Է�: ");
		d = sc.nextInt();	
		Day day2 = new Day(y, m, d);
		
		//1. ���� ������ ���ϴ� ������ �� ���⿡ ���� ����
		/*
		if(day1.getYear()==day2.getYear() && day1.getMonth()==day2.getMonth() &&
				day1.getDate()==day2.getDate()) {
			System.out.println("�� ��¥�� �����ϴ�.");
		}else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		*/
		
		//2. �� �޼ҵ带 ����� Ȱ�� �� ���� �ν��Ͻ��� ���� ���ϴ� �޼ҵ带 ����� �����ؼ� ���->���� ��������
		if(day1.isEqualDay(day2)) {
			System.out.println("�� ��¥�� �����ϴ�.");
		}else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		
		sc.close();
	}
}
