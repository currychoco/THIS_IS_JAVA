//���� ������ �ѷ��� ���ϴ� ���α׷�

//util ��Ű�� �ȿ� �ִ� Scanner Ŭ������ import ��
//Scanner Ŭ������ ����: �ַܼκ��� ���� �Է¹޴� Ŭ����
//��ȭ������ ���α׷��� �ۼ��� �� ����
import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		double radius = sc.nextDouble();
		final double PI = 3.14;
		
		double area = PI * radius * radius;
		
		double perimeter = 2 * PI * radius;
		
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + perimeter);
		
		sc.close();

	}

}
