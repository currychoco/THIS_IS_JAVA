package animal;

public class Dog extends Animal{
	private String type;
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	@Override
	public void bark() {
		System.out.println("멍멍~~~");
	}
	
	@Override
	public String toString() {
		return "내 이름은 " + getName() + ", 견종은 " + type + "입니다.";
	}
	
	//getter
	public String getType() {
		return type;
	}
}
