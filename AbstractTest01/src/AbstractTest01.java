
//추상 클래스 - 추상 메소드가 있다면 반드시 추상 클래스가 되어야 함
abstract class A{
	public abstract void a(); //추상 메소드
}


class B extends A{ 
	@Override
	public void a() {} //비추상 메소드 - 부모 클래스의 추상 메소드를 오버라이딩
}

//추상 클래스 - 추상 메소드가 없어도 추상 클래스가 될 수 있음
abstract class C extends A{
	@Override
	public void a() {} //비추상 메소드 - 부모 클래스의 추상 메소드를 오버라이딩
}

//비추상 클래스 - C클래스의 비추상 메소드를 오버라이딩 하지 않아도 됨
class D extends C{
	
}
public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}
