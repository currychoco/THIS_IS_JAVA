package car;

public class Sedan extends Car{

	public Sedan(String name) {
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
	
	public void sound() {
		System.out.println(this.getName() + "에서 멋진 음악이 흘러 나옵니다.");
	}
}
