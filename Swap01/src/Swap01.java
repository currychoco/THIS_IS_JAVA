import java.util.Scanner;

//문제1) 두 개의 정수(a, b)를 입력하여, a에는 항상 작은 수가, b에는 항상 큰 수가 저장되도록 하시오
public class Swap01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a =sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b =sc.nextInt();
		
		if(a> b) {
			int t = a;
			a = b;
			b = t;
			
		}
		
		System.out.println("a = " + a + ", b = " + b);
		sc.close();

	}

}
