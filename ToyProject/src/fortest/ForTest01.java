package fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// ���ϴ� �����ﰢ��
		
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//�»�� �����ﰢ��
		
		for(int i =0 ; i < n ;i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//���ϴ� �����ﰢ��
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//���� �����ﰢ��
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
