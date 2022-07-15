/*
 오버로딩(Overloading)
 -메소드의 다중정의
 -메소드의 이름은 같지만 매개변수의 개수 또는 타입을 다르게 정의하는 것

 주의)
 -매개변수의 이름이 다른 것은 오버로딩에 포함되지 않음
 -리턴 타입도 오버로딩에 포함되지 않음
 
*/
public class Method07 {
	//정수 2개를 더해서 리턴하는 메소드
	static int add(int a, int b) {
		return a + b;
	}
	
	//중복 정의 ->에러발생
	/*
	static int add(int x, int y) {
		return x + y;
	}
	*/
	
	//중복정의->에러발생
	/*
	static int add(double x, double y) {
		return (int)(x + y);
	}
	*/
	
	static double add(double a, double b) {
		return a + b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("정수 2개 덧셈: " + add(10, 20));
		System.out.println("실수 2개 덧셈: " + add(3.5, 7.2));
	}

}
