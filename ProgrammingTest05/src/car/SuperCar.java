package car;

public class SuperCar extends Car implements Skinnable{

	public SuperCar(String name) {
		super(name);
	}

	@Override
	public void changeSkin(int color) {
		String c;
		switch(color) {
		case RED: c = "빨간색"; break;
		case BLUE: c = "파란색"; break;
		case BLACK: c = "검은색"; break;
		case WHITE: c = "하얀색"; break;
		default: c = "고동색"; break;
		
		}
		System.out.println(this.getName() + "의 색상을 " + c + "으로 변경합니다.");
	}

	@Override
	public void run() {
		System.out.println(this.getName() + "가 터프하게 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(this.getName() + "가 멈춥니다.");
	}
	
	public void turbo() {
		System.out.println(this.getName() + "가 터보 엔진을 가동합니다.");
	}
	
}
