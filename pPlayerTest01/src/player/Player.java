package player;

/*
 <�������̽� ��Ģ>
 1. �������̽� ���� �޼ҵ�� �߻� �޼ҵ常�� ���´�
 2. �������̽� ���� �߻� �޼ҵ�� public abstract�� ������ �� ����
 3. �������̽��� �ν��Ͻ��� ���� �� ����
 4. �������̽��� �迭�� ���� �� ���� -> ������ ����
 */

//�÷��̾� ���: play, stop
public interface Player {
	void play();	
	//public void play()
	//abstract void play();
	//public abstract void play();
	
	public abstract void stop();
}
