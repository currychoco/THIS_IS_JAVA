/*
 �����ε�(Overloading)
 -�޼ҵ��� ��������
 -�޼ҵ��� �̸��� ������ �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �����ϴ� ��

 ����)
 -�Ű������� �̸��� �ٸ� ���� �����ε��� ���Ե��� ����
 -���� Ÿ�Ե� �����ε��� ���Ե��� ����
 
*/
public class Method07 {
	//���� 2���� ���ؼ� �����ϴ� �޼ҵ�
	static int add(int a, int b) {
		return a + b;
	}
	
	//�ߺ� ���� ->�����߻�
	/*
	static int add(int x, int y) {
		return x + y;
	}
	*/
	
	//�ߺ�����->�����߻�
	/*
	static int add(double x, double y) {
		return (int)(x + y);
	}
	*/
	
	static double add(double a, double b) {
		return a + b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("���� 2�� ����: " + add(10, 20));
		System.out.println("�Ǽ� 2�� ����: " + add(3.5, 7.2));
	}

}
