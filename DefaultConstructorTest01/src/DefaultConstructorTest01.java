//import java.lang.Object;

/*
 Object Ŭ����
 -�ڹ��� ��� Ŭ�������� ���� ����� ����� ���� �θ� Ŭ����
 -�ٸ� Ŭ�����κ��� ��ӹ��� ���� ��� Ŭ������ �θ� Ŭ������ ��
 -�������� �������� �߿��� ������ ��
 -java.lang ��Ű�� �ȿ� ����
 -11���� �޼ҵ带 ����
 -clone(), equals(), finalize(), getClass(), hashCode(), notify(), notifyAll(), toString(), 3������ wait()<-�����ε� �Ǿ� ����
 */

class A /*extends Object*/{
	private int a;
	
	public A() {
		super();//������Ʈ
		a = 100;
	}
	
	public int getA() {
		return a;
	}
}

class B extends A{
	public B() {
		super();
	}
}

public class DefaultConstructorTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println(x.getA());
	}
}
