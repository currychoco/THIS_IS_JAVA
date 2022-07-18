import java.util.Scanner;

//CarŬ����
//���� Ư¡: �̸�, ũ��(�ʺ�, ����, ����), �̵��Ÿ�, ����
// �������: name, width, height, length, x, y, fuel
//������: ��������� ���� �ʱ�ȭ
//����޼ҵ�: �ʿ��� �ʵ常 ����
//���� ��� �޼ҵ�
class Car{
	//��� ����
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	//�Ű������� ���� ������
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;	
		x = y = 0.0;
	}
	//getter
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	//setter
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	//���� ��� �޼ҵ�(�̸�, �ʺ�, ����, ����)
	public void putSpec() {
		System.out.println("�� �̸�: " + name);
		System.out.println("�� �ʺ�: " + width);
		System.out.println("�� ����: " + height);
		System.out.println("�� ����: " + length);
	}
	
	//�Ÿ� �̵� �޼ҵ�
	public boolean isMoved(double dx, double dy) {
		double distance = Math.sqrt(dx*dx + dy*dy);
		if(fuel >= distance) { //�̵� ���� -> ���ᷮ >= ������ �Ÿ�
			x += dx;
			y += dy;
			fuel -= distance;
			return true;
		}else {//�̵� �Ұ��� -> ���ᷮ < ������ �Ÿ�
			return false;
		}
	}
}

public class CarTest01 {
	public static void main(String[] args) {
		/*
		Car car1 = new Car("���̿���5", 1500, 1100, 2800, 100);
		Car car2 = new Car("���2023", 1600, 1400, 3000, 120);
		
		
		car1.putSpec();
		System.out.println();
		car2.putSpec();
		*/
		
		//2�� ���� ������ �Է��Ͽ� �ν��Ͻ��� �����ϰ� ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻÿ�.");
		System.out.print("�� �̸�: ");
		String name = sc.next();
		System.out.print("�� �ʺ�: ");
		int width = sc.nextInt();
		System.out.print("�� ����: ");
		int height = sc.nextInt();
		System.out.print("�� ����: ");
		int length = sc.nextInt();
		System.out.print("���ᷮ: ");
		double fuel = sc.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel);
		myCar.putSpec();
		
		//3�� ���� ���ᷮ���� �̵��Ÿ��� ����Ͽ�, ��ȭ������ �̵��ϵ��� ��� �޼ҵ带 �����, �ݺ����� ����Ͽ� ó���ϵ��� ���α׷��� �Ͻÿ�
		//�ݺ����� ����Ͽ� ó���ϵ��� ���α׷����Ͻÿ�
		
		//���ѷ���: while(true)���ǿ� ������ ��, for( ; true; ), for(;;)�ݺ� Ƚ���� ������ ��
		while(true) {
			System.out.println("������ġ: (" + myCar.getX() + ", " + myCar.getY() + "), ���� ���ᷮ: " + myCar.getFuel());
			System.out.print("��� �̵��Ͻðڽ��ϱ�?(Yes: 1, No: 0): ");
			int yn = sc.nextInt();
			if(yn == 0) {
				break;
			}
			
			System.out.print("x���� �̵��Ÿ�: ");
			double dx = sc.nextDouble();
			System.out.print("y���� �̵��Ÿ�: ");
			double dy = sc.nextDouble();
			
			if(!myCar.isMoved(dx, dy)) {
				System.out.println("���ᰡ �����մϴ�!");
			}
		}
		System.out.println("���� �����Ͽ����ϴ�.");
		
		sc.close();
	}
}
