package animal;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age){
		super(name);
		this.age = age;
	}
	
	@Override
	public void bark() {
		System.out.println("야옹@@@");
	}
	
	@Override
	public String toString() {
		return "내 이름은 " + getName() + ", 나이는 " + age + "살입니다.";
	}
	
	//getter
	public int getAge() {
		return age;
	}
}