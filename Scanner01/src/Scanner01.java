//원의 면적과 둘레를 구하는 프로그램

//util 패키지 안에 있는 Scanner 클래스를 import 함
//Scanner 클래스의 역할: 콘솔로부터 값을 입력받는 클래스
//대화식으로 프로그램을 작성할 수 있음
import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		final double PI = 3.14;
		
		double area = PI * radius * radius;
		
		double perimeter = 2 * PI * radius;
		
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + perimeter);
		
		sc.close();

	}

}
