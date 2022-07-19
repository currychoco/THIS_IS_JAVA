/*
 <상속 관계에서의 클래스 명칭>
 상속을 하는 클래스 - 부모 클래스, 기반(기본, base) 클래스, 상위 클래스, 슈퍼(super) 클래스
 상속을 받는 클래스 - 자식 클래스, 파생(derived) 클래스,   하위 클래스, 서브(sub) 클래스
 
 1. super(), super.멤버
 - super(): 자식의 생성자에서 부모의 생성자를 호출하는 방법
 - super.멤버 메서드: 자식 클래스에서 부모 클래스의 멤버를 호출하는 방법
 - 주의: super는 바로 위의 부모만 지정함
 
 2. 오버라이딩(Overriding) 
 - 메소드의 재정의 // 오버로딩은 다중정의
 - 상속의 관계에서 부모 클래스의 메소드를 자식 클래스에서 재정의하는 것
 - 주의: 메소드의 이름뿐만 아니라, 매개변수의 개수와 타입, 리턴타입까지 모두 다 일치해야 함
 - 주의: 접근 제한자는 부모 클래스의 메소드보다 동등하거나, 약한 접근 제한자를 사용해야 함
 */


class Point2D{
	//1. protected 접근 권한 자식은 사용할 수 있는 접근 권한 - 추천하지는 않음, 접근 권한의 완화는 캡슐화의 원칙에 위배
	//protected int x;
	//protected int y;
	
	private int x;
	private int y;
	
	public Point2D() {	}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//출력메소드
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
}

//Point3D클래스는 Point2D클래스를 확장함
//-> Point3D 클래스는 Point 2D클래스로부터 모든 것을 상속받음
class Point3D extends Point2D{
	private int z;
	
	//super(): 자식의 생성자에서 부모 클래스의 생성자를 호출하는 방법
	public Point3D(int x, int y, int z) {
		//this.x = x; -> 자식이더라도 private 멤버에 접근 불가
		//this.y = y;
		super(x, y);
		this.z = z;
	}
	
	//getter
	public int getZ() {
		return z;
	}
	
	//setter
	public void setZ(int z) {
		this.z = z;
	}
	
	//출력 메서드
	//오버라이딩(Oberrideing)
	public String toString() {
		return super.toString() + ", z = " + z;
		//return "x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.z;
	}
}

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(50, 60, 70);
		
		//클래스에 toString() 메서드를 생성하면, 출력할 때 인스턴스의 이름만으로 호출이 가능
		System.out.println("Point2D: " + p1);
		System.out.println("Point3D: " + p2);
		//System.out.println("Point2D: " + p1.toString());
		//System.out.println("Point3D: " + p2.toString());
	}
}
