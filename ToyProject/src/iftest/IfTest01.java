package iftest;

public class IfTest01 {
	public static void main(String[] args) {
		int n = 5;
		
		//좌하단 직각삼각형
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
		
		//좌상단 직각삼각형
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
		
		//우하단 직각삼각형
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
		
		//우상단 직각삼각형
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
