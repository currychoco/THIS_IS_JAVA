
abstract class A{
	public abstract void a(); //�߻� �޼ҵ�
	public abstract void b(); //�߻� �޼ҵ�
}

abstract class B extends A{
	@Override
	public void a() {} // �������̵�
}

class C extends B{
	@Override
	public void b() {} // BŬ�������� b�޼ҵ尡 ������ ������ AŬ�����κ��� ��ӹ޾ұ� ������ �߻� �޼ҵ�b�� �ֱ⿡ BŬ������ ��ӹ��� C���� �������̵� �ؾ� ��
}

public class AbstractTest02 {
	public static void main(String[] args) {
		
	}
}
