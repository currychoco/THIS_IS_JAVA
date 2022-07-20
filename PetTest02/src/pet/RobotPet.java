package pet;

public class RobotPet extends Pet{
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	@Override
	public void introduce() {
		System.out.println("◎저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎주인님의 이름은 " + getMasterName());
	}
	
	//일을 하는 추가하는 메소드
	public void work(int w) {
		switch(w) {
		case 1:
			System.out.println("청소를 합니다");
			break;
		case 2: 
			System.out.println("빨래를 합니다.");
			break;
		case 3: 
			System.out.println("밥을 짓습니다.");
			break;
		
		}
	}
}
