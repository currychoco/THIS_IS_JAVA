import java.util.Scanner;

//2���� �ݺ���, ��ø �ݺ���
public class For2D01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n =sc.nextInt();
		
		//1�� - ���簢��
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//2��) ���Ϻ��� ������ �����ﰢ�� 	}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		//2-2)
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j<=i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//3��) �»���� ������ �����ﰢ��
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//3-2��)

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();

		
		//4��) ���ϴ��� ������ �����ﰢ��
		for(int i=n; i>0; i--) {
			for(int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//4-2
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//5��) ������ ������ �����ﰢ��
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i;j++) {
				System.out.print("  ");
			}
			for(int j=n; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//5-2
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		sc.close();
	}
}
