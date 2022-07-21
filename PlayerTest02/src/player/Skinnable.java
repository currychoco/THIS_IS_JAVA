package player;

/*
 <�������̽� ��Ģ>
 1. �������̽��� �߻� �޼ҵ常�� ����
 2. �Ϲ����� ������ ���� ���ϰ� �ݵ�� static ������� ����
 3. public static final�� ���� ����
 
 <�������̽� �̸��� ���� ���>
 1. Ŭ���� �̸�ó�� ���� ����
 2. �������̽� �߿����� Ŭ������ �ٸ��ִ�, �����ϴ� ������ �������̽� �̸��� ~albe�� �ٿ��� ����� ���� ����
 ex)runnable, clonnable...
 */
public interface Skinnable {
	
	/*public static final*/ int RED = 1; // 
	int BLUE =2;
	int GREEN = 3;
	int BLACK = 4;
	int LEOPARD = 5;
	
	void changeSkin(int skin);
}
