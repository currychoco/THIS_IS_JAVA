import java.util.Scanner;

//����1) ���� 1���� �Է��Ͽ� �� ���� ����� ���ϰ�, ����� �հ�� ������ ����Ͻÿ�
public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, count = 0;

		System.out.println("���� �Է�: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
				sum += i;
				++count;
			}
		}
		
		System.out.printf("\n%d�� ����� �հ�: %d\n", n, sum);
		System.out.printf("%d�� ����� ����: %d\n", n, count);
		sc.close();
	}

}
