package shape;

public class VerticalLine extends AbstractLine {

	public VerticalLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.println("*");
	}

	@Override
	public String toString() {
		return "VerticalLine (length: " + getLength() + ")";
	}
}
