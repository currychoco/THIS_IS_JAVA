import java.util.Scanner;

/*
<메소드(method)>
 - 명령문, 수식을 모아서 처리할 수 있도록 함
 - 이 내용을 실행할 때 간단하게 메소드를 호출하여 사용할 수 있음
 - 다른 언어에서 함수(function)이라고도 함
 - 이 메소드는  클래스 일부분이 됨
 
 <메소드의 구성>
 -메소드 정의(생성), 메소드 호출(사용)
 
 <메소드의 정의 규칙> - 반드시 지켜야 하는 규칙
 1. 매개변수의 개수와 타입은 반드시 일치해야 함
 2. 리턴값은 반드시 1개 또는 0개여야 함 
 3. 리턴값과 리턴타입은 반드시 일치해야 함
 
 */


// 문제1) 두 개의 정수를 입력하여 덧셈을 하는 프로그램을 만드시오

public class Method01 {
	//메소드 생성 / 메소드 정의
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();
		
		//메소드로 변경
		//int c = a + b;
		
		//메소드 호출
		int c = add(a, b);
		
		System.out.println("합계 : " + c);
		
		sc.close();
	}
}
