package shape;

public class Parallelogram extends Shape implements Plane2D{
	private int width;
	private int height;
	
	public Parallelogram(int width, int heihgt) {
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
		
			for(int z = 1; z <= height - i; z++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
		for(int i = 0; i < height; i ++) {
			for(int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		
	
	@Override
	public String toString() {
		return "Parallelogram(width:" + width + ", hieght: " + height + ")";
	}
	
	@Override
	public int getArea() {
		int area = width * height;
		return area;
	}

}
