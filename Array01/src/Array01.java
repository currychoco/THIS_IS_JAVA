
/*
 �迭(Array) - ���� Ÿ���� ������ ����
 ���� - �ݺ����� ���� �ϰ� ó�� ����
 */
public class Array01 {
	public static void main(String[] args) {
		//1�� ���
		//int[] a; // int���� �����Ͱ� �ִ� ���� �����ϴ� 1���� �迭�� �������� a
		//a = new int[5];//int���� �����Ͱ� 5�� �ְ�, �� �����͸� �������� a�� �����ϰ� ����
		
		//2�� ���
		int[] a = new int[5];
		
		//�迭�� ���� ����
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//a.length = 10; ����� ������ �����ϴ� length ������ ���� ������ �� ����
		
		//�ݺ����� ����Ͽ� �迭�� ���� ���
		for(int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		/*
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]); ���� �߻�: �迭�� ������ 5�̸� a[0]~a[4]���� ����, a[5]�� ����		
		*/
		
		
	}

}
