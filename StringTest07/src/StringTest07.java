
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length(): ���ڿ��� ���̸� �˷���
		System.out.println("����: " + s1.length()); //�迭���� ���� length�� �ٸ��ٰ�?
		System.out.println("----------");
		
		// 9. replace(old, new): ���ڿ����� Ư�� ���ڿ��� ���ο� ���ڿ��� ��� �� ����
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Python");
		System.out.println(s1);
		s1 = s1.replace("l", "L"); //��� �ҹ��� 'l'�� �빮�� 'L'�� ����
		System.out.println(s1);
		System.out.println("----------");
		
		// 10. replaceFirst(old, new): ���ڿ����� Ư�� ���ڿ��� ù��°�� ������ ���ڿ��� ����
		s1 = s1.replaceFirst("o", "O"); //ù ��° �ҹ��� 'o'�� �빮�� 'O'�� ����
		System.out.println(s1);
		System.out.println("----------");
		
		// 11. toUpperCase(): ���ڿ����� ��� ���ڸ� �빮�ڷ� ����
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println("----------");
		
		// 12. toLowerCase(): ���ڿ����� ��� ���ڸ� �ҹ��ڷ� ����
		s1 = s1.toLowerCase();
		System.out.println(s1);
		System.out.println("----------");
		
		// 13. trim(): ���ڿ��� �յ��� ������ ����, �߰��� �ִ� ������ �������� ����
		String s2 = "     Hello     Java     ";
		System.out.println(s2 + "*");
		s2 = s2.trim();
		System.out.println(s2 + "*");
		System.out.println("----------");
		
		// 14. equals(s): ���ڿ��� ���� ���Ͽ� true, false�� �˷���
		String s3 = new String("ABC");
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		System.out.println(s3 == s5); // ���ڿ��� ���� ��
		System.out.println(s3.equals(s5)); // ���ڿ��� �� ��
		System.out.println(s3.equals(s4));
		
		// 15. equalsIgnoreCase(): ��ҹ��� ���о��� ��
		String s6 = "abc";
		System.out.println(s3.equals(s6)); //��ҹ��� �����Ͽ� ��
		System.out.println(s3.equalsIgnoreCase(s6));
		
	}
}
