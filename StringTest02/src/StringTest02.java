

/*
 <lang 패키지>
 - 자바에서 필수적으로 사용하는 클래스들을 모아놓은 패키지
 - String, System. Object, Math, Exception...
 - lang패키지 안의 클래스들은 필수적으로 사용하게 되므로 import를 하지 않아도 자동으로 import하여 사용하도록 함
 */
import java.lang.String;
import java.lang.System;

public class StringTest02 {
	public static void main(String[] args) {
		/*
		//1번 방법 - 문자열의 내용이 같으면 새로운 문자열을 생성하는 것이 아니라 같은 곳을 참조하는 방법
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		*/
		
		//2번 방법 - 문자열의 내용이 같아도 매번 새로운 인스턴스를 생성하는 방법
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.toString());
		System.out.println("=============");
		
		//의문점: new로 새롭게 인스턴스를 생성한 s1과 s3는 해시코드가 다르게 나와야 하나, 결과는 같게 나옴
		//->String 클래스에서 hashCode를 오버라이딩해서 사용 -> 문자열의 값이 같다면 같은 해시코드값을 출력하도록 오버라이딩 함
		//해결책 -> 진짜 hashCode()를 출력하는 메소드를 System.identityHashCode() 메소드를 사용하여 진짜 해시코드 값을 확인함
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//System.identityHashCode(): 실제의 해시코드 값을 출력
		System.out.println("============");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

	}
}
