package player;

//VideoPlayerŬ������ Player �������̽��� ������
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
		System.out.println("�� ���� ���� ��ȣ: " + id);
	}
	
	@Override 
	public void play() {
		System.out.println("�� ���� ��� ����...");
	}
	
	@Override
	public void stop() {
		System.out.println("�� ���� ��� ����...");
	}
}
