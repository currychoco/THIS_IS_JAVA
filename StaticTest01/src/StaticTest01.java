
//Ŭ���� ������ Ŭ���� �޼ҵ���  ��� ���� �׽�Ʈ
//�ν��Ͻ� �޼ҵ忡���� �ν��Ͻ� ����, Ŭ���� ����, �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� ��� ��� ����
//Ŭ���� �޼ҵ忡���� Ŭ���� ����, Ŭ���� �޼ҵ�� ��� �����ϳ�, �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ�� ����� �Ұ���
class Static{
	private static int s; //Ŭ��������, ���� �ʵ�
	private int i; //�ν��Ͻ� ����, ������ �ʵ�
	
	//Ŭ���� �޼ҵ�, ���� �޼ҵ�
	public static void sm1() {	}
	
	public static void sm2(int x) {
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	//�ν��Ͻ� �޼ҵ�, ������ �޼ҵ�
	public void im1() {	}
	
	public void im2(int x) {
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	//getter
	public static int getS() {
		return s;
	}
	
	public int getI() {
		return i;
	}
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		Static.sm2(20);
		
	}
}
