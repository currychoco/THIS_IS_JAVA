package car;

public class Truck extends Car{

	public Truck(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "�� ���� �ư� �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println(this.getName() + "�� ����ϴ�.");
	}
	
	public void load() {
		System.out.println(this.getName() + "�� ���� ���� ���� �� �ֽ��ϴ�.");
	}
	
}
