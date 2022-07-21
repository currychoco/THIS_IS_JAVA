package player;

//VideoPlayer클래스는 Player 인터페이스를 구현함
public class VideoPlayer implements Player{
	
	private static int count = 0;
	private int id = 0;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	//getter
	public int getId() {
		return id;
	}
	
	public void printInfo() {
		System.out.println("■ 비디오 제조 번호: " + id);
	}
	
	@Override 
	public void play() {
		System.out.println("■ 비디오 재생 시작...");
	}
	
	@Override
	public void stop() {
		System.out.println("■ 비디오 재생 중지...");
	}
}
