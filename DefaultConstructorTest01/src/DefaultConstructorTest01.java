//import java.lang.Object;

class A /*extends Object*/{
	private int a;
	
	public A() {
		super();
		a = 50;
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
