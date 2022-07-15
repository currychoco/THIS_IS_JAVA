import java.util.Scanner;

//문제1) x의 y승을 구하는 프로그램을 만드시오 
//x는 실수, y는 정수를 입력
//x의 y승을 계산하는 부분은 메소드를 생성하여 구현하시오. 메소드명: calcPower
public class Method03 {
	
	static double calcPower(double x, int y) {
		double result = 1;
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		int y;
		
		System.out.print("x(실수)값 입력: ");
		x = sc.nextDouble();
		System.out.print("y(정수)값 입력: ");
		y = sc.nextInt();
		
		double result = calcPower(x, y);
		
		System.out.printf("%.2f의 %d승은 %.4f", x, y, result);
		
		sc.close();
	}
}
