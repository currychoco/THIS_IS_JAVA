package test;

import shape.HorizontalLine;
import shape.Parallelogram;
import shape.Plane2D;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;

/*
 <���� ������Ʈ>
 1. draw, toString �߻� �޼ҵ�, print���߻� �޼ҵ带 ������ Shape �߻� Ŭ������ �����Ͻÿ�
 2. Shape Ŭ������ ����ϴ� Point Ŭ������ �߰��Ͻÿ�
 3. Shape Ŭ������ ����ϴ� Rectangle Ŭ������ �߰��Ͻÿ�
 4. Shape Ŭ������ ����ϰ�, HorizontalLine Ŭ����, VerticalLine Ŭ������ �θ�
 	�Ǵ� AbstractLine Ŭ������ �߰��Ͻÿ�
 5.AbstractLine Ŭ������ ����ϴ� HorizontalLine Ŭ������ �߰��Ͻÿ�
 6.AbstractLine Ŭ������ ����ϴ� VerticalLine Ŭ������ �߰��Ͻÿ�
 7. main �޼ҵ忡�� Point, Rectangle, HorizontalLine, VerticalLine Ŭ������
 	�ν��Ͻ��� ����� �������� �����Ͽ� �ϰ�ó���ϵ��� �Ͻÿ�
 	==============================
 8. ������ ������ ����ϴ� getArea �޼ҵ带 ���� �������̽� Plane2D�� �߰��Ͻÿ�
 9. Rectangle Ŭ�������� Plane2D �������̽��� �����Ͻÿ�
 10. Parallelogram(����纯��) Ŭ������ �߰��ϰ�, Shape�� ����ϰ�,
 	Plane2D�� �����ϵ��� �Ͻÿ�
 11. main �޼ҵ忡�� Point, Rectangle, HorizeontalLine, VerticalLine,
 	Parallelogram Ŭ������ �ν��Ͻ��� ����� �������� �����Ͽ� �ϰ�ó���ϵ��� �Ͻÿ�
 12. ������ ����� �� �ִ� Ŭ������ Rectangle, Parallelogram Ŭ������ �ν��Ͻ���
 	����� ���� ������ �Բ� ����ϵ��� �Ͻÿ�
 
 */
public class ShapeTest02 {
	public static void main(String[] args) {
Shape[] shapes = new Shape[5];
		
		shapes[0] = new Point();
		shapes[1] = new Rectangle(3, 5);
		shapes[2] = new HorizontalLine(5);
		shapes[3] = new VerticalLine(5);
		shapes[4] = new Parallelogram(4, 3);
		
		
		for(Shape p : shapes) { //���� ���ε�
			p.print();
			if(p instanceof Plane2D) {
				System.out.println("����: " + ((Plane2D)p).getArea());
			}
			System.out.println();
		}
	}
}
