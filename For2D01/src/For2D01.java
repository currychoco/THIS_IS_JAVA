import java.util.Scanner;

//2차원 반복문, 중첩 반복문
public class For2D01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int n =sc.nextInt();
		
		//1번 - 정사각형
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		//2번) 좌하변이 직각인 직각삼각형 	}
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
		
		//3번) 좌상단이 직각인 직각삼각형
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//3-2번)

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

		
		//4번) 우하단이 직각인 직각삼각형
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
		
		//5번) 우상단이 직각인 직각삼각형
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
