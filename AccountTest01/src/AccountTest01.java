/*
 객체 지향 프로그래밍(Object Oriented Programming Language)
 
 -객체: 인간 세상의 모든 사물, 형태를 클래스로 만들어 정의한 것
 -특징: 사물이 가지는 속성 (변수)+ 행위(메소드)
 
 객체 지향의 세 가지 요소
 - 캡슐화(Encapulation,클래스), 상속(Inheritance), 다형성(polymorphism)
 
 은행 계좌 클래스
 -계좌명의, 계좌번호, 예금잔고
 
 은행 계좌를 클래스로 만들기 전 프로그램의 문제점
 1. 계좌의 정보를 변수명, 주석을 통해서 알 수 있음
 2. 한 사람의 계좌라면 하나로 묶어서 처리되어야 하지만 지금은 그렇지 않음
 3. 아무나 변수의 정보를 변경할 수 있음. 계좌명의, 계좌번호, 예금잔고를 누구나 변경할 수 있음
*/



public class AccountTest01 {
	public static void main(String[] args) {
		
		//john 계좌	
		String jhonAccountname="John";
		String johnAccountNo = "123456";
		int johnAccountBalance = 1000;
		
		
		//mary의 계좌
		String maryAccountName = "Mary";
		String maryAccountNo = "654321";
		int maryAccountBalance = 500;
		
		//johnAccountBalance -= 200;
		//maryAccountBalance += 100;
		
		System.out.println("* Jhon의 계좌");
		System.out.println("  계좌명의: " + jhonAccountname);
		System.out.println("  계좌번호: " + johnAccountNo);
		System.out.println("  예금잔고: " + johnAccountBalance);
		
		System.out.println("* Mary의 계좌");
		System.out.println("  계좌명의: " + maryAccountName);
		System.out.println("  계좌번호: " + maryAccountNo);
		System.out.println("  예금잔고: " + maryAccountBalance);
	}
}
