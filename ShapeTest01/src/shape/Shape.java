package shape;

//도형 클래스
//부모 클래스
//추상 클래스
abstract public class Shape {
	//추상메소드
	public abstract void draw(); 
	//추상메소드
	public abstract String toString();
	
	//비추상메소드
	public void print() {
		System.out.println(toString());
		draw();
	}
}
