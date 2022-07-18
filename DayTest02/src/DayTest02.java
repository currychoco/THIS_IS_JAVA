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
}

public class DayTest02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] week = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		System.out.println("��������� �Է��Ͻÿ�.");
		System.out.print("�� �Է�: ");
		int year = sc.nextInt();
		System.out.print("�� �Է�: ");
		int month = sc.nextInt();
		System.out.print("�� �Է�: ");
		int date = sc.nextInt();
		
		
		Day birthday = new Day(year, month, date);
		
		//DayTest01���� ������ �������� �ذ�
		Day xDay = new Day(birthday); //���� �����ڸ� Ȱ���Ͽ� ���絵�� �ν��Ͻ��� ������ -> �ν��Ͻ��� ����
		xDay.set(2022, 7, 18); //������ �ν��Ͻ��� ���� �����ϹǷ�, birthday�� ���� �����ϰ�, xDay�� ���� �����
		
		System.out.println("birthday = " + birthday.getYear() + "�� " +
				birthday.getMonth() + "��" + birthday.getDate() +
				"��(" + week[birthday.dayOfWeek()] + ")�Դϴ�.");
		
		System.out.println("    xDay = " + xDay.getYear() + "�� " +
				xDay.getMonth() + "��" + xDay.getDate() +
				"��(" + week[xDay.dayOfWeek()] + ")�Դϴ�.");
		
		sc.close();
	}
}