import java.util.Scanner;
//import static java.lang.Math.PI;//Ŭ���� �޼ҵ�, Ŭ���� ����� ���ؼ� �޼ҵ��, ����� ������ ��� ������ ���
//import static java.lang.Math.sqrt;
//import static java.lang.Math.abs;
/*
 <�ڹ��� long��Ű��>
 Math, System. String, Exception, Object, Tread
 �ڹٸ� ����� �� �ڵ����� import�ϰ� �Ǿ� ��dlTdma
 */

//2 �ֹ��� static import ���
//Ŭ���� �޼ҵ�, Ŭ���� ����� ���ؼ� �޼ҵ��, ��������� ��� �����ϵ��� �ϴ� ���
import static java.lang.Math.*;

//�������� ����� ���� ������Ʈ
public class ImportTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		double radius = sc.nextDouble();
		System.out.print("x ��ǥ�� �Է�: ");
		double x = sc.nextDouble();
		System.out.print("y ��ǥ�� �Է�: ");
		double y = sc.nextDouble();
		System.out.print("������ �Է�: ");
		int n = sc.nextInt();
		
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		double distance = Math.sqrt(x*x + y*y);
		n = Math.abs(n);
		
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + perimeter);
		System.out.println("�Ÿ�: " + distance);
		System.out.println("���밪 : " + n);
		
		sc.close();
	}
}
