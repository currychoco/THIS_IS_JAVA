package test;

import player.*;

//����)
//1. Player �������̽��� �迭�� ����, CDPlayerVideoPlayer �ν��Ͻ��� ��2������ �����Ͻÿ�
//2. �������� �����Ͽ� Player�迭�� ������ ����Ͻÿ�
//3. CDPlayer, VideoPlayer Ŭ������ �� Ư¡�� ��Ÿ���� �޼ҵ嵵 �Բ� ����Ͻÿ�

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
