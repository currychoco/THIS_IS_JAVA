package car;

public class Truck extends Car{

	public Truck(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "가 짐을 싣고 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(this.getName() + "가 멈춥니다.");
	}
	
	public void load() {
		System.out.println(this.getName() + "는 많은 짐을 실을 수 있습니다.");
	}
	
}
