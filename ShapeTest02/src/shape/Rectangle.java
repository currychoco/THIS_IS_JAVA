package shape;
//상속과 구현은 같은 클래스에서 가능, 상속을 구현보다 먼저 써주어야 함
public class Rectangle extends Shape implements Plane2D{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int heihgt) {
		this.width = width; //가로 열
		this.height = heihgt; // 세로 행
	}
	
	//getter
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	@Override
	public void draw() {
		for(int i = 1; i <= height;i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	@Override
	public String toString() {
		return "Rectangle(width:" + width + ", hieght: " + height + ")";
	}
	
	@Override
	public int getArea() {
		int area = width * height;
		return area;
	}
}
