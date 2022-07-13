/*

 연산자(operator)-<연산자의 기능에 따른 분류>
 1. 산술 연산자: + , -, *, /(몫), %(나머지)
 - *, /, %가 +, -보다 우선순위가 높음
 
 2. 증감 연산자: ++(증가), --(감소), 자신의 값을 1증가 또는 1감소하는 연산자 
 - 위치에 따라: 전위 증감 연산자, 후위 증감 연산자 
 - 전위일 때는 변수의 값을 먼저 1증가 혹은 감소시키고 대입(참조)
 - 후위일 때는 먼저 대입(참조)하고 자신의 값을 1증가 또는 감소 
 
 3. 비교 연산자: >, >=, <, <=, ==, !=, instanceof
 - 비교 연산의 결과는 항상 true, false 둘 중의 하나
 - >, >=,<, <=가 ==, !=보다 우선순위가 높음
 
 4. 논리 연산자: &&(논리 AND, 논리곱), ||(논리 OR, 논리합 ), !(논리 NOT, 논리부정)
 - 논리 연산의 결과는 항상 true, false 둘 중의 하나
 - 비교 연산자와 함께 많이 사용함 
 - &&: 두 개의 항이 모두 true일 때 전체 겨로가가 true가 됨
 - ||: 두 개의 항 중에서 하나라도 true라면 전체 결과가 true가 됨
 - ! : true를 false로, false를 true로 
 - &&가 ||보다 우선순위가 높음
 
 */
public class Operator01 {

	public static void main(String[] args) {

		// 1. 산술 연산자
		System.out.println(3 + 5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3);
		System.out.println(10 % 3);

		// 2. 증감 연산자
		int a = 10, b;

		b = a--;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// 3. 비교 연산자
		int c = 10, d = 20;
		System.out.println(c > d);
		System.out.println(c < d);
		System.out.println(c == d);
		System.out.println(c != d);
		System.out.println(c = d);

		// 4. 논리 연산자
		//비교 연산자가 논리 연산자보다 우선순위 높음
		int e = 10, f = 20, g = 30, h = 40;
		System.out.println(e < f && g < h);
		System.out.println(e < f && g > h);	
		System.out.println(e > f && g > h);
		
		System.out.println(e < f || g < h);
		System.out.println(e < f || g > h);	
		System.out.println(e > f || g > h);
		
		System.out.println(!(e < f));


	}
	
}
