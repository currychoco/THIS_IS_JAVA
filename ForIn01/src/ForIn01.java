
//enhanced for��(���� for��), Ȯ�� for��, for-in��, for-each��
//Ȯ�� for���� Ư¡
//1. �ε����� �����Ƿ� �κ����δ� ����� �� ����, ��� ��Ҹ� ��ȸ�ϸ鼭 ����ϰ��� �� �� ���
//2. �ε����� �����Ƿ� ���� ������ �� ����

public class ForIn01 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();

		// Ȯ�� for��
		for (int i : a) {
			System.out.println(i);
		}

		double[] d = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		//�⺻ for��
		for(int i =0; i<d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		
		//Ȯ�� for��
		for(double x : d) {
			System.out.println(x);
		}
	}

}
