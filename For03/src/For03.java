import java.util.Scanner;

//����3)���� 1���� �Է��Ͽ�, �� ����  ���丮���� ���Ͻÿ�.
//�Է�ȭ�� ����: ���� �Է�: 5
//���ȭ�� ����: 5! = 1 * 2 * 3 * 4 * 5 = 120
public class For03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		System.out.print(n + "! = ");
		for(int i = 1; i <= n; i++) {
			fact *= i;
			if(i == n) {
				System.out.println(i + " = " + fact);
			}else {
				System.out.print(i + " * ");
			}
		}
	
		sc.close();
	}
}
