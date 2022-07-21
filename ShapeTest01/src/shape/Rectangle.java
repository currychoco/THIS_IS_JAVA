package shape;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int heihgt) {
		this.width = width; //가로 열
		this.height = heihgt; // 세로 행
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
}
