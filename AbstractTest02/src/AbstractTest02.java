
abstract class A{
	public abstract void a(); //추상 메소드
	public abstract void b(); //추상 메소드
}

abstract class B extends A{
	@Override
	public void a() {} // 오버라이딩
}

class C extends B{
	@Override
	public void b() {} // B클래스에는 b메소드가 보이지 않지만 A클래스로부터 상속받았기 때문에 추상 메소드b가 있기에 B클래스를 상속받은 C에서 오버라이딩 해야 함
}

public class AbstractTest02 {
	public static void main(String[] args) {
		
	}
}
