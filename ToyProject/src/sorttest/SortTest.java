package sorttest;

public class SortTest {
	public static void main(String[] args) {

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100) + 1;
		}

		/*
		// 선택정렬
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}

			System.out.printf("%d번 회전 후: ", i + 1);
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
		}
		*/

		
		// 버블정렬
		for (int i = 0; i < a.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < (a.length - 1) -i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					flag = true;
				}
			}
			if(!flag) {
				break;
			}
			System.out.printf("%d회전: ", i+1);
			for(int j = 0; j < a.length; j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
		}
		
	}
}
