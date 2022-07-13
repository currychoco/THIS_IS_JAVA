/*
5. 비트 연산자: &(비트 AND), |(비트 OR), ^(Exclusive OR, XOR, 배타적 OR), ~(비트 NOT)
- 2진수로 계산하는 연산자
- &: 둘 다 1일 때 1로 계산하는 연산자
- |: 둘 중에 하나라도 1일 때 1로 계산하는 연산자
- ^: 둘 중에 하나만 1일 때 1로 계산하는 연산자
- ~: 1을 0으로, 0을 1로 변환하는 연산자

6. 쉬프트 연산자: <<(left shift), >>(right shift)
-2진수로  곱셈과 나눗셈을 하는 연산자

7. 조건 선택 연산자(삼항 연산자)? : -> 조건에 따라 참과 거짓을 판별하는 연산자 
-조건 ? 참 : 거짓
-조건문(if-else)의 대용으로 많이 사용됨

8. 대입 연산자, 복합 대입 연산자
- =: 대입 연산자, 오른쪽 값을 왼쪽 변수에 대입
- +=, -=, *=, /=, %= ... : 복합 대입 연산자(결합 연산자)


<연산자의 항(operand)에 따른 분류>
1. 단항 연산자: 항이 1개만 필요한 연산자
- !(논리 NOT), ~(비트 NOT), ++, --, +, -(부호 연산자)

2. 이항 연산자: 항이 2개 필요한 연산자
- 단항과 삼항을 제외한 거의 모든 연산자

3. 삼항 연산자: 항이 3개 필요한 연산자 -> 1개뿐. 조건 선택 연산자


<연산자의 우선순위>
1. 단항 연산자: +, -(부호), ++, --(증감), !(논리NOT), ~(비트NOT)

2. 산술 연산자: (*, /, %) > (+, -)

3. 쉬프트 연산자: <<, >>

4. 비교 연산자: (>, >=, <, <=) > (==, !=)

5. 비트 연산자: &, ^, |

6. 논리 연산자: &&, || <- 중요

7. 조건 선택 연산자: ? :
 
8. 대입 연산자, 복합 대입 연산자 


주로 사용하는 연산자의 우선순위: 증감, 산술, 비교, 논리, 대입(복합대입)


*/
public class Operator02 {

	public static void main(String[] args) {
		/*
		int a = 47, b = 73;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);

		int c = 4, d = 64;
		System.out.println(c << 4);
		System.out.println(d >> 3);
		
		
		int a = 10, b = 5, c;
		c = a>b ? a : b;
		System.out.println(c);
		*/
		
		//a에 b의 값을 더해서 a에 대입
		int a = 10, b = 20;
		a += b;
		System.out.println(a);
		
		//문제) a의 값을 1증가 시켜서 출력하시오. 4가지 방법
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		a = a + 1;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		
		
	}

}
