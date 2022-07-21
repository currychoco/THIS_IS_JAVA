package shape;
//��Ӱ� ������ ���� Ŭ�������� ����, ����� �������� ���� ���־�� ��
public class Rectangle extends Shape implements Plane2D{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int heihgt) {
		this.width = width; //���� ��
		this.height = heihgt; // ���� ��
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
