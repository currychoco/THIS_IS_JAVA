
/*
 <ȸ�� Ŭ����>
 1. Ŭ������: Member
 2. �������: ȸ����ȣ(no), ȸ���̸�(name), ȸ������(age), private���� ����
 3. ������: �ν��Ͻ��� ���� �� �ʱ�ȭ �� �� �ִ� ������, public���� ����
 4. getter/setter �޼ҵ� ����, public���� ����
 5. main �޼ҵ忡�� Member Ŭ������ ���� �ν��Ͻ��� 5�� ���� �� ������ ����Ͻÿ�
*/

class Member{
	
	//������� -> �ʵ�(field)
	private String no;
	private String name;
	private int age;
	
	//�Ű������� �ִ� ������ -> ������ �����ε�
	public Member(String no, String name, int age){
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void showInfo() {
		System.out.println("��ȸ�� ���� ���");
		System.out.println("  ȸ����ȣ: " + no);
		System.out.println("  ȸ���̸�: " + name);
		System.out.println("  ȸ������: " + age);
		System.out.println();
	}
}
public class MemberTest01 {
	public static void main(String[] args) {
		
		/*
		//�ν��Ͻ� �迭
		Member[] members = new Member[5]; //Member���� �迭�� �������� members;
		members[0] = new Member("1", "�쿵��", 27);
		members[1] = new Member("2", "����ȣ", 29);
		members[2] = new Member("3", "����", 43);
		members[3] = new Member("4", "�챤ȣ", 52);
		members[4] = new Member("5", "�Ѽ���", 50);		
		*/
		
		/*
		//�ν��Ͻ� �迭 2��
		Member[] members = {
				new Member("1", "�쿵��", 27),
				new Member("2", "����ȣ", 29),
				new Member("3", "����", 43),
				new Member("4", "�챤ȣ", 52),
				new Member("5", "�Ѽ���", 50)
		};
		*/
		
		Member[] members;
		members = new Member[]{
				new Member("1", "�쿵��", 27),
				new Member("2", "����ȣ", 29),
				new Member("3", "����", 43),
				new Member("4", "�챤ȣ", 52),
				new Member("5", "�Ѽ���", 50)
		};
		
		/*
		Member m1 = new Member("1", "�쿵��", 27);
		Member m2 = new Member("2", "����ȣ", 29);
		Member m3 = new Member("3", "����", 43);
		Member m4 = new Member("4", "�챤ȣ", 52);
		Member m5 = new Member("5", "�Ѽ���", 50);
		*/
		
		/*
		for(int i = 0; i < members.length; i++) {
			members[i].showInfo();
		}
		*/
		
		for(Member m: members) {
			m.showInfo();
		}
		
		
		/*
		System.out.println("��ȸ�� 1 ����\n");
		System.out.println("ȸ��id: " + m1.getNo() + "\nȸ���̸�: " + m1.getName() + "\nȸ������: " + m1.getAge());
		
		System.out.println("\n��ȸ�� 2 ����");
		System.out.println("nȸ��id: " + m2.getNo() + "\nȸ���̸�: " + m2.getName() + "\nȸ������: " + m2.getAge());
		
		System.out.println("\n��ȸ�� 3 ����");
		System.out.println("ȸ��id: " + m3.getNo() + "\nȸ���̸�: " + m3.getName() + "\nȸ������: " + m3.getAge());
		
		System.out.println("\n��ȸ�� 4 ����");
		System.out.println("ȸ��id: " + m4.getNo() + "\nȸ���̸�: " + m4.getName() + "\nȸ������: " + m4.getAge());
		
		System.out.println("\n��ȸ�� 5 ����");
		System.out.println("ȸ��id: " + m5.getNo() + "\nȸ���̸�: " + m5.getName() + "\nȸ������: " + m5.getAge());
		*/
		
		/*
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
		m4.showInfo();
		m5.showInfo();
		*/
		
	}
}
