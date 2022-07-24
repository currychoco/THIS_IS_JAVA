package car;

public class SUV extends Car{
	
	public SUV(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(this.getName() + "가 부드럽게 달립니다.");
	}
	
	@Override
	public void stop() {
		System.out.println(this.getName() + "가 멈춥니다.");
	}
	
	public void safe() {
		System.out.println(this.getName() + "는 안전하게 운전할 수 있습니다.");
	}
}
