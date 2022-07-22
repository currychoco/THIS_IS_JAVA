
//String 클래스의 다양한 메소드 활용법

public class StringTest05 {
	public static void main(String[] args) {
		//글자수: 17, 인덱스: 0~16
		//			 012345678910111213141516
		String s1 = "Hello Java World!";
		
		// 1. charAt(index): 인덱스에 해당하는 한 문자를 리턴
		char c1 = s1.charAt(6);
		System.out.println(c1);
		
		// 2. concat(s): 두 개의 문자열을 연결하여 새로운 문자열을 생성
		// + 연산자로 문자열을 연결하는 것도 가능
		//String s2 = s1.concat("Korea~");
		String s2 = s1 + "Korea~";
		System.out.println(s2);
		
		// 3. contains(s): 문자열에서 찾고자 하는 문자열이 있을 때는 true, 없을 떄는 false를 리턴
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("JAVA"));
		System.out.println(s2.contains("Korea"));
		System.out.println(s2.contains("KOREA"));
	}
}
