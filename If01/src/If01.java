
/*
 조건문 - 조건에 따라 다른 실행을 하도록 만드는 문
1. if문

2. switch-case문
 
 */

import java.util.Scanner;

// 문제)1. 콘솔로부터 정수를 입력하여 양수인지를 판별하시오
// 문제)2. 콘솔로부터 정수를 입력하여 양수인지 음수인지를 판별하시오
// 문제)3. 콘솔로부터 정수를 입력하여 양수, 음수, 0인지를 판별하시오
public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int n = sc.nextInt();

		// 1번 방법: 조건이 1개일 때
		/*
		 * if(n > 0) { System.out.println("양수입니다."); }
		 * 
		 * if(n < 0) { System.out.println("음수입니다."); }
		 */

		// 2번 방법: 조건이 2개일 때
		/*
		 * if (n > 0) { System.out.println("양수입니다."); } else {
		 * System.out.println("음수입니다."); } sc.close();
		 */
		
		// 3. 조건이 3개일 때
		/*
		 * if(n > 0) { System.out.println("양수입니다."); } else if(n < 0) {
		 * System.out.println("음수입니다."); } else if(n == 0){ System.out.println("0입니다.");
		 * }
		 */
		
		
		if(n > 0) {
			System.out.println("양수입니다.");
		} else if(n < 0) {
			System.out.println("음수입니다.");
		} else{
			System.out.println("0입니다.");
		}
		
		sc.close();
	}
}
