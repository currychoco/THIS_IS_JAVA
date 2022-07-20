package pet;

public class RobotPet extends Pet{
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	@Override
	public void introduce() {
		System.out.println("������ �κ��Դϴ�. �̸��� " + getName() + "�Դϴ�.");
		System.out.println("�����δ��� �̸��� " + getMasterName());
	}
	
	//���� �ϴ� �߰��ϴ� �޼ҵ�
	public void work(int w) {
		switch(w) {
		case 1:
			System.out.println("û�Ҹ� �մϴ�");
			break;
		case 2: 
			System.out.println("������ �մϴ�.");
			break;
		case 3: 
			System.out.println("���� �����ϴ�.");
			break;
		
		}
	}
}
