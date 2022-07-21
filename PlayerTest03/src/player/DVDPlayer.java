package player;

public class DVDPlayer implements ExtentedPlayer{
	
	@Override
	public void play() {
		System.out.println("◎ DVD 플레이어 재생...");
	}
	
	@Override
	public void stop() {
		System.out.println("◎ DVD 플레이어 중지...");
	}
	
	@Override
	public void fast() {
		System.out.println("◎ DVD 플레이어 2배속 보기...");
	}
	
	@Override
	public void slow() {
		System.out.println("◎ DVD 플레이어 0.5배속 보기...");
	}
}
