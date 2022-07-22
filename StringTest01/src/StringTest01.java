/*
 JVM(Jav Virtual Machine, �ڹ� ���� �ӽ�)
 - �ڹ� ���α׷��� ������ �� ���������� �Բ� �����ϴ� ���μ���
 - ����: �޸� ����, ���ܿ� ���� ����...
 
 - JVM �ȿ� Garbage Collector�� ���α׷��� ���� �߿� �������� �޸𸮸� ����
 - Garbage Collector�� �������� �޸��� ������ ȸ���Ͽ� ��Ȱ�� �� �� �ֵ��� ��
 - Garbage Collection
 */

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; //���ο� ���ڿ��� �����ϴ� ���� �ƴ϶�, ������ �ִ� ���ڿ��� ����
		String s4 = "DEF";
		s4 = s1; //s4�� s1�� �����ϴ� ���� �Բ� �����ϰ� ��// ������ �����Ͱ� ������ -> ������ �÷��Ͱ� �ȳ�
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("==========");
		//�ؽ��ڵ�(hashcode) - �� �ν��Ͻ��� ������ ������ ���̵�
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}
}
