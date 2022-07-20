package animal;
/*
 1. 추상 메소드
 - 특징
 1) 메소드의 본체가 없음
 2) 메소드 앞에 abstract를 붙임
 - 목적
 1) 자식 클래스에서 부모 클래스의 추상 메소드를 오버라이딩 해야만 인스턴스를 생성할 수 있음,
 	만약 자식클래스에서 부모 클래스의 추상 메소드를 오버라이딩 하지 않으면, 부모의 추상 메소드를 상속받게 되고,
 	자식 클래스는 추상 클래스가 돼야 함. 추상 클래스가 되면 인스턴스를 만들 수 없게 되므로 자식 클래스에서는 추상 메소드를 오버라이딩 해야만 함
 
 2. 추상 클래스
 - 클래스 이름 앞에 abstract를 씀
 - 추상 메소드를 가지면, 무조건 추상 클래스가 되어야 함
 - 추상 메소드가 없어도, 추상 클래스는 될 수 있음
 - 추상 클래스는 인스턴스를 만들 수 없음 - 부모 클래스로 동작하여 다형성을 구현할 목적임이 분명
 
 */

//부모 클래스. 동물 클래스
public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//추상 메소드
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
