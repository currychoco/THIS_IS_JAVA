package player;

/*
 자바의 다중 상속
 1. 자바에서는 부모 클래스가 2개 이상이 되는 다중 상속은 불가
 2. 2개 이상의 인터페이스를 구현하는 다중 구현은 가능
 */
public class PortablePlayer implements player, Skinnable{

	@Override
	public void play() {
		System.out.println("◈포터블 플레이어 재생...");
	}
	
	@Override
	public void stop() {
		System.out.println("◈포터블 플레이어 중지...");
	}
	
	@Override
	public void changeSkin(int skin) {
		switch(skin) {
		case 1:
			System.out.print("빨간색");
			break;
		case 2:
			System.out.print("파란색");
			break;
		case 3:
			System.out.print("초록색");
			break;
		case 4:
			System.out.print("검정색");
			break;
		case 5: 
			System.out.print("레오파드");
			break;
		default:
			System.out.print("흰색");
			break;
		}
		System.out.print("으로 변경하였습니다.");
	}
}
