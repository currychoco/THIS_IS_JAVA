package fortest;

public class ForTest01 {

	public static void main(String[] args) {
		// 좌하단 직각삼각형
		
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//좌상단 직각삼각형
		
		for(int i =0 ; i < n ;i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//우하단 직각삼각형
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
		
		//우상단 직각삼각형
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
