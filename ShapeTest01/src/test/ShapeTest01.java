package test;

import shape.*;

//����1. Shape�� Ŭ������ �ڽ� Ŭ���� �� ������ �ν��Ͻ��� �迭�� ��Ƽ�,
//�������� �����Ͽ� �Ѳ����� ����ϵ��� �Ͻÿ�
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
		
		for(Shape p : shapes) { //���� ���ε�
			p.print();
			System.out.println();
		}
	}
}
