import java.util.Scanner;

// ����1) ������ �Է��Ͽ� Ȧ������ ¦�������� �Ǻ��Ͻÿ�
// ����1) ������ �Է��Ͽ� 3�� ����̸鼭 4�� ��������� �Ǻ��Ͻÿ�
public class If02 {

	public static void main(String[] args) {
		System.out.print("���� �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 1��
		/*
		 * int sub = n % 2; if(sub == 0) { System.out.println("¦���Դϴ�."); } else {
		 * System.out.println("Ȧ���Դϴ�."); }
		 */

		// 2��
		int sub1 = n % 3;
		int sub2 = n % 4;

		if (sub1 == 0 && sub2 == 0) {
			System.out.println(n + "��(��) 3�� ����̸鼭, 4�� ����Դϴ�.");
		} else if (sub1 == 0 && sub2 != 0) {
			System.out.println(n + "��(��)3�� ���������, 4�� ����� �ƴմϴ�.");
		} else if (sub1 != 0 && sub2 == 0) {
			System.out.println(n + "��(��)4�� ���������, 3�� ����� �ƴմϴ�.");
		} else {
			System.out.println(n + "��(��)3�� ����̸鼭 4�� ����� �ƴմϴ�.");
		}

		sc.close();
	}
}
