package player;

/*
 �ڹ��� ���� ���
 1. �ڹٿ����� �θ� Ŭ������ 2�� �̻��� �Ǵ� ���� ����� �Ұ�
 2. 2�� �̻��� �������̽��� �����ϴ� ���� ������ ����
 */
public class PortablePlayer implements player, Skinnable{

	@Override
	public void play() {
		System.out.println("�����ͺ� �÷��̾� ���...");
	}
	
	@Override
	public void stop() {
		System.out.println("�����ͺ� �÷��̾� ����...");
	}
	
	@Override
	public void changeSkin(int skin) {
		switch(skin) {
		case 1:
			System.out.print("������");
			break;
		case 2:
			System.out.print("�Ķ���");
			break;
		case 3:
			System.out.print("�ʷϻ�");
			break;
		case 4:
			System.out.print("������");
			break;
		case 5: 
			System.out.print("�����ĵ�");
			break;
		default:
			System.out.print("���");
			break;
		}
		System.out.print("���� �����Ͽ����ϴ�.");
	}
}
