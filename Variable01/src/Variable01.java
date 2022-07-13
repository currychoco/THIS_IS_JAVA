/*
 변수(Variable)
 - 값을 저장하는 공간
 
 변수의 초기화
 - 변수를 선언하고, 변수에 최초로 값을 대입하는 것
 
 =================================================
 변수의 타입(종류)
 1. 기본형(primitive type)
 (1) 정수형
 - byte: 1Byte 2의 8승 (-128 ~ 127)
 - short: 2Byte 2의 16승 (-32768 ~ 32767)
 - int: 4Byte 2의 32승 (-2147482648 ~ 2147483647)
 - long: 8Byte 2의 64승 (~900경 ~ 900경)
 
 (2) 실수형 - 부동소수점형, 소수점이 있는 수
 - float : 4Byte, 소수점 이하 6~7자리까지 정확도를 보장
 - double: 8Byte, 소수점 이하 15~16자리까지 정확도를 보장
 
 문자 - 1문자, 홀따옴표 표시((''), ex) 'A', 'ABC'<-틀림) 
 문자열 - 문자의 나열, 여러 문자, 쌍따옴표 표시((""), ex) "Hello", "A")
 (3) 문자형 - 문자를 저장하기 위함
 - char : 2Byte
 
 (4) 논리형 - true(예, T), false(아니오, F)로 표현하는 데이터 타입 
 - boolean: 1Byte
================================================= 
 
 2. 참조형(reference type)
 -객체 지향에서 본격적으로 다룸
 =================================================
 
 <변수의 명명법>
 
 --반드시 지켜야 할 규칙--
 1. 영어 대소문자, 숫자, 기호(_, $): $(시스템에서 내부적으로 사용하는 기호, 개발자는 사용하지 않음)
 2. 영어 대문자와 소문자는 구분해서 사용
 3. 숫자는 변수의 첫글자로는 사용불가
 4. 공백은 사용 불가
 
 --권장하는 방법--
 1. 변수명은 의미있게 생성 ex) int score; int age;
 2. 한글은 사용하지 않도록 함
 
 --자바에서 변수명을 만드는 방법--
 int maxScoreGame; -> 카멜(camel) 표기법
 int max_score_game; -> 스네이크(snake) 표기법
 int imaxxcoregame; -> i:int, 헝그리안 표기법(C언어 계열에서 많이 사용)
 
*/
public class Variable01 {

	public static void main(String[] args) {
		// 1번 방법 - 변수를 선언, 값을 대입
		// int a; //변수 선언 - 정수를 저장할 수 있는 4byte의 공간을 마련
		// a = 10;//값을 대입 - a라는 변수에 10을 대입
		// int b;
		// b = 20;

		// 2번 방법 - 변수를 선언하고 바로 값을 대입
		// int a = 10; // 변수를 선언하고, 값을 대입
		// int b = 20;

		// 3번 방법 - 여러 개의 변수를 선언하고, 초기화
		int a = 10, b = 20;

		// + 연산자의 2가지 역할: 1. 더하기, 2. 문자열을 연결(연결 연산자)
		// System.out.println("a = " + a);
		// System.out.println("b = " + b);

		System.out.println("a = " + a + "\nb = " + b);
	}
}
