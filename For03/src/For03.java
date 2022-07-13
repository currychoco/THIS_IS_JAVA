import java.util.Scanner;

//문제3)정수 1개를 입력하여, 그 수의  팩토리얼을 구하시오.
//입력화면 설게: 정수 입력: 5
//출력화면 설계: 5! = 1 * 2 * 3 * 4 * 5 = 120
public class For03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.print(n + "! = ");
		for(int i = 1; i <= n; i++) {
			fact *= i;
			if(i == n) {
				System.out.println(i + " = " + fact);
			}else {
				System.out.print(i + " * ");
			}
		}
	
		sc.close();
	}
}
