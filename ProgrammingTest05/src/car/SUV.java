package car;

public class SUV extends Car{
	
	public SUV(String name) {
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
	
	public void safe() {
		System.out.println(this.getName() + "�� �����ϰ� ������ �� �ֽ��ϴ�.");
	}
}
