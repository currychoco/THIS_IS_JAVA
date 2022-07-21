package test;

import shape.*;

//문제1. Shape의 클래스의 자식 클래스 네 가지의 인스턴스를 배열에 담아서,
//다형성을 구현하여 한꺼번에 출력하도록 하시오
public class ShapeTest01 {
	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[4];
		
		shapes[0] = new Point();
		shapes[1] = new Rectangle(3, 5);
		shapes[2] = new HorizontalLine(5);
		shapes[3] = new VerticalLine(5);
		
		/*
		Shape[] shape = {
				new Point(),
				new Rectangle(3, 5),
				new HorizontalLine(5),
				new VerticalLine(5)	
		};
		*/
		
		/*
		for(int i = 0; i < shape.length; i++) {
			shape[i].print();
			System.out.println();
		}
		*/
		
		for(Shape p : shapes) { //동적 바인딩
			p.print();
			System.out.println();
		}
	}
}
