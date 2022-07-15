import java.util.Scanner;

//문제1) 정수 1개와 문자 1개를 입력하여 좌하변이 직각인 직각삼각형을 입력한 문자로 출력하는 프로그램을 작성하시오
//각 행을 출력하는 부분을 메소드로 만들어 사용하시오. 메소드명: putCh
/*
 -입력화면
 정수 입력: 5
 문자 입력: @
 
 -출력화면
 @
 @@
 @@@
 @@@@
 @@@@@

 */
public class Method04 {

	static void putCh(int n, char c) {
		for (int i = 1; i <= n; i++) {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char c;

		System.out.print("행 입력: ");
		n = sc.nextInt();
		System.out.print("문자 입력: ");
		c = sc.next().charAt(0);

		for (int i = 1; i <= n; i++) {
			putCh(i, c);
			System.out.println();
		}

		sc.close();
	}

}
