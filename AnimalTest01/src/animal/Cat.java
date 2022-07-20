package animal;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age){
		super(name);
		this.age = age;
	}
	
	@Override
	public void bark() {
		System.out.println("�߿�@@@");
	}
	
	@Override
	public String toString() {
		return "�� �̸��� " + getName() + ", ���̴� " + age + "���Դϴ�.";
	}
	
	//getter
	public int getAge() {
		return age;
	}
}