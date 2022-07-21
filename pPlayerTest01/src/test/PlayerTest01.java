package test;

import player.*;

//문제)
//1. Player 인터페이스의 배열을 만들어서, CDPlayerVideoPlayer 인스턴스를 각2개씩을 저장하시오
//2. 다형성을 구현하여 Player배열의 내용을 출력하시오
//3. CDPlayer, VideoPlayer 클래스의 각 특징들 나타내는 메소드도 함께 출력하시오

public class PlayerTest01 {
	public static void main(String[] args) {
		Player[] players = {
				new CDPlayer(),
				new VideoPlayer(),
				new CDPlayer(),
				new VideoPlayer(),	
		};
		
		for(Player p : players) {
			p.play();
			p.stop();
			if(p instanceof CDPlayer) {
				((CDPlayer) p).clean();
			}
			if(p instanceof VideoPlayer) {
				((VideoPlayer) p).printInfo();
			}
			System.out.println();
		}
		
	}
}
