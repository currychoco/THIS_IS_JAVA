package member;

public class SpecialMember extends Member{
	
	private String privilege;

	public SpecialMember(int no, String name, int age, String privilege) {
		super(no, name, age);
		this.privilege = privilege;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	//@: Annotation, �ڹ� �����Ϸ����� �˷��ִ� ������ �ּ�
	//@Override: �� �޼ҵ�� �������̵� �ϴ� �޼ҵ����� �˷���. �������̵��� �߸��� ��� ����ǥ�ø� ��
	@Override
	public String toString() {
		return super.toString() + ", Ư������(" + privilege + ")";
	}
	
}
