/*
 변수(variable)와 상수(constant)
 1. 변수 - 값을 저장할 수 있도록 데이터 타입에 맞는 메모리 공간을 마련하고, 이름을 붙여 놓은 것
 - 값을 변경할 수 있음

 2. 상수 -  
 */

public class Variable02 {

	public static void main(String[] args) {

		double radius = 5.5;
		//final double PI = 3.14;	//상수를 만드는 방법, 상수는 전체를 대문자로 표현 권장
		final double PI;
		PI = 3.14;
		
		//PI = 3.55
		
		System.out.println("반지름: " + radius + "\n원주율: " + PI);
	}

}
