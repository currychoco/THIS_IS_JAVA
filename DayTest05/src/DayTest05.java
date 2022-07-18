
class Day{
	//��� ����
	//�ʱⰪ ����
	private int year = 2022;
	private int month = 1;
	private int date = 1;
	
	
	//��������� -> �����ϱ� ���� ������
	public Day(Day d) {
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	//�Ű������� ���� �ʴ� ������ -> ����Ʈ ������
	public Day() {
	}
	
	//�Ű������� 1�� ���� ������
	public Day(int year) {
		this.year = year;
	}
	
	//�Ű������� 2�� ���� ������
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}
		
	//�Ű������� 3�� ���� ������
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
	
	//��¥ ���� ��� �޼ҵ�
	public String printDay() {
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return String.format("%4d�� %02d�� %02d��(%s)", year, month, date, week[dayOfWeek()]);
	}
}

public class DayTest05 {
	public static void main(String[] args) {
		Day day1 = new Day(2022, 7, 18); //�Ű������� �� �� ���� ������->��, ��, ���� ����
		Day day2 = new Day(day1);//���� ������
		Day day3 = new Day(2022);//�Ű������� 1�� ���� ������->�⵵�� ����, ���� ���� 1�� ����
		Day day4 = new Day(2022, 7);//�Ű������� 2�� ���� ������-> ��, ���� ����, ���� 1�� ����
		Day day5 = new Day();//�Ű������� ���� �ʴ� ������->��,��,���� 1�� ����
		
		System.out.println(day1.printDay());
		System.out.println(day2.printDay());
		System.out.println(day3.printDay());
		System.out.println(day4.printDay());
		System.out.println(day5.printDay());
	}
}
