import java.util.Scanner;

public class Method02 {
	
	//���� ������ ����ϴ� �޼ҵ�
	static double calcArea(double r){
		double area = Math.PI * r * r;
		return area;
	}
	
	//���� �ѷ��� ����ϴ� �޼ҵ�
	static double calcPerimeter(double r){
		double perimeter = 2 * Math.PI * r;
		return perimeter;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius = 0.0;
		
		System.out.print("������ �Է�: ");
		radius = sc.nextDouble();
		
		double area = calcArea(radius);
		double perimeter = calcPerimeter(radius);
		
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + perimeter);
		
		
		
		
		sc.close();
	}

}
