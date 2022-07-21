package shape;

abstract public class AbstractLine extends Shape{
	private int length;
	
	public AbstractLine(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
}
