package player;

/*
 <인터페이스 규칙>
 1. 인터페이스 안의 메소드는 추상 메소드만을 갖는다
 2. 인터페이스 안의 추상 메소드는 public abstract를 생략할 수 있음
 3. 인터페이스는 인스턴스를 만들 수 없음
 4. 인터페이스의 배열은 만들 수 있음 -> 다형성 구현
 */

//플레이어 기능: play, stop
public interface Player {
	void play();	
	//public void play()
	//abstract void play();
	//public abstract void play();
	
	public abstract void stop();
}
