
//����(Random Number) �����
//��������
//Math.random(): 0���� 1�̸��� ������ ����, 0 ~ 0.999999...
public class Random01 {
	public static void main(String[] args) {
		
		//1. 0 ~ 9 ������ ����
		//int rn = (int)(Math.random() * 10);
		
		//2. 1 ~ 10 ������ ����
		//int rn = (int)(Math.random() * 10) + 1;
		
		//3. �� �ڸ����� ����, 10 ~ 99������ ����
		int rn = (int)(Math.random() * 90) + 10;
		
		System.out.println(rn);
		System.out.println(Math.PI);
	}

}
