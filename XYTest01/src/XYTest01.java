
/*
 XY클래스
 1. 인스턴스 변수: 좌표 정수 x, y, 식별번호 - 정수 id
 2. 클래스 변수: 식별번호의 자동 증가 정수 count
 3. 생성자를 통해서 x, y 좌표값을 설정하도록 함 - x, y 좌표의 값이 주어지지 않앗을 때, x의 값만 주어졌을 때,
  x, y 좌표의 값이 모두 주어졌을 때, 인스턴스를 복사하여 생성하도록 하는 것이 모두 가능하도록 생성자를 오버로딩하시오
 4. 클래스 변수를 활용하여 자동으로 증가하는 식별번호를 출력하도록 설정하시오
 5. 좌표값을 출력하는 메소드를 생성하시오. 좌표값의 형태는 No. 1 : (10, 20)
 6. 메인 메서드에서 각각의 생성자를 활용하는 인스턴스를 생성하고, 좌표값을 출력하도록 하시오
 */
class XY{
	private static int count = 0;
	private int x = 0;
	private int y = 0;
	private int id = 0;
	
	/*
	 인스턴스 초기화 블럭, 비정적 초기화 블럭, 인스턴스 초기자, 비정적 초기자
	 동작시점: 생성자의 호출 직전에 동작
	 사용목적: 모든 생성자에서 공통적으로 해야할 일을 설정하고자 할 때 사용
	{
		id = ++count;
	}
	*/
	
	public XY() {
		++count;
		id = count;
	}
	public XY(int x) {
		this();
		this.x = x;
	}
	public XY(int x, int y) {
		this(x);
		this.y = y;
	}
	public XY(XY xy) {
		this(xy.x, xy.y);
	}
	
	public static void showCount() {
		System.out.println("좌표 생성 개수: " + count);
	}
	
	public String toString() {
		return "No " + id + " : (" + x + ", "+  y +")";
	}
	
}

public class XYTest01 {
	public static void main(String[] args) {
		XY xy1 = new XY();
		XY xy2 = new XY(10);
		XY xy3 = new XY(100, 200);
		XY xy4 = new XY(xy3);
		
		System.out.println(xy1.toString());
		System.out.println(xy2.toString());
		System.out.println(xy3.toString());
		System.out.println(xy4.toString());
		
		XY.showCount(); 
		
	}
}
