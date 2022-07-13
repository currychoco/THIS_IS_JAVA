import java.util.Scanner;

// 문제1) 정수를 입력하여 홀수인지 짝수인지를 판별하시오
// 문제1) 정수를 입력하여 3의 배수이면서 4의 배수인지를 판별하시오
public class If02 {

	public static void main(String[] args) {
		System.out.print("수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 1번
		/*
		 * int sub = n % 2; if(sub == 0) { System.out.println("짝수입니다."); } else {
		 * System.out.println("홀수입니다."); }
		 */

		// 2번
		int sub1 = n % 3;
		int sub2 = n % 4;

		if (sub1 == 0 && sub2 == 0) {
			System.out.println(n + "은(는) 3의 배수이면서, 4의 배수입니다.");
		} else if (sub1 == 0 && sub2 != 0) {
			System.out.println(n + "은(는)3의 배수이지만, 4의 배수는 아닙니다.");
		} else if (sub1 != 0 && sub2 == 0) {
			System.out.println(n + "은(는)4의 배수이지만, 3의 배수는 아닙니다.");
		} else {
			System.out.println(n + "은(는)3의 배수이면서 4의 배수가 아닙니다.");
		}

		sc.close();
	}
}
