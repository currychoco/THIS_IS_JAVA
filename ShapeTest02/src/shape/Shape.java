package shape;

abstract public class Shape {
	//�߻�޼ҵ�
	public abstract void draw(); 
	//�߻�޼ҵ�
	public abstract String toString();
	
	//���߻�޼ҵ�
	public void print() {
		System.out.println(toString());
		draw();
	}
}