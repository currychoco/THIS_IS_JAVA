
public class SpringTest09 {
	public static void main(String[] args) {
		// 18. intern(): ������ ���� ���ڿ� �ν��Ͻ��� ���� ������ ��, �̰��� �ϳ��� �ν��Ͻ��� �����ϵ��� ����
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
		
		// 19. valueOf(): static �޼ҵ�, �⺻�� �����͸� ���ڿ��� �����ϴ� �޼ҵ�
		String s3 = String.valueOf(10);
		String s4 = String.valueOf(10.5);
		String s5 = String.valueOf(true);
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}
}
