import java.util.Scanner;

//����1) ���� 1���� ���� 1���� �Է��Ͽ� ���Ϻ��� ������ �����ﰢ���� �Է��� ���ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//�� ���� ����ϴ� �κ��� �޼ҵ�� ����� ����Ͻÿ�. �޼ҵ��: putCh
/*
 -�Է�ȭ��
 ���� �Է�: 5
 ���� �Է�: @
 
 -���ȭ��
 @
 @@
 @@@
 @@@@
 @@@@@

 */
public class Method04 {

	static void putCh(int n, char c) {
		for (int i = 1; i <= n; i++) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char c;

		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		System.out.print("���� �Է�: ");
		c = sc.next().charAt(0);

		for (int i = 1; i <= n; i++) {
			putCh(i, c);
			System.out.println();
		}

		sc.close();
	}

}
