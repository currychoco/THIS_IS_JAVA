
/*
 ���ǹ� - ���ǿ� ���� �ٸ� ������ �ϵ��� ����� ��
1. if��

2. switch-case��
 
 */

import java.util.Scanner;

// ����)1. �ַܼκ��� ������ �Է��Ͽ� ��������� �Ǻ��Ͻÿ�
// ����)2. �ַܼκ��� ������ �Է��Ͽ� ������� ���������� �Ǻ��Ͻÿ�
// ����)3. �ַܼκ��� ������ �Է��Ͽ� ���, ����, 0������ �Ǻ��Ͻÿ�
public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		int n = sc.nextInt();

		// 1�� ���: ������ 1���� ��
		/*
		 * if(n > 0) { System.out.println("����Դϴ�."); }
		 * 
		 * if(n < 0) { System.out.println("�����Դϴ�."); }
		 */

		// 2�� ���: ������ 2���� ��
		/*
		 * if (n > 0) { System.out.println("����Դϴ�."); } else {
		 * System.out.println("�����Դϴ�."); } sc.close();
		 */
		
		// 3. ������ 3���� ��
		/*
		 * if(n > 0) { System.out.println("����Դϴ�."); } else if(n < 0) {
		 * System.out.println("�����Դϴ�."); } else if(n == 0){ System.out.println("0�Դϴ�.");
		 * }
		 */
		
		
		if(n > 0) {
			System.out.println("����Դϴ�.");
		} else if(n < 0) {
			System.out.println("�����Դϴ�.");
		} else{
			System.out.println("0�Դϴ�.");
		}
		
		sc.close();
	}
}
