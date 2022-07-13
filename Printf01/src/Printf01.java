
// printf() 메소드: formmating, 자릿수를 맞춰서 출력하는 메소드
// %: 서식문자(형식문자)
public class Printf01 {

	public static void main(String[] args) {
		
		// 1. 정수 출력 포메팅
		// %d: 정수 출력, decimal(십진수)
		int a = 34567;
		System.out.printf("%d\n", a);
		System.out.printf("%7d\n", a);
		System.out.printf("%10d\n", a);
		System.out.printf("%-10dHello\n", a);

		// 2. 실수 포멧팅
		// %f: 실수 찰력, float
		double b = 3.141592;
		System.out.printf("%f\n", b);
		System.out.printf("%.2f\n", b);
		System.out.printf("%.4f\n", b);
		System.out.printf("%7.2f\n", b);
		System.out.printf("%-7.2f자바\n", b);
		
		// 3. 문자 포매팅
		// %c: charater
		char c = 'A'; //2바이트
		System.out.printf("%c\n", c);
		System.out.printf("%5c\n", c);
		System.out.printf("%-5c자바\n", c);
		
		// 4. 문자열 포매팅
		// %s: string
		String s = "hello";
		System.out.printf("%10s\n", s);
		System.out.printf("%-10s자바\n", s);
		
		// 5. 8진수 출력, 16진수 출력
		// %o: octal, 8진수
		// %x: hexadecimal, 16진수
		int x = 9, y = 15;
		System.out.printf("%d %d\n", x, y);
		System.out.printf("%o %o\n", x, y);
		System.out.printf("%x %x\n", x, y);
		System.out.printf("%X %X\n", x, y);
		
		
	}

}
