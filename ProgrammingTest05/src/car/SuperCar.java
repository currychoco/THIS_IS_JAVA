package car;

public class SuperCar extends Car implements Skinnable{

	public SuperCar(String name) {
		super(name);
	}

	@Override
	public void changeSkin(int color) {
		String c;
		switch(color) {
		case RED: c = "������"; break;
		case BLUE: c = "�Ķ���"; break;
		case BLACK: c = "������"; break;
		case WHITE: c = "�Ͼ��"; break;
		default: c = "����"; break;
		
		}
		System.out.println(this.getName() + "�� ������ " + c + "���� �����մϴ�.");
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "�� �����ϰ� �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(this.getName() + "�� ����ϴ�.");
	}
	
	public void turbo() {
		System.out.println(this.getName() + "�� �ͺ� ������ �����մϴ�.");
	}
	
}
