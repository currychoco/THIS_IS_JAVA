
public class SpringTest09 {
	public static void main(String[] args) {
		// 18. intern(): 내용이 같은 문자열 인스턴스가 각각 존재할 때, 이것을 하나의 인스턴스를 참조하도록 만듦
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-------------");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-------------");
		s1 = s1.intern();
		s2 = s2.intern();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-------------");
		
		// 19. valueOf(): static 메소드, 기본형 데이터를 문자열로 변경하는 메소드
		String s3 = String.valueOf(10);
		String s4 = String.valueOf(10.5);
		String s5 = String.valueOf(true);
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}
}
