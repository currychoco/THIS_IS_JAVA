package test;

import shape.HorizontalLine;
import shape.Parallelogram;
import shape.Plane2D;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;

/*
 <도형 프로젝트>
 1. draw, toString 추상 메소드, print비추상 메소드를 가지는 Shape 추상 클래스를 생성하시오
 2. Shape 클래스를 상속하는 Point 클래스를 추가하시오
 3. Shape 클래스를 상속하는 Rectangle 클래스를 추가하시오
 4. Shape 클래스를 상속하고, HorizontalLine 클래스, VerticalLine 클래스의 부모가
 	되는 AbstractLine 클래스를 추가하시오
 5.AbstractLine 클래스를 상속하는 HorizontalLine 클래스를 추가하시오
 6.AbstractLine 클래스를 상속하는 VerticalLine 클래스를 추가하시오
 7. main 메소드에서 Point, Rectangle, HorizontalLine, VerticalLine 클래스의
 	인스턴스를 만들어 다형성을 구현하여 일괄처리하도록 하시오
 	==============================
 8. 도형의 면적을 계산하는 getArea 메소드를 갖는 인터페이스 Plane2D를 추가하시오
 9. Rectangle 클래스에서 Plane2D 인터페이스를 구현하시오
 10. Parallelogram(평행사변형) 클래스를 추가하고, Shape를 상속하고,
 	Plane2D를 구현하도록 하시오
 11. main 메소드에서 Point, Rectangle, HorizeontalLine, VerticalLine,
 	Parallelogram 클래스의 인스턴스를 만들어 다형성을 구현하여 일괄처리하도록 하시오
 12. 면적을 계산할 수 있는 클래스인 Rectangle, Parallelogram 클래스의 인스턴스를
 	출력할 때는 면적도 함꼐 출력하도록 하시오
 
 */
public class ShapeTest02 {
	public static void main(String[] args) {
Shape[] shapes = new Shape[5];
		
		shapes[0] = new Point();
		shapes[1] = new Rectangle(3, 5);
		shapes[2] = new HorizontalLine(5);
		shapes[3] = new VerticalLine(5);
		shapes[4] = new Parallelogram(4, 3);
		
		
		for(Shape p : shapes) { //동적 바인딩
			p.print();
			if(p instanceof Plane2D) {
				System.out.println("면적: " + ((Plane2D)p).getArea());
			}
			System.out.println();
		}
	}
}
