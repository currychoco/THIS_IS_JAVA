
//�߻� Ŭ���� - �߻� �޼ҵ尡 �ִٸ� �ݵ�� �߻� Ŭ������ �Ǿ�� ��
abstract class A{
	public abstract void a(); //�߻� �޼ҵ�
}


class B extends A{ 
	@Override
	public void a() {} //���߻� �޼ҵ� - �θ� Ŭ������ �߻� �޼ҵ带 �������̵�
}

//�߻� Ŭ���� - �߻� �޼ҵ尡 ��� �߻� Ŭ������ �� �� ����
abstract class C extends A{
	@Override
	public void a() {} //���߻� �޼ҵ� - �θ� Ŭ������ �߻� �޼ҵ带 �������̵�
}

//���߻� Ŭ���� - CŬ������ ���߻� �޼ҵ带 �������̵� ���� �ʾƵ� ��
class D extends C{
	
}
public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}
