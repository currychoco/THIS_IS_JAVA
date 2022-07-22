

/*
 <lang ��Ű��>
 - �ڹٿ��� �ʼ������� ����ϴ� Ŭ�������� ��Ƴ��� ��Ű��
 - String, System. Object, Math, Exception...
 - lang��Ű�� ���� Ŭ�������� �ʼ������� ����ϰ� �ǹǷ� import�� ���� �ʾƵ� �ڵ����� import�Ͽ� ����ϵ��� ��
 */
import java.lang.String;
import java.lang.System;

public class StringTest02 {
	public static void main(String[] args) {
		/*
		//1�� ��� - ���ڿ��� ������ ������ ���ο� ���ڿ��� �����ϴ� ���� �ƴ϶� ���� ���� �����ϴ� ���
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		*/
		
		//2�� ��� - ���ڿ��� ������ ���Ƶ� �Ź� ���ο� �ν��Ͻ��� �����ϴ� ���
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.toString());
		System.out.println("=============");
		
		//�ǹ���: new�� ���Ӱ� �ν��Ͻ��� ������ s1�� s3�� �ؽ��ڵ尡 �ٸ��� ���;� �ϳ�, ����� ���� ����
		//->String Ŭ�������� hashCode�� �������̵��ؼ� ��� -> ���ڿ��� ���� ���ٸ� ���� �ؽ��ڵ尪�� ����ϵ��� �������̵� ��
		//�ذ�å -> ��¥ hashCode()�� ����ϴ� �޼ҵ带 System.identityHashCode() �޼ҵ带 ����Ͽ� ��¥ �ؽ��ڵ� ���� Ȯ����
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//System.identityHashCode(): ������ �ؽ��ڵ� ���� ���
		System.out.println("============");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));

	}
}
