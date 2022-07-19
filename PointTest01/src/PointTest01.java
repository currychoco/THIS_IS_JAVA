/*
 <��� ���迡���� Ŭ���� ��Ī>
 ����� �ϴ� Ŭ���� - �θ� Ŭ����, ���(�⺻, base) Ŭ����, ���� Ŭ����, ����(super) Ŭ����
 ����� �޴� Ŭ���� - �ڽ� Ŭ����, �Ļ�(derived) Ŭ����,   ���� Ŭ����, ����(sub) Ŭ����
 
 1. super(), super.���
 - super(): �ڽ��� �����ڿ��� �θ��� �����ڸ� ȣ���ϴ� ���
 - super.��� �޼���: �ڽ� Ŭ�������� �θ� Ŭ������ ����� ȣ���ϴ� ���
 - ����: super�� �ٷ� ���� �θ� ������
 
 2. �������̵�(Overriding) 
 - �޼ҵ��� ������ // �����ε��� ��������
 - ����� ���迡�� �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� �������ϴ� ��
 - ����: �޼ҵ��� �̸��Ӹ� �ƴ϶�, �Ű������� ������ Ÿ��, ����Ÿ�Ա��� ��� �� ��ġ�ؾ� ��
 - ����: ���� �����ڴ� �θ� Ŭ������ �޼ҵ庸�� �����ϰų�, ���� ���� �����ڸ� ����ؾ� ��
 */


class Point2D{
	//1. protected ���� ���� �ڽ��� ����� �� �ִ� ���� ���� - ��õ������ ����, ���� ������ ��ȭ�� ĸ��ȭ�� ��Ģ�� ����
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
	
	//��¸޼ҵ�
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
}

//Point3DŬ������ Point2DŬ������ Ȯ����
//-> Point3D Ŭ������ Point 2DŬ�����κ��� ��� ���� ��ӹ���
class Point3D extends Point2D{
	private int z;
	
	//super(): �ڽ��� �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ϴ� ���
	public Point3D(int x, int y, int z) {
		//this.x = x; -> �ڽ��̴��� private ����� ���� �Ұ�
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
	
	//��� �޼���
	//�������̵�(Oberrideing)
	public String toString() {
		return super.toString() + ", z = " + z;
		//return "x = " + this.getX() + ", y = " + this.getY() + ", z = " + this.z;
	}
}

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(50, 60, 70);
		
		//Ŭ������ toString() �޼��带 �����ϸ�, ����� �� �ν��Ͻ��� �̸������� ȣ���� ����
		System.out.println("Point2D: " + p1);
		System.out.println("Point3D: " + p2);
		//System.out.println("Point2D: " + p1.toString());
		//System.out.println("Point3D: " + p2.toString());
	}
}
