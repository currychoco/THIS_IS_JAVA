package wearable;

public class WearableRobot implements Wearable, Color{
	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}

	@Override
	public void putOn() {
		System.out.println(toString() + "����~~~");
	}
	
	@Override
	public void putOff() {
		System.out.println(toString() + "����~~~");
	}
	
	@Override
	public void changeColor(int color) {
		this.color = color;
	}
	
	//Color.�� �����ϰ� �׳� RED, BLUE, GREEN���� ��� ����
	//������ WearableRobotŬ������ Color �������̽��� �����ϰ� �ֱ� ����
	public String toString() {
		switch(color) {
		case RED: return "���� �κ�";
		case BLUE: return "�Ķ� �κ�";
		case GREEN: return "�ʷ� �κ�";
		default: return "���� �κ�";
		}
	}
	
}
