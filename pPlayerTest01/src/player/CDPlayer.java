package player;

//CDPlayer 클래스는 Player 인터페이스를 구현함
public class CDPlayer implements Player{
	
	@Override
	public void play() {
		System.out.println("◎ CD 플레이어 재생~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("◎ CD 플레이어 중지~~~");
	}
	
	//CD 헤드 청소 기능 - 추가 메소드
	public void clean() {
		System.out.println("◎ CD 플레이어의 헤드를 청소합니다.");
	}
	
}
