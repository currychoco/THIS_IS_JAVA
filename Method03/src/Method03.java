import java.util.Scanner;

//����1) x�� y���� ���ϴ� ���α׷��� ����ÿ� 
//x�� �Ǽ�, y�� ������ �Է�
//x�� y���� ����ϴ� �κ��� �޼ҵ带 �����Ͽ� �����Ͻÿ�. �޼ҵ��: calcPower
public class Method03 {
	
	static double calcPower(double x, int y) {
		double result = 1;
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		int y;
		
		System.out.print("x(�Ǽ�)�� �Է�: ");
		x = sc.nextDouble();
		System.out.print("y(����)�� �Է�: ");
		y = sc.nextInt();
		
		double result = calcPower(x, y);
		
		System.out.printf("%.2f�� %d���� %.4f", x, y, result);
		
		sc.close();
	}
}
