
//클래스 변수와 클래스 메소드의  사용 범위 테스트
//인스턴스 메소드에서는 인스턴스 변수, 클래스 변수, 인스턴스 메소드, 클래스 메소드 모두 사용 가능
//클래스 메소드에서는 클래스 변수, 클래스 메소드는 사용 가능하나, 인스턴스 변수와 인스턴스 메소드는 사용이 불가함
class Static{
	private static int s; //클래스변수, 정적 필드
	private int i; //인스턴스 변수, 비정적 필드
	
	//클래스 메소드, 정적 메소드
	public static void sm1() {	}
	
	//중요 - 클래스 메서드에서의 클래스 변수, 인스턴스 변수, 클래스 메서드, 인스턴스 메서드의 사용 가능 여부
	public static void sm2(int x) {
		s = x;//클래스 변수는 사용 가능
		//i = x;//인스턴스 변수는 사용 불가
		sm1();//클래스 메서드는 사용 가능
		//im1();//인스턴스 메서드는 사용 불가
	}
	
	//인스턴스 메소드, 비정적 메소드
	public void im1() {	}
	
	public void im2(int x) {
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	//getter
	public static int getS() {
		return s;
	}
	
	public int getI() {
		return i;
	}
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		Static.sm2(20);
		
		System.out.println("s1의 i: " + s1.getI());
		System.out.println("s2의 i: " + s2.getI());
		System.out.println("s3의 i: " + s3.getI());
		
		System.out.println("Static의 s: " + Static.getS());
	}
}
