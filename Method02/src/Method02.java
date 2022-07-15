import java.util.Scanner;

public class Method02 {
	
	//원의 면적을 계산하는 메소드
	static double calcArea(double r){
		double area = Math.PI * r * r;
		return area;
	}
	
	//원의 둘레를 계산하는 메소드
	static double calcPerimeter(double r){
		double perimeter = 2 * Math.PI * r;
		return perimeter;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radius = 0.0;
		
		System.out.print("반지름 입력: ");
		radius = sc.nextDouble();
		
		double area = calcArea(radius);
		double perimeter = calcPerimeter(radius);
		
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + perimeter);
		
		
		
		
		sc.close();
	}

}
