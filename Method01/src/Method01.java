import java.util.Scanner;

/*
<�޼ҵ�(method)>
 - ��ɹ�, ������ ��Ƽ� ó���� �� �ֵ��� ��
 - �� ������ ������ �� �����ϰ� �޼ҵ带 ȣ���Ͽ� ����� �� ����
 - �ٸ� ���� �Լ�(function)�̶�� ��
 - �� �޼ҵ��  Ŭ���� �Ϻκ��� ��
 
 <�޼ҵ��� ����>
 -�޼ҵ� ����(����), �޼ҵ� ȣ��(���)
 
 <�޼ҵ��� ���� ��Ģ> - �ݵ�� ���Ѿ� �ϴ� ��Ģ
 1. �Ű������� ������ Ÿ���� �ݵ�� ��ġ�ؾ� ��
 2. ���ϰ��� �ݵ�� 1�� �Ǵ� 0������ �� 
 3. ���ϰ��� ����Ÿ���� �ݵ�� ��ġ�ؾ� ��
 
 */


// ����1) �� ���� ������ �Է��Ͽ� ������ �ϴ� ���α׷��� ����ÿ�

public class Method01 {
	//�޼ҵ� ���� / �޼ҵ� ����
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� a �Է�: ");
		int a = sc.nextInt();
		System.out.print("���� b �Է�: ");
		int b = sc.nextInt();
		
		//�޼ҵ�� ����
		//int c = a + b;
		
		//�޼ҵ� ȣ��
		int c = add(a, b);
		
		System.out.println("�հ� : " + c);
		
		sc.close();
	}
}
