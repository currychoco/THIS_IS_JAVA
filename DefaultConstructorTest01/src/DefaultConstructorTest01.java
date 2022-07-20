//import java.lang.Object;

/*
 Object 클래스
 -자바의 모든 클래스들을 혈연 관계로 만들기 위한 부모 클래스
 -다른 클래스로부터 상속받지 않은 모든 클래스의 부모 클래스가 됨
 -다형성의 구현에서 중요한 역할을 함
 -java.lang 피키지 안에 있음
 -11개의 메소드를 포함
 -clone(), equals(), finalize(), getClass(), hashCode(), notify(), notifyAll(), toString(), 3가지의 wait()<-오버로딩 되어 있음
 */

class A /*extends Object*/{
	private int a;
	
	public A() {
		super();//오브젝트
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
