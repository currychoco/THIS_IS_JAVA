import java.util.Scanner;
//import static java.lang.Math.PI;//클래드 메소드, 클래스 상수에 대해서 메소드명, 상수명 만으로 사용 가능한 방법
//import static java.lang.Math.sqrt;
//import static java.lang.Math.abs;
/*
 <자바의 long패키지>
 Math, System. String, Exception, Object, Tread
 자바를 사용할 때 자동으로 import하게 되어 있dlTdma
 */

//2 주문형 static import 방법
//클래스 메소드, 클래스 상수에 대해서 메소드명, 상수명만으로 사용 가능하도록 하는 방법
import static java.lang.Math.*;

//수학적인 계산이 많은 프로젝트
public class ImportTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		System.out.print("x 좌표값 입력: ");
		double x = sc.nextDouble();
		System.out.print("y 좌표값 입력: ");
		double y = sc.nextDouble();
		System.out.print("음수값 입력: ");
		int n = sc.nextInt();
		
		double area = Math.PI * radius * radius;
		double perimeter = 2 * Math.PI * radius;
		double distance = Math.sqrt(x*x + y*y);
		n = Math.abs(n);
		
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("거리: " + distance);
		System.out.println("절대값 : " + n);
		
		sc.close();
	}
}
