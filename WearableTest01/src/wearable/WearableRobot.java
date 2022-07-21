package wearable;

public class WearableRobot implements Wearable, Color{
	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}

	@Override
	public void putOn() {
		System.out.println(toString() + "장착~~~");
	}
	
	@Override
	public void putOff() {
		System.out.println(toString() + "해제~~~");
	}
	
	@Override
	public void changeColor(int color) {
		this.color = color;
	}
	
	//Color.을 생략하고 그냥 RED, BLUE, GREEN으로 사용 가능
	//이유는 WearableRobot클래스는 Color 인터페이스를 구현하고 있기 때문
	public String toString() {
		switch(color) {
		case RED: return "빨간 로봇";
		case BLUE: return "파란 로봇";
		case GREEN: return "초록 로봇";
		default: return "깡통 로봇";
		}
	}
	
}
