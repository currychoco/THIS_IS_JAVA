package iftest;

public class IfTest01 {
	public static void main(String[] args) {
		int n = 5;
		
		//���ϴ� �����ﰢ��
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j <= i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//�»�� �����ﰢ��
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j >= i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//���ϴ� �����ﰢ��
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//���� �����ﰢ��
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j < i) {
					System.out.print("  ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
