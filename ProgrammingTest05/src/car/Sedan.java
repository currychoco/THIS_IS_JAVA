package car;

public class Sedan extends Car{

	public Sedan(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "�� �ε巴�� �޸��ϴ�.");
	}

	@Override
	public void stop() {	
		System.out.println(this.getName() + "�� ����ϴ�.");
	}
	
	public void sound() {
		System.out.println(this.getName() + "���� ���� ������ �귯 ���ɴϴ�.");
	}
}
