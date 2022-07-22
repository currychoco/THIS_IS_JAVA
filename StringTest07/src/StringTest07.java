
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length(): 문자열의 길이를 알려줌
		System.out.println("길이: " + s1.length()); //배열에서 쓰던 length랑 다르다고?
		System.out.println("----------");
		
		// 9. replace(old, new): 문자열에서 특정 문자열을 새로운 문자열로 모두 다 변경
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Python");
		System.out.println(s1);
		s1 = s1.replace("l", "L"); //모든 소문자 'l'을 대문자 'L'로 변경
		System.out.println(s1);
		System.out.println("----------");
		
		// 10. replaceFirst(old, new): 문자열에서 특정 문자열을 첫번째로 나오는 문자열만 변경
		s1 = s1.replaceFirst("o", "O"); //첫 번째 소문자 'o'만 대문자 'O'로 변경
		System.out.println(s1);
		System.out.println("----------");
		
		// 11. toUpperCase(): 문자열에서 모든 문자를 대문자로 변경
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println("----------");
		
		// 12. toLowerCase(): 문자열에서 모든 문자를 소문자로 변경
		s1 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println("----------");
		
		// 13. trim(): 문자열의 앞뒤의 공백을 제거, 중간에 있는 공백은 제거하지 않음
		String s2 = "     Hello     Java     ";
		System.out.println(s2 + "*");
		s2 = s2.trim();
		System.out.println(s2 + "*");
		System.out.println("----------");
		
		// 14. equals(s): 문자열의 값을 비교하여 true, false를 알려줌
		String s3 = new String("ABC");
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		System.out.println(s3 == s5); // 문자열의 참조 비교
		System.out.println(s3.equals(s5)); // 문자열의 값 비교
		System.out.println(s3.equals(s4));
		
		// 15. equalsIgnoreCase(): 대소문자 구분없이 비교
		String s6 = "abc";
		System.out.println(s3.equals(s6)); //대소문자 구분하여 비교
		System.out.println(s3.equalsIgnoreCase(s6));
		
	}
}
