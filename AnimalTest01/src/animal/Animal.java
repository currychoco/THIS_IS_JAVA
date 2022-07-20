package animal;
/*
 1. �߻� �޼ҵ�
 - Ư¡
 1) �޼ҵ��� ��ü�� ����
 2) �޼ҵ� �տ� abstract�� ����
 - ����
 1) �ڽ� Ŭ�������� �θ� Ŭ������ �߻� �޼ҵ带 �������̵� �ؾ߸� �ν��Ͻ��� ������ �� ����,
 	���� �ڽ�Ŭ�������� �θ� Ŭ������ �߻� �޼ҵ带 �������̵� ���� ������, �θ��� �߻� �޼ҵ带 ��ӹް� �ǰ�,
 	�ڽ� Ŭ������ �߻� Ŭ������ �ž� ��. �߻� Ŭ������ �Ǹ� �ν��Ͻ��� ���� �� ���� �ǹǷ� �ڽ� Ŭ���������� �߻� �޼ҵ带 �������̵� �ؾ߸� ��
 
 2. �߻� Ŭ����
 - Ŭ���� �̸� �տ� abstract�� ��
 - �߻� �޼ҵ带 ������, ������ �߻� Ŭ������ �Ǿ�� ��
 - �߻� �޼ҵ尡 ���, �߻� Ŭ������ �� �� ����
 - �߻� Ŭ������ �ν��Ͻ��� ���� �� ���� - �θ� Ŭ������ �����Ͽ� �������� ������ �������� �и�
 
 */

//�θ� Ŭ����. ���� Ŭ����
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//�߻� �޼ҵ�
	public abstract void bark();
	
	public abstract String toString();
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
}
