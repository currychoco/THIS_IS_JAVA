import java.util.Scanner;

//����1) �� ���� ����(a, b)�� �Է��Ͽ�, a���� �׻� ���� ����, b���� �׻� ū ���� ����ǵ��� �Ͻÿ�
public class Swap01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� a �Է�: ");
		int a =sc.nextInt();
		System.out.print("���� b �Է�: ");
		int b =sc.nextInt();
		
		if(a> b) {
			int t = a;
			a = b;
			b = t;
			
		}
		
		System.out.println("a = " + a + ", b = " + b);
		sc.close();

	}

}
