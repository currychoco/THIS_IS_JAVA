import java.util.Scanner;

//문제1) 정수 1개를 입력하여 그 수의 약수를 구하고, 약수의 합계와 개수를 출력하시오
public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, count = 0;

		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
				sum += i;
				++count;
			}
		}
		
		System.out.printf("\n%d의 약수의 합계: %d\n", n, sum);
		System.out.printf("%d의 약수의 개수: %d\n", n, count);
		sc.close();
	}

}
