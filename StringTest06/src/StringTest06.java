
public class StringTest06 {
	public static void main(String[] args) {
		String s1 = "Hello Java World.hwp";
		
		// 4. endsWith(s): ���ڿ��� Ư�� ���ڿ��� �����°��� ���θ� �˷��ִ� �޼ҵ�
		System.out.println(s1.endsWith("txt"));
		
		if(s1.endsWith("txt")) {
			System.out.println("���ε� �Ǿ����ϴ�.");
		}else {
			System.out.println("���ε� ���� �ʾҽ��ϴ�.");
			System.out.println("���������� txt ���Ϸ� �����Ͽ� ���ε��� �ּ���.");
		}
		
		// 5. startsWith(s): ���ڿ��� Ư�� ���ڿ��� �����ϴ°��� ���θ� �˷��ִ� �޼ҵ�
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		System.out.println("----------");
		
		// 6. indexOf(s): ���ڿ����� Ư�� ���ڿ��� �ε����� �˷���
		//charAt(index): �ε����� �ش��ϴ� ���ڸ� �˷���
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.charAt(6));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("JAVA")); //-1, Ư�� ���ڿ��� ã�� ������ ��, �迭�� �ε����� ������ �� ���� ��
		System.out.println("----------");
		
		// 7. lastIndexOf(s): ���ڿ����� Ư�� ���ڿ��� �ε����� �ڿ������� ã�Ƽ� �˷���
		// indexOf(s): ���ڿ����� Ư�� ���ڿ��� �ε����� �տ������� ã�Ƽ� �˷���
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("Java"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.lastIndexOf("JAVA")); // -1, Ư�� ���ڿ��� ã�� ������ �� 
		System.out.println(s1.lastIndexOf(".")); // 16
	}
}
